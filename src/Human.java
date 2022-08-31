import java.util.Scanner;

public class Human extends Player {
    @Override
    String[][] move(String[][] gameboard) {
        Scanner sc = new Scanner(System.in);
        boolean done = false;
        int row;
        int col;

        do {
            System.out.println("Enter move as row,col: ");
            String[] coordinates = sc.next().split(",");
            row = Integer.parseInt(coordinates[0]);
            col = Integer.parseInt(coordinates[1]);

            if (gameboard[row][col].equalsIgnoreCase(" ")) {
                gameboard[row][col] = this.symbol;
                done = true;
            }
            else {
                System.out.format("\n-------- Sorry, (%d, %d) is occupied! Please choose again --------\n\n", row, col);
            }
        } while (!done);
        return gameboard;
    }
}
