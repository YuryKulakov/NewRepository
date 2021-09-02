package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        int[][] array = new int[12][8];

        Random random = new Random();

        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(50);
            }

        }

int maxSum =0;
int maxSumIdx = 0;
        for (int i = 0; i < array.length; i++) {

            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {

                sum += array[i][j];
            }

            if (sum > maxSum) {

                maxSum = sum;

                maxSumIdx = i;
            }
        }
        System.out.println(maxSumIdx);

    }
}
