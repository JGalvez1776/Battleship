package src.main;


public class Ship {
    private boolean[] nodes;
    private int nodesLeft;


    public Ship(int size) {
        nodes = new boolean[size];
        nodesLeft = size;
        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = false;
        }
    }

    public boolean isSunk() {
        return nodesLeft <= 0;
    }
}