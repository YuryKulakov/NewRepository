package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        Random ran = new Random ();

        int [] massive = new int [100];

        for (int i = 0;i < massive.length; i++)

            massive [i] = ran.nextInt(10000);

            System.out.println(Arrays.toString(massive));

            int counter = 0;

        for (int fe:massive) {

            if (fe % 10 == 0)

                counter++;
        }
        System.out.println(counter);

        int sum = 0;
        for (int fe:massive) {

            if (fe % 10 == 0)

            sum = sum + fe;

        }
        System.out.println(sum);

        int max = 0;

            for (int fe : massive){

                if (fe > max)
                    max = fe;
            }

        System.out.println(max);

        int min = 10000;

        for (int fe : massive){

            if (min > fe)
                min = fe;
        }

        System.out.println(min);
    }
}
