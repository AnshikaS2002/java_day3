import java.util.Random;
import java.util.ArrayList;

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

    int totalTurns() {
        int pos = 0;
        SnakeLadder sl = new SnakeLadder();
        ArrayList<Integer> positions = new ArrayList<>();
        positions.add(pos);
        int diceRollCnt = 0;
        int turnCnt = 0;

        while (pos != 100) {
            int diceNum = sl.diceRoll();
            int option = sl.optionGeneration();
            if (option == 1) {
                pos += diceNum;
                turnCnt--;
            } else if (option == 2) {
                pos -= diceNum;
            }
            if (pos < 0)
                pos = 0;
            if (pos > 100)
                pos -= diceNum;
            positions.add(pos);
            diceRollCnt++;
            turnCnt++;
        }
        return turnCnt;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder game");
        SnakeLadder sl = new SnakeLadder();
        int player1TurnCnt = sl.totalTurns();
        int player2TurnCnt = sl.totalTurns();
        if (player1TurnCnt <= player2TurnCnt) // assuming player1 started the game
            System.out.println("player1 won");
        else
            System.out.println("player 2 won");
    }
}