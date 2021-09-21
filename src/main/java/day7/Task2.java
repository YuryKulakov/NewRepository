package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int min = 90;
        int max = 100;
        int diff = max - min;

        Random rand = new Random();
        int i = rand.nextInt(diff + 1);
        i += min;


        Player player1 = new Player(i);
        for (int a=100;a>0;a--)
                player1.run();
        Player player2 = new Player(i);
        for (int a=100;a>0;a--)
            player2.run();
        Player player3 = new Player(i);
        for (int a=100;a>0;a--)
            player3.run();
        Player player4 = new Player(i);
        Player player5 = new Player(i);
        Player player6 = new Player(i);

        Player.info();
    }
}
