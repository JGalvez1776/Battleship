package src.main;

import java.util.LinkedList;
import java.util.List;

public class AIPlayer extends Player {
    private List<Ship> enemyShips;
    private int boardSize;
    private AIView frequenyGrid;


    public AIPlayer(String name) {
        super(name);
    }

    public AIPlayer(String name, int boardSize) {
        super(name, boardSize);
    }

    public AIPlayer(String name, int boardSize, Ship[] ships) {
        super(name, boardSize, ships);
        this.boardSize = boardSize;
        enemyShips = new LinkedList<Ship>();
        for (Ship ship : ships) {
            enemyShips.add(ship);
        }

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

    @Override
    public void moveAftermath(HitResult result) {

    }

    


}