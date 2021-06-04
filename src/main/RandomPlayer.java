package src.main;
import java.util.Random;

public class RandomPlayer extends Player {
    private static Random random = new Random();;

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
        int x = 0;
        int y = 0;
        boolean hitCompleted = false;

        while (!hitCompleted) { 
            x = random.nextInt(super.getBoardWidth());
            y = random.nextInt(super.getBoardHeight());
            if (locationsHit[y][x] == -1) { 
                HitResult result = playerToHit.hit(x, y);
                locationsHit[y][x] = result.getResult(); 
                if (result.getResult() == 2) {
                    // TODO: Does not seem to be getting triggered
                    System.out.println("Sunk a ship");
                }
                hitCompleted = true;
            }   
        }

        System.out.println(super.getName() + " x = " + x + " y = " + y);


        
    }

    @Override
    public void initializeBoard() {
        for (Ship ship : ships) {
            boolean placed = false;

            while (!placed) {
                int x = random.nextInt(super.getBoardWidth());
                int y = random.nextInt(super.getBoardHeight());
                int direction = random.nextInt(4);
                placed = place(x, y, direction, ship);
            }
        }

        for (int y = 0; y < super.getBoardHeight(); y++) {
            for (int x = 0; x < super.getBoardWidth(); x++) {
                Pos pos = board.get(x, y);
                if (pos == null) {
                    System.out.print("[ ]");
                } else {
                    System.out.print("[X]");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    
    private boolean place(int x, int y, int direction, Ship ship) {
        int curX = x;
        int curY = y;
        int xItteration = 0;
        int yItteration = 0;

        if (direction == 0) {
            yItteration = 1;
        } else if (direction == 1) {
            xItteration = 1;
        } else if (direction == 2) {
            yItteration = -1;
        } else if (direction == 3) {
            xItteration = -1;
        } else {
            System.out.println("Invalid direction inputted");
        }

        for (int i = 0; i < ship.getSize(); i++) {
            if (curX < 0 || curY < 0 ||curX >= super.getBoardWidth() || 
                curY >= super.getBoardHeight() || board.get(curX, curY) != null) {
                return false;
            }
            curX = curX + xItteration;
            curY = curY + yItteration;
        }

        for (int i = 0; i < ship.getSize(); i++) {
            board.place(x, y, new Pos(ship, i));
            x = x + xItteration;
            y = y + yItteration;
        }
        return true;
    }

}