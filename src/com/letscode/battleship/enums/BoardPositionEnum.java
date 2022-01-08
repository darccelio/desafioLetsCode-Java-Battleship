package com.letscode.battleship.enums;

public enum BoardPositionEnum {
    A(0),
    B(1),
    C(2),
    D(3),
    E(4),
    F(5),
    G(6),
    H(7),
    I(8),
    J(9);

    private int row;

    BoardPositionEnum(int row) {
        this.row = row;
    }

    public int getPosition() {
        return row;
    }
}
