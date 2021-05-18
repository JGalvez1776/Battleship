package src.main;

public class Board {

    private static int DEFAULT_SIZE = 10;
    private int size;
    private Pos[][] board;

    public Board() {
        this(Board.DEFAULT_SIZE);
    }

    public Board(int size) {
        this.size = size;
        this.board = new Pos[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = new Pos();
            }
        }
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