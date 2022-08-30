public class Computer extends Player {
    Brain brain;

    public Computer() {
        brain = new Brain();
    }
    @Override
    String move(int[] gameboard) {
        return null;
    }
}
