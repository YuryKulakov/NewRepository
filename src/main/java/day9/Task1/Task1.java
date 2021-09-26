package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Егор","Группа 104");
        student.groupInfo();
        student.printInfo();

        System.out.println();

        Teacher teacher = new Teacher("Валентина Ивановна","Математика");
        teacher.subjectInfo();
        teacher.printInfo();

    }
}
