package com.example.champeons.entity;

import java.util.ArrayList;
import java.util.Objects;

public class Equipa {
    private int nrLista;
    private String nome;
    private int pontuacao;
    private Pais pais;
    private ArrayList<Pais> paisesConflito = new ArrayList<>();
    private static boolean pote11= false, pote12=false, pote21=false, pote22=false, pote31=false, pote32=false, pote41=false, pote42=false;
    private static int ENGLAND=0, SPAIN=0, ITALY=0, GERMANY=0, FRANCE=0,PORTUGAL=0, NETHERLANDS=0, BELGIUM=0, SWITZERLAND=0, TURKEY=0,
            AUSTRIA=0, SCOTLAND=0, DENMARK=0, SWEDEN=0, NORWAY=0, GREECE=0, CROATIA=0, SERBIA=0, UKRAINE=0, RUSSIA=0, HUNGARY=0, ISRAEL=0,
            POLAND=0, CZECH_REPUBLIC=0, ROMANIA=0, BULGARIA=0, SLOVAKIA=0, CYPRUS=0, BELARUS=0, LITHUANIA=0, GEORGIA=0, KAZAKHSTAN=0,
            AZERBAIJAN=0, ARMENIA=0, LUXEMBOURG=0, SLOVENIA=0, BOSNIA_AND_HERZEGOVINA=0, ALBANIA=0, MOLDOVA=0, MACEDONIA=0, MONTENEGRO=0,
            LATVIA=0, ESTONIA=0, ICELAND=0, FAROE_ISLANDS=0, GIBRALTAR=0, SAN_MARINO=0, MALTA=0, ANDORRA=0;


    @Override
    public String toString() {
        return nome;
    }

    public int getNrLista() {
        return nrLista;
    }

    public void setNrLista(int nrLista) {
        this.nrLista = nrLista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public ArrayList<Pais> getPaisesConflito() {
        return paisesConflito;
    }

    public void setPaisesConflito(ArrayList<Pais> paisesConflito) {
        this.paisesConflito = paisesConflito;
    }

    public Equipa() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipa equipa = (Equipa) o;
        return nrLista == equipa.nrLista && pontuacao == equipa.pontuacao && Objects.equals(nome, equipa.nome) && pais == equipa.pais && Objects.equals(paisesConflito, equipa.paisesConflito);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nrLista, nome, pontuacao, pais, paisesConflito);
    }

    public Equipa(int nrLista, String nome, int pontuacao, Pais pais, ArrayList<Pais> paisesConflito) {
        this.nrLista = nrLista;
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.pais = pais;
        this.paisesConflito = paisesConflito;
    }
}
