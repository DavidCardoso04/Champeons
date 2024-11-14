package com.example.champeons.entity;

import java.util.ArrayList;
import java.util.Objects;

public class Equipa {
    private int nrLista;
    private String nome;
    private int pontuacao;
    private Pais pais;
    private ArrayList<Pais> paisesConflito = new ArrayList<>();
    private boolean pote11, pote12, pote21, pote22, pote31, pote32, pote41, pote42;

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

    public boolean isPote11() {
        return pote11;
    }

    public void setPote11(boolean pote11) {
        this.pote11 = pote11;
    }

    public boolean isPote12() {
        return pote12;
    }

    public void setPote12(boolean pote12) {
        this.pote12 = pote12;
    }

    public boolean isPote21() {
        return pote21;
    }

    public void setPote21(boolean pote21) {
        this.pote21 = pote21;
    }

    public boolean isPote22() {
        return pote22;
    }

    public void setPote22(boolean pote22) {
        this.pote22 = pote22;
    }

    public boolean isPote31() {
        return pote31;
    }

    public void setPote31(boolean pote31) {
        this.pote31 = pote31;
    }

    public boolean isPote32() {
        return pote32;
    }

    public void setPote32(boolean pote32) {
        this.pote32 = pote32;
    }

    public boolean isPote41() {
        return pote41;
    }

    public void setPote41(boolean pote41) {
        this.pote41 = pote41;
    }

    public boolean isPote42() {
        return pote42;
    }

    public void setPote42(boolean pote42) {
        this.pote42 = pote42;
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
        this.pote11 = false;
        this.pote12 = false;
        this.pote21 = false;
        this.pote22 = false;
        this.pote31 = false;
        this.pote32 = false;
        this.pote41 = false;
        this.pote42 = false;
    }
}
