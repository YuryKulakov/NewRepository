package day14;

import java.io.File;
import java.io.FileNotFoundException;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("test1");
        Total total = new Total();

        total.printSumDigits(file);
    }
}
