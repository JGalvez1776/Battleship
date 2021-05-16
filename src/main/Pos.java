package src.main;


public class Pos {
    // TODO: Have this be an int where -1 is no ship. Otherwise the ship is the index in Player.ships
    private int shipIndex;
    private Ship ship;

    // TODO: This may not be needed
    public Pos(Ship ship, int shipIndex) {
        this.ship = ship;
        this.shipIndex = shipIndex;
    }

    /**
     * This constructor initializes an empty posiiton (Has no ship).
     */
    public Pos() {
        this.ship = null;
        this.shipIndex = -1;
    }

}