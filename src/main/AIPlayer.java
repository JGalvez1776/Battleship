package src.main;

public class AIPlayer extends Player {

    public AIPlayer(String name) {
        super(name);
    }

    public AIPlayer(String name, int boardSize) {
        super(name, boardSize);
    }

    public AIPlayer(String name, int boardSize, Ship[] ships) {
        super(name, boardSize, ships);
    }

    @Override
    public void updateMove(Player playerToHit, int[] move) {
        // TODO: Have the calculations here
        //for (int[] row : locationsHit) {
        //    System.out.println(Arrays.toString(row));
        //}

        // TODO: Have this do stuff
        move[0] = 0;
        move[1] = 0;
    }


}