package com.letscode.battleship.game;

import com.letscode.battleship.board.Board;
import com.letscode.battleship.enums.TypeOfPlayerEnum;
import com.letscode.battleship.player.Player;


public class Game {

    protected int idTurn;
    protected Player player;
    protected Player bot;
    protected Board board;
    private int humanScore;
    private int botScore;

    public Game(Integer idTurn, Player player, Player bot) {
        this.idTurn = idTurn;
        this.player = player;
        this.bot = bot;
    }

    public Game() {
    }

    public int getIdTurn() {
        return idTurn;
    }

    public void setIdTurn(Integer idTurn) {
        this.idTurn = idTurn;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Player getBot() {
        return bot;
    }

    public void setBot(Player bot) {
        this.bot = bot;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public String checkResultGameTeste(int numberTurn) {
        int humanScore = getHumanPlayerScore();
        int botScore = getBotPlayerScore();

        if (humanScore > botScore) {
            return "Turn: " + idTurn + "Player: " + this.player.getNamePlayer()+ " scored: " + humanScore + "\n";
        } else if (humanScore < botScore) {
            return "Turn: " + idTurn + "Player: " + this.bot.getNamePlayer() + " scored: " + botScore + "\n";
        } else {
            return "Turn: " + idTurn + "- It's a tie. \n"
                    + "Player: " + player + "scored: " + humanScore + "\n"
                    + "Player: " + bot + "scored: " + botScore;
        }
    }

    private int getHumanPlayerScore() {
        int humanPlayerScore = 0;
        for (int i = 0; i < board.getGridSize(); i++) {
            for (int j = 0; j < board.getGridSize(); j++) {
                if (board.enemyBoard[i][j].hasShip() != 0 && board.enemyBoard[i][j].gotFire() != 0) {
                    humanPlayerScore++;
                }
            }
        }
        return humanPlayerScore;
    }

    private int getBotPlayerScore() {
        int botPlayerScore = 0;
        for (int i = 0; i < board.getGridSize(); i++) {
            for (int j = 0; j < board.getGridSize(); j++) {
                if (board.playerBoard[i][j].hasShip() != 0 && board.playerBoard[i][j].gotFire() != 0) {
                    botPlayerScore++;
                }
            }
        }
        return botPlayerScore;
    }

}
