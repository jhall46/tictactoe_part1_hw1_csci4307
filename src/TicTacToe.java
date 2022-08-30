/**
 * Tic-Tac-Toe - The purpose of this program is to create a first iteration working proof-of-concept of the game of
 *               Tic-Tac-Toe that can be expanded to work even in a 5x5 or larger grid. The objective of the game of
 *               Tic-Tac-Toe is to win by aligning your pieces so that they make a continuous line of three cells
 *               horizontally, vertically, and diagonally. The program will offer the user the option to play against
 *               a computer AI or to watch a game played between two computer AI's.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {
    Gameboard gameboard; //Represents the tictactoe gameboard
    Player computer; //Represents the AI player
    Player human; //Represents the human player
    public TicTacToe(int length, int width) {
        this.gameboard = new Gameboard(length, width);
        this.computer = new Computer();
        this.human = new Human();
        startGame();
    }
    private void startGame() {
        gameboard.showGameboard();
    }

    public static void main(String[] args) {
        int length = 0, width = 0;
        boolean done = false;
        Scanner input = new Scanner(System.in);

        do {
            try {
                do {
                    System.out.print("Enter length of gameboard: ");
                    length = input.nextInt();
                    System.out.print("Enter width of gameboard: ");
                    width = input.nextInt();
                    if (length != width && length != 0 && width != 0)
                        System.out.println("\nGameboard must be a square (nxn). Please try again.\n");
                } while (length != width);
            } catch (InputMismatchException e) {
                System.out.println("\nLength and width must be integers.\n");
            } finally {
                if (length != 0 && width != 0)
                    done = true;
            }
        } while (!done);

        System.out.println("Hello");

        new TicTacToe(length, width);
    }


}
