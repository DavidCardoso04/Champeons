package com.example.champeons.service;

import com.example.champeons.entity.Equipa;

import java.util.Random;

import static com.example.champeons.ChampeonsApplication.equipaList;

public class JogosService {
    public static int numRows = 36;
    public static int numCols = 9;
    public static Equipa[][] grid = new Equipa[numRows][numCols];

    public void getAllGiveaway(){
        setTableValues();
//        for(Equipa equipa : equipaList){
//            setTeams(equipa);
//        }

        setTeams(equipaList.get(0));
        setTeams(equipaList.get(1));
        setTeams(equipaList.get(2));
        setTeams(equipaList.get(3));
        setTeams(equipaList.get(4));
        setTeams(equipaList.get(5));
        setTeams(equipaList.get(6));
        setTeams(equipaList.get(7));

        printTable();
    }


    public void setTableValues(){
        for(int i = 0; i<equipaList.size(); i++){
            grid[i][0] = equipaList.get(i);
        }

        for(int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(j>0){
                    grid[i][j] = null;
                }
            }
            System.out.println();
        }
    }

    public void printTable(){
        for(int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (j == 0) {
                    System.out.print(i+1 + "|" + grid[i][j] + "-");
                }else if(j == 8) {
                    System.out.print(grid[i][j]);
                }else{
                    System.out.print(grid[i][j] + "-");
                }
            }
            System.out.println();
        }
    }

    public void setTeams(Equipa equipa){
        int pote1Max=2, pote2Max=2, pote3Max=2, pote4Max=2;


        int min, max;
        while(pote1Max != 0){
            min = 1;
            max = 9;
            if(pote1Max == 1){
                if(grid[equipa.getNrLista()-1][2] == null){
                    grid[equipa.getNrLista()-1][2] = getTeam(min, max, equipa, pote1Max);

                }
            }else{
                if(grid[equipa.getNrLista()-1][1] == null){
                    grid[equipa.getNrLista()-1][1] = getTeam(min, max, equipa, pote1Max);
                }
            }
            pote1Max--;
        }
        while(pote2Max != 0){
            min = 10;
            max = 18;
            if(pote2Max == 1){
                if(grid[equipa.getNrLista()-1][4] == null){
                    grid[equipa.getNrLista()-1][4] = getTeam(min, max, equipa, pote2Max);
                }
            }else{
                if(grid[equipa.getNrLista()-1][3] == null){
                    grid[equipa.getNrLista()-1][3] = getTeam(min, max, equipa, pote2Max);
                }
            }
            pote2Max--;
        }
        while(pote3Max != 0){
            min = 19;
            max = 27;
            if(pote3Max == 1){
                if(grid[equipa.getNrLista()-1][6] == null){
                    grid[equipa.getNrLista()-1][6] = getTeam(min, max, equipa, pote3Max);
                }
            }else{
                if(grid[equipa.getNrLista()-1][5] == null){
                    grid[equipa.getNrLista()-1][5] = getTeam(min, max, equipa, pote3Max);
                }
            }
            pote3Max--;
        }
        while(pote4Max != 0){
            min = 28;
            max = 35;
            if(pote4Max == 1){
                if(grid[equipa.getNrLista()-1][8] == null){
                    grid[equipa.getNrLista()-1][8] = getTeam(min, max, equipa, pote4Max);
                }
            }else{
                if(grid[equipa.getNrLista()-1][7] == null){
                    grid[equipa.getNrLista()-1][7] = getTeam(min, max, equipa, pote4Max);
                }
            }
            pote4Max--;
        }
    }

    public Equipa getTeam(int min, int max, Equipa equipa, int poteInserido){
        do{
            Random random = new Random();
            int randomNumber = random.nextInt(max + 1 - min) + min;

            Equipa equipaAdversaria = equipaList.get(randomNumber);

            //Verificar qual é o numero da equipa para saber se vamos colocar no pote 1, pote 2, pote 3 ou pote 4 da equipa adversaria
            if(equipaAdversaria.getNrLista() > 28){
                //Sabemos que é do pote 4, então vê-mos se é possivel colocar no pote 4 da equipa adversaria
                if(poteInserido == 1){
                    Equipa equipaVerificar = grid[equipaAdversaria.getNrLista()-1][8];
                    if(equipaVerificar == null){
                        grid[equipaAdversaria.getNrLista()-1][8] = equipa;
                        return equipaAdversaria;
                    }
                }else{
                    Equipa equipaVerificar = grid[equipaAdversaria.getNrLista()-1][7];
                    if(equipaVerificar == null) {
                        grid[equipaAdversaria.getNrLista()-1][7] = equipa;
                        return equipaAdversaria;
                    }
                }
            }else if(equipaAdversaria.getNrLista() > 19) {
                if(poteInserido == 1){
                    Equipa equipaVerificar = grid[equipaAdversaria.getNrLista()-1][6];
                    if(equipaVerificar == null){
                        grid[equipaAdversaria.getNrLista()-1][6] = equipa;
                        return equipaAdversaria;
                    }
                }else{
                    Equipa equipaVerificar = grid[equipaAdversaria.getNrLista()-1][5];
                    if(equipaVerificar == null) {
                        grid[equipaAdversaria.getNrLista()-1][5] = equipa;
                        return equipaAdversaria;
                    }
                }
            }else if(equipaAdversaria.getNrLista() > 10) {
                if(poteInserido == 1){
                    Equipa equipaVerificar = grid[equipaAdversaria.getNrLista()-1][4];
                    if(equipaVerificar == null){
                        grid[equipaAdversaria.getNrLista()-1][4] = equipa;
                        return equipaAdversaria;
                    }
                }else{
                    Equipa equipaVerificar = grid[equipaAdversaria.getNrLista()-1][3];
                    if(equipaVerificar == null) {
                        grid[equipaAdversaria.getNrLista()-1][3] = equipa;
                        return equipaAdversaria;
                    }
                }
            }else if(equipaAdversaria.getNrLista() > 0) {
                if(poteInserido == 1){
                    Equipa equipaVerificar = grid[equipaAdversaria.getNrLista()-1][2];
                    if(equipaVerificar == null){
                        grid[equipaAdversaria.getNrLista()-1][2] = equipa;
                        return equipaAdversaria;
                    }
                }else{
                    Equipa equipaVerificar = grid[equipaAdversaria.getNrLista()-1][1];
                    if(equipaVerificar == null) {
                        grid[equipaAdversaria.getNrLista()-1][1] = equipa;
                        return equipaAdversaria;
                    }
                }
            }
        }while(true);
    }
}
