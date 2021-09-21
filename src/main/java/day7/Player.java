package day7;

public class Player {

    public final int MAX_STAMINA = 100;
    public final int MIN_STAMINA = 0;
    private int stamina;
    private boolean playerInGame;
    public static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
            playerInGame = true;
        }
    }
    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
    public static int getCountPlayers() {
        return countPlayers;
    }

    public static void setCountPlayers(int countPlayers) {
        Player.countPlayers = countPlayers;
    }
    public void run() {
        if (stamina > MIN_STAMINA) {
            stamina--;
            if (stamina == MIN_STAMINA && playerInGame) {
                countPlayers--;
                playerInGame = false;
            }

        }
    }
    public static void info() {
        System.out.println("Игроков на поле: " + countPlayers);
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
