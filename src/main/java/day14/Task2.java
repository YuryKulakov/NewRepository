package day14;

import java.io.File;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people");
        PeopleTsk2 peopleTsk2 = new PeopleTsk2(file);

        System.out.println(peopleTsk2.parseFileToStringList(file));

    }
}
