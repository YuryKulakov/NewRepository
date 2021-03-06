package FinalRound;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static final int FIELD = 10;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter players name: ");
        String playerOne = scan.nextLine();
        System.out.println("Welcome on board, captain " + playerOne + "!!!");
        String playerTwo = scan.nextLine();
        System.out.println("Welcome on board, captain " + playerTwo + "!!!");

        int[][] player1 = new int[FIELD][FIELD];
        int[][] player2 = new int[FIELD][FIELD];
        int[][] shipAmount = {{1, 4}, {2, 3}, {3, 2}, {4, 1}};

        System.out.println("___________________________________________");
        System.out.println(playerOne + ", arrange ships" + " \uD83D\uDD50");
        createShips(player1);
        printField(player1);
        System.out.println("___________________________________________");
        System.out.println(playerTwo + ", arrange ships" + " \uD83D\uDD50");
        createShips(player2);
        printField(player2);

        GameLogic(playerOne,playerTwo,player1,player2);
    }

    private static void createShips(int[][] player) {
        int countShip;
        for (int i = 4; i >= 1; i--) {
            countShip = 0;
            if (i == 4) {
                System.out.println("Enter coordinates " + i + "-deck ship (format: x,y;x,y;x,y;x,y;)");
                int g = 0;
                int[] coordinates = new int[i * 2];
                String[] coord = scan.nextLine().split("[\\s,;]+");

                for (String s : coord) {
                    coordinates[g] = Integer.parseInt(s);
                    g++;
                }
                for (int c = 0; c < coordinates.length; c = c + 2) {
                    player[coordinates[c]][coordinates[c + 1]] = 1;
                }
                countShip++;
                System.out.println("Total created " + i + "-deck ship: " + countShip + "/" + (5 - i));
            }
            if (i == 3) {
                System.out.println("Enter coordinates " + i + "-deck ship (format: x,y;x,y;x,y;)");
                for (int j = 0; j < 5 - i; j++) {
                    int g = 0;
                    int[] coordinates = new int[i * 2];
                    String[] coord = scan.nextLine().split("[\\s,;]+");

                    for (String s : coord) {
                        coordinates[g] = Integer.parseInt(s);
                        g++;
                    }
                    for (int c = 0; c < coordinates.length; c = c + 2) {
                        player[coordinates[c]][coordinates[c + 1]] = 1;
                    }
                    countShip++;
                    System.out.println("Total created " + i + "-deck ship: " + countShip + "/" + (5 - i));
                }
            }
            if (i == 2) {
                System.out.println("Enter coordinates " + i + "-deck ship (format: x,y;x,y;)");
                for (int j = 0; j < 5 - i; j++) {
                    int g = 0;
                    int[] coordinates = new int[i * 2];
                    String[] coord = scan.nextLine().split("[\\s,;]+");

                    for (String s : coord) {
                        coordinates[g] = Integer.parseInt(s);
                        g++;
                    }
                    for (int c = 0; c < coordinates.length; c = c + 2) {
                        player[coordinates[c]][coordinates[c + 1]] = 1;
                    }
                    countShip++;
                    System.out.println("Total created " + i + "-deck ship: " + countShip + "/" + (5 - i));
                }
            }
            if (i == 1) {
                System.out.println("Enter coordinates " + i + "-deck ship (format: x,y;)");
                for (int j = 0; j < 5 - i; j++) {
                    int g = 0;
                    int[] coordinates = new int[i * 2];
                    String[] coord = scan.nextLine().split("[\\s,;]+");

                    for (String s : coord) {
                        coordinates[g] = Integer.parseInt(s);
                        g++;
                    }
                    for (int c = 0; c < coordinates.length; c = c + 2) {
                        player[coordinates[c]][coordinates[c + 1]] = 1;
                    }
                    countShip++;
                    System.out.println("?????????? ?????????????? " + i + "-???????????????? ????????????????: " + countShip + "/" + (5 - i));
                }
            }
        }
    }

    private static void printField(int[][] field) {
        for (int[] cells : field) {
            for (int cell : cells) {
                if (cell == 0) {
                    System.out.print("???");
                } else if (cell == -1) {
                    System.out.println("\uD83D\uDFE6");
                } else {
                    System.out.print("\uD83D\uDEE5");
                }
            }
            System.out.println();
        }
    }

    private static void GameLogic(String playerOne, String playerTwo, int[][] field1, int[][] field2) {
        int[][] battleField1 = new int[FIELD][FIELD];
        int[][] battleField2 = new int[FIELD][FIELD];

        String currentPlayerName = playerOne;
        int[][] currentField = field2;
        int[][] currentBattleField = battleField1;

        while (isPlayerAlive(field1) && isPlayerAlive(field2)) {
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
        System.out.println(currentPlayerName + "WINNER!!!");
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

//    private static int distanceShips(){
//
//    }

}