package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        while (true) {

            String city = scan.nextLine();

            if (city.equals("Stop"))
                break;

                switch (city) {
                    case "Москва":
                    case "Владивосток":
                    case "Ростов":
                    case "Череповец":
                        System.out.println("Россия");
                        break;

                    case "Рим":
                    case "Милан":
                    case "Турин":
                        System.out.println("Италия");
                        break;

                    case "Ливерпуль":
                    case "Манчестер":
                    case "Лондон":
                        System.out.println("Англия");
                        break;

                    case "Берлин":
                    case "Мюнхен":
                    case "Кёльн":
                        System.out.println("Германия");
                        break;

                    default:
                        System.out.println("Неизвестная страна");

                }

            }

        }
    }
