package day12.task1;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(0,"Hyundai");
        list.add(1,"Mercedes");
        list.add(2,"Lada");
        list.add(3,"Audi");
        list.add(4,"BMW");

        System.out.println(list);

        list.add(2,"Subaru");
        list.remove(0);
        System.out.println(list);


    }
}
