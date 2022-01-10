package com.letscode.battleship.board;

public class Board {

    private int gridSize = 10;
    public BoardCell[][] playerBoard;
    public BoardCell[][] enemyBoard;

    public Board(){
        this.gridSize = gridSize;
        this.playerBoard = new BoardCell[gridSize][gridSize];
        this.enemyBoard = new BoardCell[gridSize][gridSize];
    }

    public void build(){
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                playerBoard[i][j] = new BoardCell();
                enemyBoard[i][j] = new BoardCell();
            }
        }
    }

    final private int numberOfColumns = gridSize + 1;
    private int numberOfCharacters = 1 + numberOfColumns * 4;

    private void printDividerLine(){
        for (int i = 1; i <= numberOfCharacters; i++){
            System.out.print("-");
        }
        System.out.print("\n");
    }

    private static void printCell(String id){
        System.out.printf(" %S |", id);
    }

    private void printLineLabel(){
        System.out.print("|");
        printCell(" ");
        for (int i=0; i < gridSize; i++){
            String a = String.valueOf(i);
            printCell(a);
        }
        System.out.print("\n");
    }

    private String[] createColumnLabel(){
        char[] columnLabelChar = new char[gridSize];
        String[] columnLabelString = new String[gridSize];
        for (int i = 0; i < gridSize; i++){
            columnLabelChar[i] = (char)(65+i);
            columnLabelString[i] = String.valueOf(columnLabelChar[i]);        }
        return columnLabelString;
    }

    private void printPlayerGridBody(){
        String[] columnLabel = createColumnLabel();
        for (int i = 0; i < gridSize; i++) {
            System.out.print("|");
            printCell(columnLabel[i]);
            for (int j = 0; j < gridSize; j++) {
                if (playerBoard[i][j].hasShip() != 0 && playerBoard[i][j].gotFire() != 0) {
                    printCell("*");
                }else if (playerBoard[i][j].hasShip() != 0){
                    printCell("N");
                }else if (playerBoard[i][j].gotFire() != 0){
                    printCell("o");
                }else {
                    printCell("~");
                }
            }
            System.out.print("\n");
            printDividerLine();
        }
    }

    private void printEnemyGridBody(){
        String[] columnLabel = createColumnLabel();
        for (int i = 0; i < gridSize; i++) {
            System.out.print("|");
            printCell(columnLabel[i]);
            for (int j = 0; j < gridSize; j++) {
                if (enemyBoard[i][j].hasShip() != 0 && enemyBoard[i][j].gotFire() != 0) {
                    printCell("*");
                }else if (enemyBoard[i][j].gotFire() != 0){
                    printCell("o");
                }else {
                    printCell("~");
                }
            }
            System.out.print("\n");
            printDividerLine();
        }
    }

    public void drawPlayerBoard(){
        printDividerLine();
        printLineLabel();
        printDividerLine();
        printPlayerGridBody();
    }
    public void drawEnemyBoard(){
        printDividerLine();
        printLineLabel();
        printDividerLine();
        printEnemyGridBody();
    }
}