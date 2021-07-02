package src.main;
import java.util.Random;

public class RandomPlayer extends Player {

    public static Random random = new Random();

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
    public void updateMove(Player playerToHit, int[] move) {
        move[0] = random.nextInt(super.getBoardWidth());
        move[1] = random.nextInt(super.getBoardHeight());
    }

    
    

    

}