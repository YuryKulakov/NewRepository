package day6;

public class Task2 {
    public static void main(String[] args) {
        AirPlane ap = new AirPlane("Boeing",2010,20000,2500,5000);
        ap.fillUp(50);
        ap.fillUp(500);
        ap.info();


    }
}
