package com.letscode.battleship.enums;

public enum TypeOfPlayerEnum {
    PC_PLAYER("Bot"),
    PLAYER("Player");

    private String description;

    TypeOfPlayerEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
