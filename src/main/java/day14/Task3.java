package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(parseFileToObjList());

    }

    public static List<Human> parseFileToObjList() {
        File file = new File("people");
        List<Human> peopleAge = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] massive = line.split(" ");
                if (Integer.parseInt(massive[1]) < 0) {
                    throw new IllegalArgumentException();
                }
                Human currentHuman = new Human(massive[0], Integer.parseInt(massive[1]));
                peopleAge.add(currentHuman);
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
