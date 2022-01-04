package com.letscode.battleship.enums;

public enum TypeOfBoardEnum {
    BOARD_BOT("Bot's Board"),
    BOARD_PLAYER("Player's Board"),
    INICIAL_BOARD("Board");

    private String description;

    TypeOfBoardEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }




}
