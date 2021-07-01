package src.main;


// TODO: Make a random class object in the battleship class that everything in the package can use
// Can also make some methods instead to just get random integers between two bounds

public class Battleship { 

    public static void main(String[] args) {
        Player[] players;
        if (args.length == 0) {
            players = new Player[2];
            players[0] = new RandomPlayer("Player 1");
            players[1] = new RandomPlayer("Player 2");
        } else {
            return;
        }

        for (Player player : players) {
            player.initializeBoard();
            
        }

        int currentPlayerIndex = 0;
        // TODO: Have it here as false so the game does not run
        boolean gameStatus = true;
        Player currentPlayer;
        Player nextPlayer;
        int turnCount = 0;
        while (gameStatus) {
            currentPlayer = players[currentPlayerIndex];
            currentPlayerIndex = (currentPlayerIndex + 1) % players.length;
            nextPlayer = players[currentPlayerIndex];
            currentPlayer.move(nextPlayer);
            gameStatus = currentPlayer.stillAlive(); 
            turnCount++;           
        }
        // TODO: Make this message cleaner (Say player who won turns etc)
        System.out.println("Game over after " + (turnCount) + " turns.");
        System.out.println(turnCount / 2);
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
