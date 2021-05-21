package src.main;

public class Battleship { 

    public static void main(String[] args) {
        
        if (args.length == 0) {
            startDefaultGame();
        }
    }

    private static void startDefaultGame() {
        
    }   

    private static void startGame(Player[] players) {

    }

    public static Ship[] defaultShips() {
        Ship[] ships = new Ship[5];
        ships[0] = new Ship(2);
        ships[1] = new Ship(3);
        ships[2] = new Ship(3);
        ships[3] = new Ship(4);
        ships[4] = new Ship(5);
        return ships;
    }

}
