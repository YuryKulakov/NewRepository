package day5;

public class Car {
    private String model;
    private String color;
    private int yearOfCreate;

    public void setModel(String modelCar){
        model = modelCar;

    }
    public String getModel(){
        return model;

    }
    public void setColor(String colorCar){
        color = colorCar;

    }
    public String getColor(){
        return color;

    }
    public void setYearOfCreate(int yoc){
        yearOfCreate = yoc;

    }
    public int getYearOfCreate(){
        return yearOfCreate;

    }
    void present (){
        System.out.println("Вам представлен автомобиль: " + model);
        System.out.println("Цвет: " + color);
        System.out.println("Год выпуска: " + yearOfCreate);
    }
}
