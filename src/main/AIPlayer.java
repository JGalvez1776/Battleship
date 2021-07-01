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
    public void initializeBoard() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean place(int x, int y, int direction, Ship ship) {
        // TODO: FILL THIS METHOD
        return false;
    }

    @Override
    public void updateMove(Player playerToHit, int[] move) {
        // TODO Auto-generated method stub
        
    }


}