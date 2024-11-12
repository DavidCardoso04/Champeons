package com.example.champeons.entity;

import java.util.ArrayList;

public class Equipa {
    private int nrLista;
    private String nome;
    private int pontuacao;
    private Pais pais;
    private ArrayList<Pais> paisesConflito = new ArrayList<>();
    private static ArrayList<Equipa> adversariosLista = new ArrayList<>(10);
    private static int pote1 = 0;
    private static int pote2 = 0;
    private static int pote3 = 0;
    private static int pote4 = 0;


    @Override
    public String toString() {
        return "Equipa " +
                "com a posição " + nrLista +
                " nome " + nome +
                " pontuacao " + pontuacao +
                " do país " + pais;
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

    public ArrayList<Equipa> getAdversariosLista() {
        return adversariosLista;
    }

    public void setAdversariosLista(ArrayList<Equipa> adversariosLista) {
        this.adversariosLista = adversariosLista;
    }

    public Equipa() {
    }

    public Equipa(int nrLista, String nome, int pontuacao, Pais pais, ArrayList<Pais> paisesConflito) {
        this.nrLista = nrLista;
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.pais = pais;
        this.paisesConflito = paisesConflito;
    }
}
