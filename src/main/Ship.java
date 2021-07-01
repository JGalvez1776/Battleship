package src.main;


public class Ship {
    private boolean[] nodes;
    private int nodesLeft;
    private String name;


    public Ship(int size, String name) {
        this(size);
        this.name = name;
    }

    public Ship(int size) {
        nodes = new boolean[size];
        nodesLeft = size;
        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = false;
        }
    }

    public void hit(int index) {
        nodesLeft--;
    }

    public boolean isSunk() {
        return nodesLeft <= 0;
    }

    public int getSize() {
        return nodes.length;
    }

    public String toString() {
        return name;
    }
}