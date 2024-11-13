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
            max = 10;
            if(pote1Max == 1){
                if(grid[equipa.getNrLista()-1][2] == null){
                    while (getTeam(min, max, equipa, pote1Max)==null){
                        Equipa equipa1 = getTeam(min, max, equipa, pote1Max);
                        if(equipa1 != null){
                            grid[equipa.getNrLista()-1][2] = equipa1;
                        }
                    }
                }
            }else{
                if(grid[equipa.getNrLista()-1][1] == null){
                    while (getTeam(min, max, equipa, pote1Max)==null){
                        Equipa equipa1 = getTeam(min, max, equipa, pote1Max);
                        if(equipa1 != null){
                            grid[equipa.getNrLista()-1][1] = equipa1;
                        }
                    }
                }
            }
            pote1Max--;
        }
        while(pote2Max != 0){
            min = 10;
            max = 18;
            if(pote2Max == 1){
                if(grid[equipa.getNrLista()-1][4] == null){
                    do{
                        Equipa equipa1 = getTeam(min, max, equipa, pote2Max);
                        if(equipa1 != null){
                            grid[equipa.getNrLista()-1][4] = equipa1;
                            break;
                        }
                    }while(true);
                }
            }else{
                if(grid[equipa.getNrLista()-1][3] == null){
                    do{
                        Equipa equipa1 = getTeam(min, max, equipa, pote2Max);
                        if(equipa1 != null){
                            grid[equipa.getNrLista()-1][3] = equipa1;
                            break;
                        }
                    }while(true);
                }
            }
            pote2Max--;
        }
        while(pote3Max != 0){
            min = 19;
            max = 27;
            if(pote3Max == 1){
                if(grid[equipa.getNrLista()-1][6] == null){
                    while (getTeam(min, max, equipa, pote3Max)==null){
                        Equipa equipa1 = getTeam(min, max, equipa, pote3Max);
                        if(equipa1 != null){
                            grid[equipa.getNrLista()-1][6] = equipa1;
                        }
                    }
                }
            }else{
                if(grid[equipa.getNrLista()-1][5] == null){
                    while (getTeam(min, max, equipa, pote3Max)==null){
                        Equipa equipa1 = getTeam(min, max, equipa, pote3Max);
                        if(equipa1 != null){
                            grid[equipa.getNrLista()-1][5] = equipa1;
                        }
                    }
                }
            }
            pote3Max--;
        }
        while(pote4Max != 0){
            min = 28;
            max = 35;
            if(pote4Max == 1){
                if(grid[equipa.getNrLista()-1][8] == null){
                    while (getTeam(min, max, equipa, pote4Max)==null){
                        Equipa equipa1 = getTeam(min, max, equipa, pote4Max);
                        if(equipa1 != null){
                            grid[equipa.getNrLista()-1][8] = equipa1;
                        }
                    }
                }
            }else{
                if(grid[equipa.getNrLista()-1][7] == null){
                    while (getTeam(min, max, equipa, pote4Max)==null){
                        Equipa equipa1 = getTeam(min, max, equipa, pote4Max);
                        if(equipa1 != null){
                            grid[equipa.getNrLista()-1][7] = equipa1;
                        }
                    }
                }
            }
            pote4Max--;
        }
    }

    public Equipa getTeam(int min, int max, Equipa equipa, int poteInserido){
        Random random = new Random();
        int randomNumber = random.nextInt(max + 1 - min) + min;

        Equipa equipaAdversaria = equipaList.get(randomNumber);

        if(checkTeam(equipa, equipaAdversaria, poteInserido)){
            if(poteInserido == 1){
                grid[equipaAdversaria.getNrLista()-1][2] = equipa;
                return equipaAdversaria;
            }else{
                grid[equipaAdversaria.getNrLista()-1][1] = equipa;
                return equipaAdversaria;
            }
        }
        return null;
    }

    public boolean checkTeam(Equipa equipa, Equipa equipaAdversaria, int poteInserido){

        //Se não existir adversario
        if(equipaAdversaria == null){
            return false;
        }

        //Se o adversario tiver os opunentes escolhidos
        if(poteInserido == 1){
            Equipa equipaVerificar = grid[equipaAdversaria.getNrLista()-1][2];
            if(equipaVerificar != null){
                return false;
            }
        }else{
            Equipa equipaVerificar = grid[equipaAdversaria.getNrLista()-1][1];
            if(equipaVerificar != null) {
                return false;
            }
        }

        if(equipa == equipaAdversaria){
            return false;
        }
        if(equipa.getPais() == equipaAdversaria.getPais()){
            return false;
        }

        return true;
    }
}