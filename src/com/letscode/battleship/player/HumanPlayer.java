package com.letscode.battleship.player;

import com.letscode.battleship.board.Board;
import com.letscode.battleship.enums.BoardPositionEnum;
import com.letscode.battleship.utils.ReadInputs;

import java.util.ArrayList;
import java.util.List;


public class HumanPlayer extends Player implements IPlayer{

    protected static BoardPositionEnum addressInterimShip;
    protected static BoardPositionEnum addressInterimShot;
    protected static BoardPositionEnum addressInterim;

    protected static List<Integer> addressRowShips = new ArrayList<>();
    protected static List<Integer> addressColumnShips = new ArrayList<>();

    protected static List<Integer> addressRowShots = new ArrayList<>();
    protected static List<Integer> addressColumnShots = new ArrayList<>();

    private Board board = new Board();

    private boolean CONDITION_STOP = false;
    private boolean CONDITION_STOP_INPUT = false;

    public HumanPlayer() {}
    public HumanPlayer(String namePlayer, String typePlayer) {
        super(namePlayer, typePlayer);
    }

    @Override
    public void inputShipsOnBoard(int idShip) {
        int flagMsg = 1;



        //VALIDAÇÃO DE REPETIÇÕES DE BARCOS NA MESMA POSIÇÃO
        do {
            //VALIDAÇÃO ENTRADA DA LINHA
            do {
                String positionInterimRow = ReadInputs.readPositionRowShip(flagMsg);
                for (String position : board.getRowsOfBoard()) {
                    if (position.equals(positionInterimRow)) {
                        addressInterimShip = BoardPositionEnum.valueOf(positionInterimRow);
                        CONDITION_STOP = true;
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

            } else {
                System.out.println("Already input for this position. Please, try again");
                CONDITION_STOP_INPUT = false;
            }

        }while(!CONDITION_STOP_INPUT);

    }

    @Override
    public void playShotsFired() {
        int flagMsg =1;

        //VALIDAÇÃO DE REPETIÇÕES DE TIROS NA MESMA POSIÇÃO
        do {
            //VALIDAÇÃO ENTRADA DA LINHA
            do{
                String positionInterimRow = ReadInputs.readPositionRowShot(flagMsg=1);
                System.out.println("Coluna entrada do telacdo..........: " + positionInterimRow);

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
            System.out.println("Coluna ....: "+ positionInterimColumn);

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

            } else {
                System.out.println("Already shots for this position. Please, try again");
                CONDITION_STOP_INPUT = false;
            }

        }while(!CONDITION_STOP_INPUT);

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


}
