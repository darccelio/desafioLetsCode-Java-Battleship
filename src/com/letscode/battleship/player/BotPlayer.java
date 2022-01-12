package com.letscode.battleship.player;

import com.letscode.battleship.board.Board;

import java.util.List;

public class BotPlayer extends Player implements IPlayer{
    public BotPlayer(String namePlayer, String typePlayer) {
        super(namePlayer, typePlayer);
    }

    @Override
    public void inputShipsOnBoard(int idShip, Board board) {
    }

    @Override
    public void playShotsFired(int idShot, Board board) {
    }
}
