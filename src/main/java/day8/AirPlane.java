package day8;

public class AirPlane {

   private String producer;
   private int weight, year, length;
   private int fuel ;

    public AirPlane(String producer, int year, int length, int weight, int fuel){
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = fuel;
    }
    public String toString(){
        return "Изготовитель: " + producer + ", " + "год изготовления: " + year + ", " + "длина: " + length + ", " + "вес: " + weight + ", " + "Количество топлива в баке: " + fuel + ".";
    }

}
