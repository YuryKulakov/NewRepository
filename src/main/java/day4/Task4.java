package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        int[] massive = new int[100] ;
        //int[] massive = {1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 3254};
        Random random = new Random();

       for (int i = 0; i < massive.length;i++)

           massive [i] = random.nextInt(10000);

        int maxSum = 0;
        int maxSumIdx = 0;

        for (int i = 0; i < massive.length -2;i++){
            int sumElement = 0;
            for (int j = i; j < i+3;j++) {

                sumElement += massive[j];
            }

                if (maxSum < sumElement) {

                    maxSum = sumElement;

                    maxSumIdx = i;
                }

        }
        System.out.println(maxSumIdx);
        System.out.println(maxSum);
    }

}
