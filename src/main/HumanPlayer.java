package src.main;

import java.util.Scanner;

public class HumanPlayer extends Player {
    Scanner input = new Scanner(System.in);

    public HumanPlayer(String name) {
        super(name);
    }

    public HumanPlayer(String name, int boardSize) {
        super(name, boardSize);
    }

    public HumanPlayer(String name, int boardSize, Ship[] ships) {
        super(name, boardSize, ships);
    }

    // TODO: Implement this
    // @Override
    // public void initializeBoard() {
    //     // TODO Auto-generated method stub
    //     
    // }

    @Override
    public void updateMove(Player playerToHit, int[] move) {
        // TODO: Validate inputs
        System.out.println("Enter x");
        move[0] = input.nextInt();
        System.out.println("Enter y");
        move[1] = input.nextInt();
        
    }


}