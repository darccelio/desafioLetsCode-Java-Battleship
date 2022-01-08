package com.letscode.batalhaNaval.board;

public class BoardCell {

    final private int xPosition;
    final private int yPosition;
    private boolean hasShip;
    private boolean gotFire;

    public BoardCell(int xPosition, int yPosition){
        this.xPosition = xPosition;
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
