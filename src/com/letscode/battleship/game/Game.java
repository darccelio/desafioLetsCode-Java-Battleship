package com.letscode.battleship.game;

import com.letscode.battleship.enums.TypeOfPlayerEnum;
import com.letscode.battleship.player.Player;

public class Game {

    protected int idTurn;
    protected Player player;
    protected Player bot;

    public Game(Integer idTurn, Player player, Player bot) {
        this.idTurn = idTurn;
        this.player = player;
        this.bot = bot;
    }

    public Game() {};

    public int getIdTurn() {
        return idTurn;
    }

    public void setIdTurn(Integer idTurn) {
        this.idTurn = idTurn;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Player getBot() {
        return bot;
    }

    public void setBot(Player bot) {
        this.bot = bot;
    }

    //    public Player checkWinner() {
//        return
//    }

}
