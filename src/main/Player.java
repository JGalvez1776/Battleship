package src.main;


public abstract class Player {
    private Board board;
    private Ship[] ships;
    private String playerName;

    // TODO: Use hits left to keep track of when a player wins.
    private int hitsLeft;

    public Player(String name) {
        this(name, Board.DEFAULT_SIZE);
    }

    public Player(String name, int boardSize) {
        this(name, boardSize, Battleship.defaultShips());
    }

    public Player(String name, int boardSize, Ship[] ships) {
        board = new Board(boardSize);
        this.ships = ships;
        hitsLeft = 0;
        for (Ship ship : ships) {
            if (ship != null) {
                hitsLeft = hitsLeft + ship.getSize();
            }
        }
    }

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

    public Ship[] getShips() {
        return ships;
    }

    public abstract void move();

    public boolean stillAlive() {
        return hitsLeft > 0;
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