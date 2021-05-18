package src.main;


public abstract class Player {
    private Board board;
    private Ship[] ships;

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