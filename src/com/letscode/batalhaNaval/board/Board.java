package com.letscode.batalhaNaval.board;

public class Board {

    int gridSize = 10;
    int numberOfColumns = gridSize + 1;
    int numberOfCharacters = 1 + numberOfColumns * 4;

    public void printDividerLine(){
        for (int i = 1; i <= numberOfCharacters; i++){
            System.out.print("-");
        }
        System.out.print("\n");
    }

    private void printCell(String id){
        System.out.printf(" %S |", id);
    }

    public void printLineLabel(){
        System.out.print("|");
        printCell(" ");
        for (int i=0; i < gridSize; i++){
            String a = String.valueOf(i);
            printCell(a);
        }
        System.out.print("\n");
    }

    public void printGridLine(String id){
        System.out.print("|");
        printCell(id);
        for (int i = 0; i < gridSize; i++) {
            printCell(" ");
        }
        System.out.print("\n");
    }
}
