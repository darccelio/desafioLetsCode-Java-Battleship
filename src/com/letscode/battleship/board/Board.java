package com.letscode.battleship.board;

public class Board {

    protected static final int gridSize = 10;
    protected static final int numberOfColumns = gridSize + 1;
    protected static int numberOfCharacters = 1 + numberOfColumns * 4;

    String[] rowsOfBoard = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};


    public BoardCell[][] playerBoard = new BoardCell[gridSize][gridSize];

    public String[] getRowsOfBoard() {
        return rowsOfBoard;
    }

    public int getGridSize() {
        return gridSize;
    }

    private static void printDividerLine(){
        for (int i = 1; i <= numberOfCharacters; i++){
            System.out.print("-");
        }
        System.out.print("\n");
    }

    private static void printCell(String id){
        System.out.printf(" %S |", id);
    }

    private static void printLineLabel(){
        System.out.print("|");
        printCell(" ");
        for (int i=0; i < gridSize; i++){
            String a = String.valueOf(i);
            printCell(a);
        }
        System.out.print("\n");
    }

    private static void printGridLine(String id){
        System.out.print("|");
        printCell(id);
        for (int i = 0; i < gridSize; i++) {
            printCell("~");
        }
        System.out.print("\n");
    }

    private static String[] createColumnLabel(){
        char[] columnLabelChar = new char[gridSize];
        String[] columnLabelString = new String[gridSize];
        for (int i = 0; i < gridSize; i++){
            columnLabelChar[i] = (char)(65+i);
            columnLabelString[i] = String.valueOf(columnLabelChar[i]);        }
        return columnLabelString;
    }

    private static void printGridBody(){
        String[] columnLabel = createColumnLabel();
        for (String label : columnLabel) {
            printGridLine(label);
            printDividerLine();
        }
    }

    public static void drawBoard(){
        printDividerLine();
        printLineLabel();
        printDividerLine();
        printGridBody();
    }


}
