package day6;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Teacher teach = new Teacher("Наталья Андреевна","Математика");
        Student stud = new Student("Максим Иванов");
        teach.evaluate(stud);

    }
}
