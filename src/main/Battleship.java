package src.main;

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
        boolean gameStatus = false;
        Player currentPlayer;
        Player nextPlayer;

        while (gameStatus) {
            currentPlayer = players[currentPlayerIndex];
            currentPlayerIndex = (currentPlayerIndex + 1) % players.length;
            nextPlayer = players[currentPlayerIndex];
            currentPlayer.move(nextPlayer);
            gameStatus = currentPlayer.stillAlive();
            
        }
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
