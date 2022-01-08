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

    public Player() {};


//    public void inputShipsOnBoard(  ) {
//        //// TODO: 07/01/2022 chamar a classe tabuleiro para posicionar os navios
//    }
//
//    public void playShotsFired() {
//        //TODO: 07/01/2022  chamar a classe tabuleiro para posicionar os tiros
//    }

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

