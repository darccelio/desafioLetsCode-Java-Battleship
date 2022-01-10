package com.letscode.battleship;

<<<<<<< HEAD
import com.letscode.battleship.game.Game;
import com.letscode.battleship.game.GameService;
import com.letscode.battleship.player.HumanPlayer;
import com.letscode.battleship.player.Player;
=======
import com.letscode.battleship.board.Board;
import com.letscode.battleship.board.BoardCell;
import com.letscode.battleship.game.GameService;
>>>>>>> parent of a344aa2 (ajustando consflitos com a main)
import com.letscode.battleship.utils.PrinterGame;
import com.letscode.battleship.utils.ReadInputs;

public class BatalhaNavalCodeApplication {
<<<<<<< HEAD

    public static void main(String[] args) {
	// write your code here
=======
    public static void main(String[] args) {
        // write your code here
>>>>>>> parent of a344aa2 (ajustando consflitos com a main)

        int result = 0;
        final int CONDITIONAL_STOP = 0;

<<<<<<< HEAD
        Player humPlayer = new HumanPlayer();

=======
>>>>>>> parent of a344aa2 (ajustando consflitos com a main)
        int qttTurn = 0;

        do{
            ++qttTurn;
            GameService.bootstrapGame(qttTurn);
<<<<<<< HEAD

            GameService.positionShips();

=======
            GameService.positionShips();
>>>>>>> parent of a344aa2 (ajustando consflitos com a main)
            GameService.positionShots();
            GameService.whoWin();
            result = ReadInputs.readDecisionPlayerNewGame();

            if(result == CONDITIONAL_STOP) {
                PrinterGame.printerMsgGoodBye();
            }

//            GameService.checkResultGame();

        }while(result != 0);

<<<<<<< HEAD
        ReadInputs.closeScanner();



=======
>>>>>>> parent of a344aa2 (ajustando consflitos com a main)
    }
}
