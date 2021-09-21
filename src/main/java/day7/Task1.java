package day7;

public class Task1 {
    public static void main(String[] args) {
        AirPlane air = new AirPlane("Boeing",1990,70,183,100);
        AirPlane air2 = new AirPlane("AirBus",1992,73,178,100);
        AirPlane.compareAirPlanes(air,air2);
    }
}