package com.letscode.batalhaNaval;

import com.letscode.batalhaNaval.board.Board;

public class BatalhaNavalCodeApplication {

    public static void main(String[] args) {
	// write your code here
        Board board = new Board();
        board.printDividerLine();
        board.printLineLabel();
        board.printDividerLine();
        board.printGridLine("A");

        char[] columnLabel = new char[10];
        for (int i = 0; i < 10; i++){
            columnLabel[i] = (char)(65+i);
        }
        System.out.print(columnLabel);
    }
}
