/**
 * Player - This class represents a player. A player is represented by a symbol, therefore the player class has a
 *          symbol. The objective of a player is to collect points. Therefore, each player has points.
 */
public abstract class Player {
    public String symbol; //Represents the symbol or character of the player
    public int points; //Holds the total points of the player
    int difficulty;
    /*
        addPoint - increases the total points of the player
     */
    public void addPoint() { points += 1; }
    /*
        removePoint - decreases the total points of the player
     */
    public void removePoint() { points -= 1; }
    /*
        addSymbol - add/changes the symbol of the player
     */
    public void addSymbol(String symbol) { this.symbol = symbol; }
    abstract String move(int[] gameboard);

}
