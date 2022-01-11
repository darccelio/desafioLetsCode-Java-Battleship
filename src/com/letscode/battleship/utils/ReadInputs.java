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

    public static String readPositionRowShip (int flag) {
        if(flag==1) {
            PrinterGame.printerMsgPositionRowShips();
        }else{
            PrinterGame.printerAlertMsgPositionRowIncorrect();
        }

        return sc.nextLine().toUpperCase();
    }

    public static int readPositionColumnShip(int flag) {
        if(flag==1) {
            PrinterGame.printerMsgPositionColumnShips();
        } else{
            PrinterGame.printerAlertMsgPositionColumnIncorrect();
        }
        return Integer.parseInt(sc.nextLine());
    }

    public static String readPositionRowShot(int flag) {
        if(flag==1) {
            PrinterGame.printerMsgPositionRowShots();
        }else{
            PrinterGame.printerAlertMsgPositionRowIncorrect();
        }
        return sc.nextLine().toUpperCase();
    }

    public static int readPositionColumnShot (int flag) {
        if(flag==1) {
            PrinterGame.printerMsgPositionColumnShots();
        }else{
            PrinterGame.printerAlertMsgPositionColumnIncorrect();
        }
        return Integer.parseInt(sc.nextLine());
    }

    public static int readDecisionPlayerNewGame() {
        PrinterGame.printerMsgNewGame();
        return Integer.parseInt(sc.nextLine());
    }


    public static void closeScanner() {
        sc.close();
    }





}
