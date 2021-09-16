package day6;

import java.sql.SQLOutput;
import java.util.Random;

public class Teacher {

    String name;
    String subject;


    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void setName(String teachName) {
        name = teachName;
    }

    public String getName() {
        return name;
    }

    public void setSubject(String teachSubject) {
        subject = teachSubject;
    }

    public String getSubject() {
        return subject;
    }

    public void evaluate(Student student) {
        int rating;
        String ratingVariate = "";
        Random random = new Random();
        rating = random.nextInt(4) + 2;
        switch (rating) {
            case 2:
                ratingVariate = "Неудовлетворительно";
                break;
            case 3:
                ratingVariate = "Удовлетворительно";
                break;
            case 4:
                ratingVariate = "Хорошо";
                break;
            case 5:
                ratingVariate = "Отлично";
                break;

        }
        System.out.println("Преподаватель " + getName() + " оценил студента с именем " + student.getName() + " по предмету " + getSubject() + " на оценку " + ratingVariate + " .");


    }

}
