package src.main;

import javax.swing.text.Position;

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

}