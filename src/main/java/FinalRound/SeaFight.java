package FinalRound;

import java.util.Scanner;

public class SeaFight {
    public static final int FIELD = 10;
    static Scanner scan = new Scanner(System.in);
    public static void createShips(int[][] player) {
        int countShip;
        for (int i = 4; i >= 1; i--) {
            countShip = 0;
            for (int j = 0; j < 5 - i; j++) {

                System.out.println("Введите координаты " + i + "-палубного корабля.");

//                int x2=scan.nextInt();
//                int y2=scan.nextInt();
//                int x3=scan.nextInt();
//                int y3=scan.nextInt();
//                int x4=scan.nextInt();
//                int y4=scan.nextInt();

                for (int q = 0; q < i; q++) {

                    player[scan.nextInt()][scan.nextInt()] = 1;
                }

                countShip++;
                System.out.println("Всего создано " + i + "-палубных кораблей: " + countShip + "/" + (5 - i));
            }
        }

    }

    public static void printField(int[][] field) {
        for (int[] cells : field) {
            for (int cell : cells) {
                if (cell == 0) {
                    System.out.print("⬜");
                } else if(cell==-1) {
                    System.out.println("\uD83D\uDFE6");
                }else{
                    System.out.print("\uD83D\uDEE5");
                }
            }
            System.out.println();
        }
    }

    public static void GameLogic(String playerOne, String playerTwo, int[][] field1, int[][] field2) {
        int[][] battleField1 = new int[FIELD][FIELD];
        int[][] battleField2 = new int[FIELD][FIELD];

        String currentPlayerName = playerOne;
        int[][] currentField = field2;
        int[][] currentBattleField = field1;

        while (isPlayerAlive(field1) && isPlayerAlive(field1)) {
            printField(currentBattleField);
            System.out.println(currentPlayerName + ", please, input x coord of shot");
            int xShot = scan.nextInt();
            System.out.println(currentPlayerName + ", please, input y coord of shot");
            int yShot = scan.nextInt();

            int shotResult = Shot(currentBattleField, currentField, xShot, yShot);
            if (shotResult == 0) {
                currentPlayerName = playerTwo;
                currentField = field1;
                currentBattleField = battleField2;
            }
        }
        System.out.println("************** CONGRATULATIONS ****************");
        System.out.println(currentPlayerName+"WINNER!!!");
    }

    private static int Shot(int[][] currentBattleField, int[][] currentField, int x, int y) {
        if (currentField[x][y] == 1) {
            currentField[x][y] = -1;
            currentBattleField[x][y] = -1;
            System.out.println("Good hit!!!");
            return 1;
        }
        currentBattleField[x][y] = 0;
        System.out.println("MISS!");
        return 0;
    }

    private static boolean isPlayerAlive(int[][] field) {
        for (int[] cells : field) {
            for (int cell : cells) {
                if (1 == cell) {
                    return true;
                }
            }
        }
        return false;
    }
}
