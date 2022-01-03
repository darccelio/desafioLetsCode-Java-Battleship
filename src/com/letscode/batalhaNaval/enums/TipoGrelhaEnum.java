package com.letscode.batalhaNaval.enums;

public enum TipoGrelhaEnum {
    GRELHA_JOGADOR_PC("Grelha do Computador"),
    GRELHA_JOGADOR("Grelha do Jogador"),
    GRELHA_INICIAL("Grelha");

    private String descricao;

    TipoGrelhaEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
