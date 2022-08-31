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

    /**
     * TicTacToe - Initializes the objects for the game.
     * @param length
     * @param width
     */
    public TicTacToe(int length, int width) {
        this.gameboard = new Gameboard(length, width);
        this.computer = new Computer();
        this.human = new Human();
        startGame();
    }
    /**
     * startGame - Acts as the initial entrance of the game. All steps related to larger part of the game
     *             will take place in here.
     */
    private void startGame() {
        Scanner sc = new Scanner(System.in);
        boolean exit = false; //Used to exit the game
        String again = "";
        gameboard.showGameboard(); //Displays the initial gameboard
        //getFirstPlayer(); //Generates random number to assign first player
        //assignSymbol(); //Assigns random symbol, either X or O, to the player

        //Runs the main sequence of the game
        do {
            human.addSymbol("X");
            computer.addSymbol("O");
            human.move(this.gameboard.getGameboard());
            gameboard.showGameboard();
            computer.move(this.gameboard.getGameboard());
            gameboard.showGameboard();
            //if (this.computer.isFirstPlayer()) {

            //}
            //else if (this.human.isFirstPlayer()) {

            //}

            //System.out.println("Player another game (y or n)?");
            //again = sc.next();

            //if (!again.equalsIgnoreCase("y")) {
                //exit = true;
            //}
        } while (!exit);
    }
    /**
     * getGameboardSize - verifies that the input from the user is valid. If an integer is not greater than
     *                    or equal to 3, the user is asked to repeat the steps for giving input.
     */
    public static int getGameboardSize(String type) {
        Scanner input = new Scanner(System.in);
        boolean done = false; //Exits the do-while loop
        int dimension = 0; //Represents a single dimension, such as length or width

        do {
            try {
                do {
                    System.out.format("Enter %s of gameboard: ", type);
                    dimension = input.nextInt();
                    if (dimension < 3)
                        System.out.format("\n%s has to be 3 or more. \nPlease try again.\n\n", type);
                } while (dimension < 3);
            } catch (InputMismatchException e) {
                //If this step is reached then the game will exit. User must enter an integer
                System.out.println("\nLength and width must be integers. Please start program again.\n");
                System.exit(0);
            } finally {
                if (dimension >= 3)
                    done = true;
            }
        } while (!done);

        return dimension;
    }
    public static void main(String[] args) {
        int length = 0, width = 0; //Length and width of the gameboard

        //Runs until the length and width are equal. Must have a square gameboard
        do {
            length = getGameboardSize("Length");
            width = getGameboardSize("Width");
        } while (length != width);

        //Starts the game of tic-tac-toe
        new TicTacToe(length, width);
    }

}
