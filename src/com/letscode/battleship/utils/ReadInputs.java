package com.letscode.battleship.utils;

import java.util.Scanner;

public class ReadInputs {

    private static Scanner sc = new Scanner(System.in);

    public static String readInputName () {
        PrinterGame.printerMsgInputPlayer();
        return sc.nextLine();
    }

    public static int readQttInicialShips() {
        PrinterGame.printerQttInicialShips();
        return Integer.parseInt(sc.nextLine());
    }

    public static String readPositionRowShip () {
        PrinterGame.printerMsgPositionRowShips();
        return sc.nextLine().toUpperCase();
    }

    public static int readPositionColumnShip () {
        PrinterGame.printerMsgPositionColumnShips();
        return Integer.parseInt(sc.nextLine());
    }

    public static String readPositionRowShot() {
        PrinterGame.printerMsgPositionRowShots();
        return sc.nextLine().toUpperCase();
    }

    public static int readPositionColumnShot () {
        PrinterGame.printerMsgPositionColumnShots();
        return Integer.parseInt(sc.nextLine());
    }

    public static int readDecisionPlayerNewGame() {
        PrinterGame.printerMsgNewGame();
        return Integer.parseInt(sc.nextLine());
    }

    public static void closeScanner() {
        return sc.close();
    }






}
