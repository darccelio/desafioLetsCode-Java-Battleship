package com.letscode.batalhaNaval.jogadores;

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

    public List<String> getTiros() {
        return this.shotsFired;
    }

    public void setTiros(String shotsPosition) {
        this.shotsFired.add(shotsPosition);
    }
    //teste

}
