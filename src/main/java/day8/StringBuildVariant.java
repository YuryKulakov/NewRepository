package day8;

public class StringBuildVariant {
    StringBuilder sb = new StringBuilder();

    public void Count() {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i <= 20000; i++) {

            sb.append(i).append(" ");
        }
        System.out.print(sb);
        System.out.println();

        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));
    }
}
