import java.util.Random;

public class SnakeLadder {
    int diceRoll() {
        Random random = new Random();
        int num = random.nextInt(6) + 1;
        return num;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder game");
        int pos = 0;
        SnakeLadder sl = new SnakeLadder();
        sl.diceRoll();
    }
}