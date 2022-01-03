package com.letscode.batalhaNaval.enums;

public enum PosiçãoTabuleiro {
    A0("00"),
    A1("01"),
    A2("02"),
    A3("03"),
    A4("04"),
    A5("05"),
    A6("06"),
    A7("07"),
    A8("08"),
    A9("09"),
    B0("10"),
    B1("11"),
    B2("12"),
    B3("13"),
    B4("14"),
    B5("15"),
    B6("16"),
    B7("17"),
    B8("18"),
    B9("19"),
    C0("20"),
    C1("21"),
    C2("22"),
    C3("23"),
    C4("24"),
    C5("25"),
    C6("26"),
    C7("27"),
    C8("28"),
    C9("29"),
    D0("30"),
    D1("31"),
    D2("32"),
    D3("33"),
    D4("34"),
    D5("35"),
    D6("36"),
    D7("37"),
    D8("38"),
    D9("39"),
    E0("40"),
    E1("41"),
    E2("42"),
    E3("43"),
    E4("44"),
    E5("45"),
    E6("46"),
    E7("47"),
    E8("48"),
    E9("49"),
    F0("50"),
    F1("51"),
    F2("52"),
    F3("53"),
    F4("54"),
    F5("55"),
    F6("56"),
    F7("57"),
    F8("58"),
    F9("59");

    private String descricao;

    PosiçãoTabuleiro(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
