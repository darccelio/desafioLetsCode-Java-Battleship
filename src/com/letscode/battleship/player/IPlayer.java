package com.letscode.battleship.player;

import com.letscode.battleship.board.Board;

public interface IPlayer {
    void inputShipsOnBoard(int idShip, Board board);
    void playShotsFired(int idShot, Board board);
}
