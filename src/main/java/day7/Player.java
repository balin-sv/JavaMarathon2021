package day7;

public class Player {

    public final int MIN_STAMINA = 0;
    public final int MAX_STAMINA = 100;
    private static int countPlayers = 0;
    private int stamina;

    public Player(int stamina) {
        if (countPlayers < 6) {
            countPlayers++;
            this.stamina = stamina;
        } else {
            System.out.println("Команда набрана, игрок отправляется на скамейку запасных");
        }

    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public int getStamina() {
        return stamina;
    }

    public static void run(Player a) {
        if (a.stamina > 0) {
            a.stamina--;
        } else {
            countPlayers--;
            System.out.println("Игрок выбыл из игры");
        }
    }

    public static void info() {
        if (countPlayers != 5) {
            System.out.println("Команды неполные. На поле еще есть " + Math.abs(6 - countPlayers) + " свободных мест");
        }
        if (countPlayers == 5) {
            System.out.println("Команды неполные. На поле еще есть 1 свободное место");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }

}

