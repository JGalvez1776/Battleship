package src.main;


public class Board {

    public static final int DEFAULT_SIZE = 10;
    private Pos[][] board;

    public Board() {
        this(Board.DEFAULT_SIZE);
    }

    // TODO: Should add another constructor for making boards that are not squares.
    public Board(int size) {
        this.board = new Pos[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = new Pos();
            }
        }
    }   

    public Pos get(int x, int y) {
        return board[y][x];
    }

    public Pos get(String command) {
        int[] positions = Board.convertToCords(command);
        return get(positions[0], positions[1]);
    }

    public int getWidth() {
        return board[0].length;
    }

    public int getHeight() {
        return board.length;
    }

    /** 
     *
     */
    public static int[] convertToCords(String command) {
        int[] returnVal = new int[2];
        returnVal[1] = (int) command.charAt(0) - 97;
        returnVal[0] = Integer.parseInt(command.substring(1).toUpperCase()) - 1;
        return returnVal;
    }

}