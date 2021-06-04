package src.main;


public abstract class Player {
    protected Board board;
    protected Ship[] ships;
    private String playerName;

    // This is to be used to track locations that are hit
    private int[][] locationsHit;

    // TODO: Use hits left to keep track of when a player wins.
    private int hitsLeft;

    /**
     * Overrides of move must:
     *      Call hit on a location in PlayerToHit 
     *      Record the result on LocationHit with the result
     */ 
    public abstract void move(Player playerToHit);
    public abstract void initializeBoard();

    public Player(String name) {
        this(name, Board.DEFAULT_SIZE);
    }

    public Player(String name, int boardSize) {
        this(name, boardSize, Battleship.defaultShips());
    }

    // TODO: Again if I make boards not squares add another constructor
    public Player(String name, int boardSize, Ship[] ships) {
        board = new Board(boardSize);
        this.ships = ships;
        hitsLeft = 0;
        for (Ship ship : ships) {
            if (ship != null) {
                hitsLeft = hitsLeft + ship.getSize();
            }
        }

        locationsHit = new int[boardSize][boardSize];
        for (int i = 0; i < locationsHit.length; i++) {
            for (int j = 0; j < locationsHit[0].length; j++) {
                locationsHit[i][j] = -1;
            }
        }

    }


    public Ship[] getShips() {
        return ships;
    }

    public int getHitStatus(int x, int y) {
        return locationsHit[y][x];
    }

    /*
     * Returns a boolean which is if the player still has an unsunk ship
     */
    public boolean stillAlive() {
        return hitsLeft > 0;
    }

    public int getBoardWidth() {
        return board.getWidth();
    }

    public int getBoardHeight() {
        return board.getHeight();
    }

    /* Returns a HitResult object which provides an int that describes the behavior of a hit 
     * also returns the ship hit if it exists
     */
    public HitResult hit(int x, int y) {
        Pos hitElement = board.get(x, y);
        Ship ship = hitElement.getShip();
        int result = 0;
        if (ship != null) {
            result++;
            if (ship.isSunk()) {
                result++;
            }
        }
        return new HitResult(ship, result);
    }

    public HitResult hit(String command) { 
        int[] positions = Board.convertToCords(command);
        return hit(positions[0], positions[1]);
    }

    public class HitResult {
        private int result;
        private Ship ship;

        public HitResult(Ship ship, int result) {
            this.ship = ship;
            this.result = result;
        }

        public Ship getShip() {
            return this.ship;
        }

        public int getResult() {
            return this.result;
        }

    }
}