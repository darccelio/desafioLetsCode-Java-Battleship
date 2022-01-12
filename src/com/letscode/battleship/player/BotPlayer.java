package com.letscode.battleship.player;

import com.letscode.battleship.board.Board;
import com.letscode.battleship.utils.PrinterGame;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Random;

public class BotPlayer extends Player implements IPlayer{

    protected int row = 0;
    protected int column = 0;
    protected int contShip = 0;
    protected int contShot = 0;

    public BotPlayer(String namePlayer, String typePlayer) {
        super(namePlayer, typePlayer);
    }

    public BotPlayer(){

    }

    @Override
    public void inputShipsOnBoard(int idShip, Board board) {
        contShip++;
        do{
            this.row = this.randomNumber();
            this.column = this.randomNumber();
        }while(board.enemyBoard[row][column].hasShip()!=0);

        System.out.println("Linha: "+ row +  "Coluna: " + column);
        System.out.println("Numero cont: "+ contShip);

        this.placeShip(row,column, board, idShip, contShip);
    }

    @Override
    public void playShotsFired(int idShot, Board board) {
        contShip++;
        do{
            this.row = this.randomNumber();
            this.column = this.randomNumber();
        }while(board.enemyBoard[row][column].hasShip()!=0);

        System.out.println("Linha: "+ row +  "Coluna: " + column);
        System.out.println("Numero cont: "+ contShip);

        this.fire(row,column, board, idShot, contShot);

    }

    private void fire(int row, int column, Board board, int idShot, int cont) {
//        System.out.println("Qtd impressao Board"+cont);
        board.playerBoard[row][column].setFire(idShot);
        PrinterGame.printerTitleBoard(0);

//        System.out.println("Bot Player fired on :" );
        board.drawPlayerBoard();
    }


    private int randomNumber() {
        int number = (int) (Math.random() * 9);
        System.out.println("Number randomico: "+ number);
        return number;
    }

    private void placeShip(int row, int column, Board board, int idShip, int cont) {
//        System.out.println("Qtd impressao Board"+cont);
        board.enemyBoard[row][column].setShip(cont);
    }
}
