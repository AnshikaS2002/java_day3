import java.util.Random;

public class SnakeLadder {
    int diceRoll() {
        Random random = new Random();
        int num = random.nextInt(6) + 1;
        return num;
    }

    int optionGeneration() {
        Random random = new Random();
        int option = random.nextInt(3);
        return option;
    }

    void game() {
        int pos = 0;
        SnakeLadder sl = new SnakeLadder();

        while (pos < 100) {
            int diceNum = sl.diceRoll();
            int option = sl.optionGeneration();
            if (option == 1) {
                pos += diceNum;
            } else if (option == 2) {
                pos -= diceNum;
            }
            if (pos < 0) {
                pos = 0;
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder game");
        SnakeLadder sl = new SnakeLadder();
        sl.game();
    }
}