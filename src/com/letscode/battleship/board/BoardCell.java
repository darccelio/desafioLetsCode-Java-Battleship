package com.letscode.battleship.board;

public class BoardCell {

    private int ship;
    private int fire;

    public BoardCell(){
        this.ship = 0;
        this.fire = 0;
    }

    public int hasShip() {
        return ship;
    }

    public void setShip(int ship) {
        this.ship = ship;
    }

    public int gotFire() {
        return fire;
    }

    public void setFire(int fire) {
        this.fire = fire;
    }
}
