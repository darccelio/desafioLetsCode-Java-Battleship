package com.letscode.battleship;

import com.letscode.battleship.game.Game;
import com.letscode.battleship.game.GameService;
import com.letscode.battleship.player.HumanPlayer;
import com.letscode.battleship.player.Player;
import com.letscode.battleship.utils.PrinterGame;
import com.letscode.battleship.utils.ReadInputs;

public class BatalhaNavalCodeApplication {

    public static void main(String[] args) {

        int result = 0;
        final int CONDITIONAL_STOP = 0;

        int qttTurn = 0;

        do{
            ++qttTurn;
            GameService.bootstrapGame(qttTurn);

            GameService.positionShips();

            GameService.positionShots();
            GameService.whoWin();
            result = ReadInputs.readDecisionPlayerNewGame();

            if(result == CONDITIONAL_STOP) {
                PrinterGame.printerMsgGoodBye();
            }

//            todo GameService.checkResultGame();

        }while(result != 0);

        ReadInputs.closeScanner();



    }
}
