package day8;

public class StringVariant {

    public void Meter() {
        long startTime = System.currentTimeMillis();

        for (int i = 0;i<=20000;i++) {

            String x = i + " ";

            System.out.print(x);
        }
        System.out.println();

        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));

    }
}
