package day7;

public class AirPlane {

   private String producer;
   private int weight, year, length;
   private int fuel ;


    public AirPlane(String producer, int year, int length, int weight, int fuel){
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }
    void info(){
        System.out.println("Изготовитель: " + producer + ", " + "год изготовления: " + year + ", " + "длина: " + length + ", " + "вес: " + weight + ", " + "Количество топлива в баке: " + fuel + ".");
    }
    public void fillUp(int n){
        fuel = fuel + n;

    }
    public String getProducer() {
        return producer;
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
    public int getLength() {
        return length;
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

    public static void compareAirPlanes (AirPlane air1,AirPlane air2) {
        if(air1.getLength() > air2.getLength()){
            System.out.println(air1.getProducer() + " длиннее, чем " + air2.getProducer());
        }else if(air2.getLength() > air1.getLength()){
            System.out.println(air2.getProducer() + " длиннее, чем " + air1.getProducer());
        }else{
            System.out.println("Длины самолетов равны");
        }

    }
}
