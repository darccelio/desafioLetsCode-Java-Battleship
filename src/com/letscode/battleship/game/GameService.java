package com.letscode.battleship.game;

import com.letscode.battleship.enums.BoardPositionEnum;
import com.letscode.battleship.player.Player;
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

        System.out.println(numberTurn);

        players = StartGameService.startPlayerInGame(numberTurn);

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

        for (int i=0; i < qttShips; i++) {
            addressInterimShip = BoardPositionEnum.valueOf(ReadInputs.readPositionRowShip());
            // TODO: 06/01/2022 validação da entrada de dados (até a letra máxima do tabuleiro)

            addressRowShots.add(addressInterimShip.getPosition());
            addressColumnShots.add(ReadInputs.readPositionColumnShip());
            // TODO: 06/01/2022  validação da entrada do index da coluna (valor máximo do index da coluna)

            // TODO: 06/01/2022  inserir verificação de inserção repetida na mesma posição do array /sobreposição de informações

        }

    }

    public static void positionShots() {

        for (int i=0; i < qttShips; i++) {
            addressInterimShot = BoardPositionEnum.valueOf(ReadInputs.readPositionRowShot());
            // TODO: 06/01/2022 validação da entrada de dados (até a letra máxima do tabuleiro)

            addressRowShips.add(addressInterimShot.getPosition());
            addressColumnShips.add(ReadInputs.readPositionColumnShot());
            // TODO: 06/01/2022  validação da entrada do index da coluna (valor máximo do index da coluna)

            // TODO: 06/01/2022  inserir verificação de inserção repetida na mesma posição do array /sobreposição de informações

            // TODO: 06/01/2022  inserir resultado após os tiros
            String resultado = checkResultGame(i);
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
