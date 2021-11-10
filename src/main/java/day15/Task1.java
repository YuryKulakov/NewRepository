package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File writeFile = new File("WriteToFile");
        PrintWriter pw = new PrintWriter(writeFile);
        pw.println(parseFileToObjList());
        pw.close();

    }

    public static List<Shoes> parseFileToObjList() {
        File file = new File("C://JavaMarathon2021/src/main/resources/shoes.csv");
        List<Shoes> shoesList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] massiveShoes = line.split(";");
                if (massiveShoes.length != 3) {
                    throw new IllegalArgumentException();
                }
                if (Integer.parseInt(massiveShoes[2]) == 0) {
                    Shoes shoes = new Shoes(massiveShoes[0], Integer.parseInt(massiveShoes[1]), Integer.parseInt(massiveShoes[2]));
                    shoesList.add(shoes);
                }
            }
            return shoesList;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }

}
