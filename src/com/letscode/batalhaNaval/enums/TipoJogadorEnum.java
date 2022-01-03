package com.letscode.batalhaNaval.enums;

public enum TipoJogadorEnum {
    JOGADOR_PC("Computador"),
    JOGADOR("Jogador");

    private String descricao;

    TipoJogadorEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
