package com.letscode.battleship.board;

public class BoardCell {

    final private int xPosition;
    final private int yPosition;
    private boolean hasShip;
    private boolean gotFire;

    public BoardCell(int xCoordinate, int yPosition){
        this.xPosition = xCoordinate;
        this.yPosition = yPosition;
        this.hasShip = false;
        this.gotFire = false;
    }

    public int getXPosition() {
        return xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }

    public void placeShip(){
        this.hasShip = true;
    }

    public void fire(){
        this.gotFire = true;
    }
}
