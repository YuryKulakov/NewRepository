package day5;

public class Motorbike {
    String model;
    String color;
    int year;

    public Motorbike (String model, String color, int year){
        this.model = model;
        this.color = color;
        this.year = year;
    }
void present(){
    System.out.println(model);
    System.out.println(color);
    System.out.println(year);
}
}

