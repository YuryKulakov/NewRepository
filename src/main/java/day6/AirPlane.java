package day6;

public class AirPlane {

    String producer;
    int weight, year, length;
    int fuel ;

    public AirPlane (String producer, int year, int length, int weight, int fuel){
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = fuel;
    }
    void info(){
        System.out.println("Изготовитель: " + producer + ", " + "год изготовления: " + year + ", " + "длина: " + length + ", " + "вес: " + weight + ", " + "Количество топлива в баке: " + fuel + ".");
    }
    public int fillUp(int n){
        fuel = fuel + n;
        return fuel;
    }

    public void setProducer(String airProducer){

        producer = airProducer;
    }
    public void setWeight(int airWeight){
        weight = airWeight;
    }
    public void setYear(int airYear){

        year = airYear;
    }
    public void setLength(int airLength){
        length = airLength;
    }
    public void setFuel(int airFuel){

        fuel = airFuel;
    }
    public int getFuel(){

        return fuel;
    }
}
