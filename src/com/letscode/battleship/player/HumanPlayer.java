package com.letscode.battleship.player;

import com.letscode.battleship.board.Board;
import com.letscode.battleship.enums.BoardPositionEnum;
import com.letscode.battleship.utils.PrinterGame;
import com.letscode.battleship.utils.ReadInputs;

import java.util.ArrayList;
import java.util.List;


public class HumanPlayer extends Player implements IPlayer{

    protected BoardPositionEnum addressInterimShip;
    protected BoardPositionEnum addressInterimShot;

    protected List<Integer> addressRowShips = new ArrayList<>();
    protected List<Integer> addressColumnShips = new ArrayList<>();

    protected List<Integer> addressRowShots = new ArrayList<>();
    protected List<Integer> addressColumnShots = new ArrayList<>();

    private boolean CONDITION_STOP = false;
    private boolean CONDITION_STOP_INPUT = false;

    private int contShip = 0;
    private int contShot = 0;

    public HumanPlayer() {}
    public HumanPlayer(String namePlayer, String typePlayer) {
        super(namePlayer, typePlayer);
    }

    @Override
    public void inputShipsOnBoard(int idShip, Board board) {
        int flagMsg = 1;

        //VALIDAÇÃO DE REPETIÇÕES DE BARCOS NA MESMA POSIÇÃO
        do {
            String positionInterimRow = ReadInputs.readPositionRowShip(flagMsg=1);
            //VALIDAÇÃO ENTRADA DA LINHA
            do {


                for (String position : board.getRowsOfBoard()) {
                    if (position.equals(positionInterimRow)) {
                        addressInterimShip = BoardPositionEnum.valueOf(positionInterimRow);
                        CONDITION_STOP = true;
                        break;
                    }
                }
                if (!CONDITION_STOP) {
                    positionInterimRow = ReadInputs.readPositionRowShip(flagMsg = 2);
                }

            } while (!CONDITION_STOP);

            //VALIDAÇÃO DA ENTRADA DA COLUNA
            CONDITION_STOP = false;
            int positionInterimColumn = ReadInputs.readPositionColumnShip(flagMsg = 1);

            do {
                if (positionInterimColumn >= 0 &&
                    positionInterimColumn <= (board.getGridSize()-1)) {//
                    CONDITION_STOP = true;

                } else {
                    positionInterimColumn = ReadInputs.readPositionColumnShip(flagMsg = 2);
                }

            } while (!CONDITION_STOP);

            String positionConcatToCheck = addressInterimShip.toString() + positionInterimColumn;


            if (!checkIfAlreadyInputShipsInPosition(positionConcatToCheck)) {
                addressRowShips.add(addressInterimShip.getPosition());
                addressColumnShips.add(positionInterimColumn);
                CONDITION_STOP_INPUT = true;

//                System.out.println("Numero idShip"+ idShip);
                this.placeShip(addressRowShips.get(contShip), addressColumnShips.get(contShip), board, idShip, contShip);
                contShip++;
            } else {
                System.out.println("Already input for this position. Please, try again");
            }

        }while(!CONDITION_STOP_INPUT);

    }

    private void placeShip(int row, int column, Board board, int idShip, int cont) {
//        System.out.println("Qtd impressao Board"+cont);
        board.playerBoard[row][column].setShip(idShip);
        PrinterGame.printerTitleBoard(0);
        board.drawPlayerBoard();
    }

    @Override
    public void playShotsFired(int idShot, Board board) {
        int flagMsg =1;

        PrinterGame.printerTitleBoard(1);
        board.drawEnemyBoard();

        String positionInterimRow = ReadInputs.readPositionRowShot(flagMsg=1);
        System.out.println("Coluna entrada do telaclado..........: " + positionInterimRow);

        //VALIDAÇÃO DE REPETIÇÕES DE TIROS NA MESMA POSIÇÃO
        do {
            //VALIDAÇÃO ENTRADA DA LINHA
            do{
                for( String position : board.getRowsOfBoard() ) {
                    if (position.equals(positionInterimRow)) {
                        addressInterimShot = BoardPositionEnum.valueOf(positionInterimRow);
                        System.out.println("Coluna convertida enum ..........: " + addressInterimShot);
                        CONDITION_STOP = true;
                    }
                }
                if(!CONDITION_STOP){
                    positionInterimRow = ReadInputs.readPositionRowShot(flagMsg=2);
                }

            }while(!CONDITION_STOP);

            //VALIDAÇÃO DA ENTRADA DA COLUNA
            CONDITION_STOP = false;
            int positionInterimColumn = ReadInputs.readPositionColumnShot(flagMsg=1);
            System.out.println("Coluna ....: "+positionInterimColumn);

            do{
                if(positionInterimColumn >= 0 &&
                    positionInterimColumn <= (board.getGridSize()-1)) {
                    CONDITION_STOP = true;

                }else {
                    positionInterimColumn = ReadInputs.readPositionColumnShip(flagMsg=2);
                }

            }while(!CONDITION_STOP);

            String positionConcatToCheck2 = addressInterimShot.toString() + positionInterimColumn;

            if (!checkIfAlreadyInputShotsInPosition(positionConcatToCheck2)) {
                addressRowShots.add(addressInterimShot.getPosition());
                addressColumnShots.add(positionInterimColumn);
                CONDITION_STOP_INPUT = true;
                this.fire(addressRowShots.get(contShot), addressColumnShots.get(contShot), board, idShot, contShot);
                contShot++;
            } else {
                System.out.println("Already shots for this position. Please, try again");
            }

        }while(!CONDITION_STOP_INPUT);
    }

    private void fire(int row, int column, Board board, int idShot, int cont) {
//        System.out.println("Qtd impressao Board"+cont);
        board.enemyBoard[row][column].setFire(idShot);
        PrinterGame.printerTitleBoard(1);
        board.drawEnemyBoard();
    }

    private boolean checkIfAlreadyInputShipsInPosition(String position) {
        if(!this.shipsPosition.contains(position)) {
            this.shipsPosition.add(position);
            return false;
        } else{
            return true;
        }
    }

    private boolean checkIfAlreadyInputShotsInPosition(String position) {
        if(!this.shotsFired.contains(position)) {
            this.shotsFired.add(position);
            return false;
        } else{
            return true;
        }
    }

    public List<String> getShipsPosition() {
        return shipsPosition;
    }

    public List<String> getShotsFired() {
        return shotsFired;
    }

    public int getAddressRowShips(int i) {
        int row = addressRowShips.get(i);
        return row;
    }

    public int getAddressColumnShips(int i) {
        int column = addressColumnShips.get(i);
        return column;
    }
}
