package com.letscode.battleship.utils;

import java.util.Scanner;

public class ReadInputs {

    public static String readUserInput() {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        sc.close();
        return userInput;
    }

    public static String readInputName () {
        PrinterGame.printerMsgInputPlayer();
        return readUserInput();
    }

    public static int readQttInicialShips() {
        PrinterGame.printerQttInicialShips();
        return Integer.parseInt(readUserInput());
    }

    public static String readPositionRowShip (int flag) {
        if(flag==1) {
            PrinterGame.printerMsgPositionRowShips();
        }else {
            PrinterGame.printerAlertMsgPositionRowIncorrect();
        }
        return readUserInput().toUpperCase();
    }

    public static int readPositionColumnShip(int flag) {
        if(flag==1) {
            PrinterGame.printerMsgPositionColumnShips();
        }else {
            PrinterGame.printerAlertMsgPositionColumnIncorrect();
        }
        return Integer.parseInt(readUserInput());
    }

    public static String readPositionRowShot(int flag) {
        if(flag==1) {
            PrinterGame.printerMsgPositionRowShots();
        }else {
            PrinterGame.printerAlertMsgPositionRowIncorrect();
        }
        return readUserInput().toUpperCase();
    }

    public static int readPositionColumnShot (int flag) {
        if(flag==1) {
            PrinterGame.printerMsgPositionColumnShots();
        }else {
            PrinterGame.printerAlertMsgPositionColumnIncorrect();
        }
        return Integer.parseInt(readUserInput());
    }

    public static int readDecisionPlayerNewGame() {
        PrinterGame.printerMsgNewGame();
        return Integer.parseInt(readUserInput());
    }
}