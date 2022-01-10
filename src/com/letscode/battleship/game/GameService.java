package com.letscode.battleship.game;

import com.letscode.battleship.enums.BoardPositionEnum;
import com.letscode.battleship.player.Player;
import com.letscode.battleship.ship.Ship;
import com.letscode.battleship.utils.PrinterGame;
import com.letscode.battleship.utils.ReadInputs;

import java.util.ArrayList;
import java.util.List;


public class GameService {

    protected static int qttShips;
    protected static BoardPositionEnum addressInterimShip;
    protected static BoardPositionEnum addressInterimShot;

    protected static Player[] players;

    protected static List<Integer> addressRowShips = new ArrayList<>();
    protected static List<Integer> addressColumnShips = new ArrayList<>();

    protected static List<Integer> addressRowShots = new ArrayList<>();
    protected static List<Integer> addressColumnShots = new ArrayList<>();

    public static void bootstrapGame(int numberTurn){

<<<<<<< HEAD
<<<<<<< HEAD
        String nameHumanPlayer;
=======
=======
>>>>>>> parent of a344aa2 (ajustando consflitos com a main)
        System.out.println(numberTurn);
>>>>>>> parent of a344aa2 (ajustando consflitos com a main)

        players = StartGameService.startPlayerInGame(numberTurn);
<<<<<<< HEAD

        PrinterGame.numberOfTurn(numberTurn);

=======
>>>>>>> parent of a344aa2 (ajustando consflitos com a main)

        qttShips = ReadInputs.readQttInicialShips();
        System.out.println();
        PrinterGame.printerInitialBoard();

        // TODO: 04/01/2022  instanciação do game
        //Imprimir o board para que o jogador informe a posição do navio
        //jogador1 posiciona os navios
        //pc posiciona os navios
        //
        //Imprimir o board para que o jogador informe a posição dos tiros
        //jogador1 atira 1x
        //imprime o bord resultado
        //
        //pc atira 1x
        //imprime o bord resultado
        //
        //ao final de 10 tiros, mostrar o vencedor
    }

    public static void positionShips() {
        int idShip;
        HumanPlayer h_player = new HumanPlayer();
        PrinterGame.printerTitlePositionShip();
        PrinterGame.printerTitlePositionShots();

        for (int i=0; i < qttShips; i++) {
            idShip = i+1;
            Ship ship = new Ship(idShip);
            h_player.inputShipsOnBoard(idShip);
        }

    }

    public static void positionShots() {
        HumanPlayer h_player = new HumanPlayer();

        for (int i=0; i < qttShips; i++) {
            h_player.playShotsFired();
        }
    }


    public static String checkResultGame(int index) {

        // TODO: 06/01/2022 verificar resultado PositionShip x PositionShot

        return "resultado ";
    }

    public static void whoWin() {

        // TODO: 06/01/2022 verificar quem foi o vencedor

    }




}
