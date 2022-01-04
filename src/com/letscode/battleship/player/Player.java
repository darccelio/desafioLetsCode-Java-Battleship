package com.letscode.battleship.player;

import java.util.ArrayList;
import java.util.List;

public class Player {

    protected String namePlayer;
    protected String typePlayer;
    protected List<String> shotsFired;
    protected List<String> shipsPosition;

    public Player(String namePlayer, String typePlayer) {
        this.namePlayer = namePlayer;
        this.typePlayer = typePlayer;
        this.shotsFired = new ArrayList<String>();
        this.shipsPosition = new ArrayList<String>();
    }

    public List<String> getShotsFired() {
        return this.shotsFired;
    }

    public void setShotsFired(String shotsPosition) {
        this.shotsFired.add(shotsPosition);
    }

    public List<String> getShipsPosition() {
        return shipsPosition;
    }

    public void setShipsPosition(List<String> shipsPosition) {
        this.shipsPosition = shipsPosition;
    }

    @Override
    public String toString() {
        return "Player{" +
                "namePlayer='" + namePlayer + '\'' +
                ", typePlayer='" + typePlayer + '\'' +
                ", shotsFired=" + shotsFired +
                ", shipsPosition=" + shipsPosition +
                '}';
    }

}

