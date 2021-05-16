package src.main;


public class Ship {
    private boolean[] nodes;
    private int nodesLeft;


    public Ship(int size) {
        nodes = new boolean[size];
        int nodesLeft = size;
        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = false;
        }
    }
}