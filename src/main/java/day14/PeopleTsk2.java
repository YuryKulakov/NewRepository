package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PeopleTsk2 {

    public PeopleTsk2(File file) {

    }

    public static List<String> parseFileToStringList(File file) {
        try {
            Scanner scanner = new Scanner(file);
            List<String> peopleAge = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] massive = line.split(" ");
                if (Integer.parseInt(massive[1]) < 0) {
                    throw new IllegalArgumentException();
                }
                peopleAge.add(line);
            }
            return peopleAge;

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}

