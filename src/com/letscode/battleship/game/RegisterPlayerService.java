package com.letscode.battleship.game;

import com.letscode.battleship.enums.TypeOfPlayerEnum;
import com.letscode.battleship.player.BotPlayer;
import com.letscode.battleship.player.Player;
import com.letscode.battleship.utils.ReadInputs;

public class RegisterPlayerService {
//    protected Player player = new Player();
//    protected Player botPlayer = new Player("botPlayer", TypeOfPlayerEnum.PC_PLAYER.getDescription());

    protected static String namePlayer;

    public static Player[] registerPlayers() {
        Player[] players = new Player[2];
        Player botPlayer = new BotPlayer("botPlayer", TypeOfPlayerEnum.PC_PLAYER.getDescription());
        players[0] = botPlayer;
        namePlayer = ReadInputs.readInputName();
        Player player = new Player(namePlayer, TypeOfPlayerEnum.PLAYER.getDescription());
        players[1] = player;

        return players;
    }

}
