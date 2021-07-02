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
            defaultGame(players);
        } else if (args[0].equals("Random")) {
            singlePlayerGame(new RandomPlayer("Player"), new RandomPlayer("Training Dummy"));
        } else {
            return;
        }
        
       
    }


    private static void defaultGame(Player[] players) {
        for (Player player : players) {
            player.initializeBoard(); 
            player.printSolution();
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
            gameStatus = nextPlayer.stillAlive(); 
            turnCount++;           
            // NOTE: This does not handle ties 
        }
        // TODO: Make this message cleaner (Say player who won turns etc)
        System.out.println("Game over after " + (turnCount) + " rounds.");
        System.out.println(turnCount / 2);
    }

    private static void singlePlayerGame(Player player, Player opponent) {
        opponent.initializeBoard();
        int turnCount = 1;
        boolean gameStatus = true;

        while (gameStatus) {
            System.out.println("Turn " + turnCount);
            player.move(opponent);
            gameStatus = opponent.stillAlive();
            turnCount++;
        }
        System.out.println("Game over after " + (turnCount - 1) + " turns.");
    }

    public static Ship[] defaultShips() {
        Ship[] ships = new Ship[5];
        ships[0] = new Ship(2, "Destroyer");
        ships[1] = new Ship(3, "Submarine");
        ships[2] = new Ship(3, "Cruiser");
        ships[3] = new Ship(4, "Battleship");
        ships[4] = new Ship(5, "Carrier");
        return ships;
    }

}
