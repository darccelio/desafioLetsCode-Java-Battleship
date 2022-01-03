package com.letscode.batalhaNaval.jogadores;

import java.util.ArrayList;
import java.util.List;

public class Jogador {

    protected String nomeJogador;
    protected String tipoJogador;
    protected List<String> tiros;

    public Jogador(String nomeJogador, String tipoJogador, List<String> tiros) {
        this.nomeJogador = nomeJogador;
        this.tipoJogador = tipoJogador;
        this.tiros = new ArrayList<String>();
    }

    public List<String> getTiros() {
        return this.tiros;
    }

    public void setTiros(String posicaoTiro) {
        this.tiros.add(posicaoTiro);
    }

}
