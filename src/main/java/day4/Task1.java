package day4;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
int count = scan.nextInt();

Random ran = new Random ();
int [] mas = new int [count];

        System.out.println("Введено число " + count + ". Сгенерирован следующий массив: ");

 for (int i = 0;i < mas.length; i++)

     mas [i] = ran.nextInt(10);

     System.out.println(Arrays.toString(mas));
        System.out.println("Информация о массиве:");
        System.out.println("Длинна массива: " + count);

        int counter8 = 0;
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int sum = 0;
        for (int i = 0;i < mas.length;i++) {
            if (mas [i] > 8)
                counter8++;
             if (mas [i] == 1){
                counter1++;
            }
             if (mas [i]%2 == 0){
                counter2++;
            }
             if (mas [i]%2 != 0){
                counter3++;
            }
             sum = sum + mas[i];
            }
        System.out.println("Количество чисел больше 8   : " + counter8);
        System.out.println("Количество чисел равных 1   : " + counter1);
        System.out.println("Количество четных чисел     : " + counter2);
        System.out.println("Количество нечетных чисел   : " + counter3);
        System.out.println("Сумма всех элементов массива: " + sum);


        }
    }

