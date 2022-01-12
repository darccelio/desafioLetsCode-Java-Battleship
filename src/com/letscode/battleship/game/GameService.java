package com.letscode.battleship.game;

import com.letscode.battleship.board.Board;
import com.letscode.battleship.enums.TypeOfPlayerEnum;
import com.letscode.battleship.player.BotPlayer;
import com.letscode.battleship.player.HumanPlayer;
import com.letscode.battleship.player.Player;

import com.letscode.battleship.ship.Ship;
import com.letscode.battleship.utils.PrinterGame;
import com.letscode.battleship.utils.ReadInputs;

import java.util.List;

public class GameService {

    protected static int qttShips;
//    protected static BoardPositionEnum addressInterimShip;
//    protected static BoardPositionEnum addressInterimShot;

    protected static Player[] players = new Player[2];
    public static Game game;


//    protected static List<Integer> addressRowShips = new ArrayList<>();
//    protected static List<Integer> addressColumnShips = new ArrayList<>();
//
//    protected static List<Integer> addressRowShots = new ArrayList<>();
//    protected static List<Integer> addressColumnShots = new ArrayList<>();


    protected static HumanPlayer h_player = new HumanPlayer();
    protected static BotPlayer b_player = new BotPlayer();

    private static Board board = new Board();

    public static void bootstrapGame(int numberTurn){

        String nameHumanPlayer;
        game = new Game();

        if(numberTurn == 1) {
            PrinterGame.printerWelcomeMsg();

            Player botPlayer = new BotPlayer("botPlayer", TypeOfPlayerEnum.PC_PLAYER.getDescription());
            players[0] = botPlayer;

            nameHumanPlayer = ReadInputs.readInputName();
            Player humanPlayer = new HumanPlayer(nameHumanPlayer, TypeOfPlayerEnum.PLAYER.getDescription());
            players[1] = humanPlayer;

            board.build();

            game.setBoard(board);
        }

        game.setIdTurn(numberTurn);
        game.setBot(players[0]);
        game.setPlayer(players[1]);

        PrinterGame.numberOfTurn(numberTurn);

        qttShips = ReadInputs.readQttInicialShips();
        System.out.println();

        board.drawPlayerBoard();

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
        PrinterGame.printerTitlePositionShip();

        for (int i=0; i < qttShips; i++) {
            idShip = i+1;
            Ship ship = new Ship(idShip);
//            System.out.println("Num idShip na gameService "+ idShip);
            h_player.inputShipsOnBoard(idShip, board);
            b_player.inputShipsOnBoard(idShip, board);
        }

    }

    public static void positionShots() {
        PrinterGame.printerTitlePositionShots();
        int idShot = 0;
        for (int i=0; i < qttShips; i++) {
            idShot = i+1;
            h_player.playShotsFired(idShot, board);
            b_player.playShotsFired(idShot, board);
        }
    }

    public static void checkResultGame(int numberTurn) {
        String resultado = game.checkResultGameTeste(numberTurn);
        System.out.println(resultado);
    }





}