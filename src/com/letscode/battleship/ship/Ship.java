package com.letscode.battleship.ship;

public class Ship {
    final private int id;
    final private String type;
    final private int size;
    private int hits;
    private boolean sunk;

    public Ship(int id){
        this.id = id;
        this.type = "Submarine";
        this.size = 1;
        this.hits = 0;
        this.sunk = false;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public boolean isSunk() {
        return sunk;
    }

    public void setSunk(boolean sunk) {
        this.sunk = sunk;
    }
}
