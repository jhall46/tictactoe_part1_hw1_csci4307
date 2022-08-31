/**
 * Gameboard - the Gameboard class represents the Tic-Tac-Toe gameboard. The gameboard can be any nxn size.
 */
public class Gameboard {
    int length;
    int width;
    String[][] gameboard;
    public Gameboard(int length, int width) {
        this.length = length;
        this.width = width;
        this.gameboard = new String[length][width];
        buildGameboard();
    }
    private void buildGameboard() {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                gameboard[i][j] = " ";
            }
        }
    }
    public void updateGameboard(String[][] gameboard) {
        this.gameboard = gameboard;
    }
    public String[][] getGameboard() { return gameboard; }
    public void showGameboard() {
        System.out.println();

        // First write the column header
        System.out.print("    ");
        for (int i = 0; i < gameboard[0].length; i++)
            System.out.print(i + "   ");
        System.out.print('\n');

        System.out.println(); // blank line after the header

        // The write the table
        for (int i = 0; i < gameboard.length; i++) {
            System.out.print(i + "  ");
            for (int j = 0; j < gameboard[0].length; j++) {
                if (j != 0)
                    System.out.print("|");
                System.out.print(" " + gameboard[i][j] + " ");
            }

            System.out.println();

            if (i != (gameboard.length - 1)) {
                // separator line
                System.out.print("   ");
                for (int j = 0; j < gameboard[0].length; j++) {
                    if (j != 0)
                        System.out.print("+");
                    System.out.print("---");
                }
                System.out.println();
            }
        }
        System.out.println();
    }
}
