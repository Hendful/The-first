package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomPlayerStamina = random.nextInt(10) + 91;

        Player player1 = new Player(randomPlayerStamina);
        Player player2 = new Player(randomPlayerStamina);
        Player player3 = new Player(randomPlayerStamina);
        Player player4 = new Player(randomPlayerStamina);
        Player player5 = new Player(randomPlayerStamina);
        Player player6 = new Player(randomPlayerStamina);

        Player.info();                                                   //
        System.out.println(player1.getStamina());                        //
        for (int i = 0; i < player1.getStamina(); i = 0) {               //
            player1.run();                                               //     <<< проверка. По моему всё прекрасно!
        }                                                                //
        System.out.println(player1.getStamina());                        //
        Player.info();                                                   //

    }
}

class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;

        if (countPlayers < 6)
            countPlayers++;
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (stamina == 0)
            return;

        stamina--;

        if (stamina == 0)
            countPlayers--;

    }

    public static void info() {
        switch (countPlayers) {
            case 5:
                System.out.println("Команды неполные. На поле 1 свободное место");
                break;
            case 4:
                System.out.println("Команды неполные. На поле 2 свободных места");
                break;
            case 3:
                System.out.println("Команды неполные. На поле 3 свободных места");
                break;
            case 2:
                System.out.println("Команды неполные. На поле 4 свободных места");
                break;
            case 1:
                System.out.println("Команды неполные. На поле 5 свободных мест");
                break;
            default:
                System.out.println("На поле нет свободных мест");
        }
    }
}