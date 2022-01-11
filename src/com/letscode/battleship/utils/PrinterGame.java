package com.letscode.battleship.utils;

public class PrinterGame {


    public static void printerWelcomeMsg() {
        String PRINTER_MSG_WELCOME = "" +
                "_________________________________________________\n" +
                "- Welcome to BattleShip 2022 - \n" +
                "- Students: Darccelio e Paulo - \n" +
                "- Class: 811 - Santander Coders - \n" + "- Scholl: Let's Code - \n" +
                        "_________________________________________________\n";

        System.out.println(PRINTER_MSG_WELCOME);
    }

    public static void numberOfTurn(int num) {
        System.out.println("_________________________________________________\n" +
                "Turn nº ....: " + num +
                        "\n_________________________________________________\n");
    }

    public static void printerMsgInputPlayer() {
        String PRINTER_MSG_INPUT_PLAYER = "Please, enter your name .....: ";
        System.out.print(PRINTER_MSG_INPUT_PLAYER);
    }

    public static void printerTitlePositionShip() {
        String PRINTER_MSG_POSITION_SHIP= "" +
                "\n_________________________________________________\n\n" +
                "- POSITION SHIP IN THE GRID - \n\n" +
                "_________________________________________________\n";
        System.out.println(PRINTER_MSG_POSITION_SHIP);
    }

    public static void printerTitlePositionShots(){
        String PRINTER_MSG_POSITION_SHOTS= "" +
                "\n_________________________________________________\n\n" +
                "- TRY TO HIT THE OPPONENT SHIPS - \n\n" +
                "_________________________________________________\n";
        System.out.println(PRINTER_MSG_POSITION_SHOTS);
    }

    public static void printerMsgPositionRowShips() {
        String msgInputPositionShip = "Please, enter position of ship .....: \n" +
                "Which row do you like insert? ";
        System.out.print(msgInputPositionShip);
    }

    public static void printerAlertMsgPositionRowIncorrect() {
        String msgAlertInputPositionShip = "Alert!!! The position has inputed there isn't. Enter a row correct a value .....:";
        System.out.print(msgAlertInputPositionShip);
    }


    public static void printerMsgPositionColumnShips() {
        String msgInputPositionShip = "And, Which column do you like insert? ";
        System.out.print(msgInputPositionShip);
    }

    public static void printerAlertMsgPositionColumnIncorrect() {
        String msgAlertInputPositionShip = "Alert!!! The position has inputed there isn't. Enter a column correct a value .....:";
        System.out.print(msgAlertInputPositionShip);
    }

    public static void printerQttInicialShips() {
        String msgInputPositionShip = "How much ships do you like play? ";
        System.out.print(msgInputPositionShip);
    }

    public static void printerInitialBoard() {
        String initialBoard =  "|		|	0	|	1	|	2	|	3	|	4	|	5	|	6	|	7	|	8	|	9	| \n"+
                "|	A	|	~	|	~	|	~	|	~	|	~	|	~	|	~	|	~	|	~	|	~	|\n"+
                "|	B	|	~	|	~	|	~	|	~	|	~	|	~	|	~	|	~	|	~	|	~	|\n"+
                "|	C	|	~	|	~	|	~	|	~	|	~	|	~	|	~	|	~	|	~	|	~	|\n"+
                "|	D	|	~	|	~	|	~	|	~	|	~	|	~	|	~	|	~	|	~	|	~	|\n"+
                "|	E	|	~	|	~	|	~	|	~	|	~	|	~	|	~	|	~	|	~	|	~	|\n"+
                "|	F	|	~	|	~	|	~	|	~	|	~	|	~	|	~	|	~	|	~	|	~	|\n"+
                "|	G	|	~	|	~	|	~	|	~	|	~	|	~	|	~	|	~	|	~	|	~	|\n"+
                "|	H	|	~	|	~	|	~	|	~	|	~	|	~	|	~	|	~	|	~	|	~	|\n"+
                "|	I	|	~	|	~	|	~	|	~	|	~	|	~	|	~	|	~	|	~	|	~	|\n"+
                "|	J	|	~	|	~	|	~	|	~	|	~	|	~	|	~	|	~	|	~	|	~	|\n\n\n";
        System.out.print("BattleShip 2022\n\n" + initialBoard);
    }

    public static void printerMsgPositionRowShots() {
        String msgInputPositionShip = "Please, enter position of your target .....: \n" +
                "Which row do you like select? ";
        System.out.print(msgInputPositionShip);
    }

    public static void printerMsgPositionColumnShots() {
        String msgInputPositionShip = "And, Which column do you like select? ";
        System.out.print(msgInputPositionShip);
    }

    public static void printerMsgNewGame() {
        String msgNewGame = "\nWould you like play again? \nEnter: \n1 - YES or \n0 - NO";
        System.out.print(msgNewGame);
    }

    public static void printerMsgGoodBye() {
        String msgGoodBye = "Thanks for has played BattleShip!\n\n";
        System.out.println(msgGoodBye);
    }

//    public static void mathOfGame(int numberTurn) {
//        private final String
//    }




}