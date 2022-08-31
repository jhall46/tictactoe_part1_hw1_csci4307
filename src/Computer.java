import java.util.ArrayList;

public class Computer extends Player {
    Brain brain;

    public Computer() {
        this.brain = new Brain();
        this.previousMoves = new ArrayList<>();
        this.isFirstMove = true;
    }
    @Override
    String[][] move(String[][] gameboard) {
        String move = "";
        int row = 0;
        int col = 0;

        System.out.format("\n<(^_^)> Computer moves to (%d, %d).\n\n", 0, 0);

        if (isFirstMove) {
            //Search for a random move
            this.previousMoves.add(move);
            this.isFirstMove = false;
        }
        else {
            //Play from previous move
        }
        return gameboard;
    }
}
