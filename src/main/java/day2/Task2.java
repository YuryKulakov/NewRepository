package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);


        int num1 = scan.nextInt();

        int num2 = scan.nextInt();

        if(num1>=num2) {
            System.out.println("Некорректный ввод");
        }

        for(int i = num1 + 1;i<num2;i++) {

            if(i%5 == 0 && i%10 != 0){

                System.out.print(i + " ");
            }


        }
    }
}
