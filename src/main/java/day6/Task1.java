package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.info();
        car.setYearOfCreate(2005);
        System.out.println(car.yearDifference(2010));

        Motorbike moto = new Motorbike("Yamaha","Blue",2015);
        moto.info();
        System.out.println(moto.yearDifference(2021));
    }
}
