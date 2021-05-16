package src.main;


public abstract class Player {
    private Board board;
    private Ship[] ships;

    public HitResult hit(int x, int y) {
        // This should be the same for any player type. Just makes a hit and return info from the position
        return null;
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