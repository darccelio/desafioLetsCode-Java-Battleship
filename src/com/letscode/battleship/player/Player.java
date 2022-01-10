package com.letscode.battleship.player;

import java.util.ArrayList;
import java.util.List;

public class Player {

    protected String namePlayer;
    protected String typePlayer;
    protected List<String> shipsPosition = new ArrayList<>();
    protected List<String> shotsFired = new ArrayList<>();


    protected static List<Integer> addressRowShips = new ArrayList<>();
    protected static List<Integer> addressColumnShips = new ArrayList<>();

    protected static List<Integer> addressRowShots = new ArrayList<>();
    protected static List<Integer> addressColumnShots = new ArrayList<>();

    public Player(String namePlayer, String typePlayer) {
        this.namePlayer = namePlayer;
        this.typePlayer = typePlayer;
    }

    public Player() {};

    public List<String> getShipsPosition() {
        return shipsPosition;
    }

    public List<String> getShotsFired() {
        return shotsFired;
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

