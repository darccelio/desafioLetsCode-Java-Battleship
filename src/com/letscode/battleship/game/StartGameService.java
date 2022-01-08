package com.letscode.battleship.game;

import com.letscode.battleship.player.Player;
import com.letscode.battleship.utils.PrinterGame;

public class StartGameService {

    protected static Game game;
    protected static Player[] players;

//    protected Player[] players = new Player[2];

    public static Player[] startPlayerInGame (int turn) {

        game = new Game();
        if(turn == 1) {
            PrinterGame.printerWelcomeMsg();
            players = RegisterPlayerService.registerPlayers();
        }

        game.setIdTurn(turn);
        game.setBot(players[0]);
        game.setPlayer(players[1]);
        return players;
    }
}
