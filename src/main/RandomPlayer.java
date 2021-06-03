package src.main;
import java.util.Random;

public class RandomPlayer extends Player {

    public RandomPlayer(String name) {
        super(name);
    }

    public RandomPlayer(String name, int boardSize) {
        super(name, boardSize);
    }

    public RandomPlayer(String name, int boardSize, Ship[] ships) {
        super(name, boardSize, ships);
    }

    @Override
    public void move(Player playerToHit) {
        // TODO Auto-generated method stub
    }

    @Override
    public void initializeBoard() {
        // TODO Auto-generated method stub
        
    }


}