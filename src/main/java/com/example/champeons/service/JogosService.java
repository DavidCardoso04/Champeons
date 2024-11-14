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
//        setTeams(equipaList.get(7));
//        setTeams(equipaList.get(8));
//        setTeams(equipaList.get(9));
//        setTeams(equipaList.get(10));
//        setTeams(equipaList.get(11));
//        setTeams(equipaList.get(12));
//        setTeams(equipaList.get(13));
//        setTeams(equipaList.get(14));
//        setTeams(equipaList.get(15));
//        setTeams(equipaList.get(16));
//        setTeams(equipaList.get(17));
//        setTeams(equipaList.get(18));
//        setTeams(equipaList.get(19));
//        setTeams(equipaList.get(20));
//        setTeams(equipaList.get(21));
//        setTeams(equipaList.get(22));
//        setTeams(equipaList.get(23));
//        setTeams(equipaList.get(24));
//        setTeams(equipaList.get(25));
//        setTeams(equipaList.get(26));


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
        int poteNr = 0;
        if(equipa.getNrLista() <= 9){
            poteNr=1;
        }else if(equipa.getNrLista() <= 18){
            poteNr=3;
        }else if(equipa.getNrLista() <= 27){
            poteNr=5;
        }else if(equipa.getNrLista() <= 36){
            poteNr=7;
        }
        int min, max;
        while(poteNr <= 2){
            min = 1;
            max = 10;
            if(grid[equipa.getNrLista()-1][1] == null){
                while (!equipaList.get(equipa.getNrLista()-1).isPote11()){
                    Equipa equipa1 = getTeam(min, max, equipa, poteNr);
                    if(equipa1 != null){
                        equipaList.get(equipa1.getNrLista()-1).setPote11(true);
                        equipa.setPote11(true);
                        grid[equipa.getNrLista()-1][1] = equipa1;
                    }
                }
            }else if(grid[equipa.getNrLista()-1][2] == null){
                while (!equipaList.get(equipa.getNrLista()-1).isPote12()){
                    Equipa equipa1 = getTeam(min, max, equipa, poteNr);
                    if(equipa1 != null){
                        equipaList.get(equipa1.getNrLista()-1).setPote12(true);
                        equipa.setPote12(true);
                        grid[equipa.getNrLista()-1][2] = equipa1;
                    }
                }
            }
            poteNr++;
        }
        while(poteNr > 2 && poteNr <= 4){
            min = 10;
            max = 18;
            if(grid[equipa.getNrLista()-1][3] == null){
                while (!equipaList.get(equipa.getNrLista()-1).isPote21()){
                    Equipa equipa1 = getTeam(min, max, equipa, poteNr);
                    if(equipa1 != null){
                        equipaList.get(equipa1.getNrLista()-1).setPote21(true);
                        equipa.setPote21(true);
                        grid[equipa.getNrLista()-1][3] = equipa1;
                    }
                }
            }else if(grid[equipa.getNrLista()-1][4] == null){
                while (!equipaList.get(equipa.getNrLista()-1).isPote22()){
                    Equipa equipa1 = getTeam(min, max, equipa, poteNr);
                    if(equipa1 != null){
                        equipaList.get(equipa1.getNrLista()-1).setPote22(true);
                        equipa.setPote22(true);
                        grid[equipa.getNrLista()-1][4] = equipa1;
                    }
                }
            }
            poteNr++;
        }
        while(poteNr > 4 && poteNr <= 6){
            min = 19;
            max = 27;
            if(grid[equipa.getNrLista()-1][5] == null){
                while (!equipaList.get(equipa.getNrLista()-1).isPote31()){
                    Equipa equipa1 = getTeam(min, max, equipa, poteNr);
                    if(equipa1 != null){
                        equipaList.get(equipa1.getNrLista()-1).setPote31(true);
                        equipa.setPote31(true);
                        grid[equipa.getNrLista()-1][5] = equipa1;
                    }
                }
            }else if(grid[equipa.getNrLista()-1][6] == null){
                while (!equipaList.get(equipa.getNrLista()-1).isPote32()){
                    Equipa equipa1 = getTeam(min, max, equipa, poteNr);
                    if(equipa1 != null){
                        equipaList.get(equipa1.getNrLista()-1).setPote32(true);
                        equipa.setPote32(true);
                        grid[equipa.getNrLista()-1][6] = equipa1;
                    }
                }
            }
            poteNr++;
        }
        while(poteNr > 6 && poteNr <= 8){
            min = 28;
            max = 35;
            if(grid[equipa.getNrLista()-1][7] == null){
                while (!equipaList.get(equipa.getNrLista()-1).isPote41()){
                    Equipa equipa1 = getTeam(min, max, equipa, poteNr);
                    if(equipa1 != null){
                        equipaList.get(equipa1.getNrLista()-1).setPote41(true);
                        equipa.setPote41(true);
                        grid[equipa.getNrLista()-1][7] = equipa1;
                    }
                }
            }else if(grid[equipa.getNrLista()-1][8] == null){
                while (!equipaList.get(equipa.getNrLista()-1).isPote42()){
                    Equipa equipa1 = getTeam(min, max, equipa, poteNr);
                    if(equipa1 != null){
                        equipaList.get(equipa1.getNrLista()-1).setPote42(true);
                        equipa.setPote42(true);
                        grid[equipa.getNrLista()-1][8] = equipa1;
                    }
                }
            }
            poteNr++;
        }
    }

    public Equipa getTeam(int min, int max, Equipa equipa, int poteNr){
        Random random = new Random();
        int randomNumber = random.nextInt(max + 1 - min) + min;

        Equipa equipaAdversaria = equipaList.get(randomNumber);

        if(checkTeam(equipa, equipaAdversaria, poteNr)){
            if (equipa.getNrLista() <= 9) {
                if (poteNr % 2 == 0 && !equipaList.get(equipaAdversaria.getNrLista() - 1).isPote12()) {
                    equipaList.get(equipaAdversaria.getNrLista() - 1).setPote12(true);
                    grid[equipaAdversaria.getNrLista()-1][2] = equipa;
                    return equipaAdversaria;
                }else if(!equipaList.get(equipaAdversaria.getNrLista() - 1).isPote11()){
                    equipaList.get(equipaAdversaria.getNrLista() - 1).setPote11(true);
                    grid[equipaAdversaria.getNrLista()-1][1] = equipa;
                    return equipaAdversaria;
                }
            } else if (equipa.getNrLista() <= 18) {
                if (poteNr % 2 == 0 && !equipaList.get(equipaAdversaria.getNrLista() - 1).isPote22()) {
                    equipaList.get(equipaAdversaria.getNrLista() - 1).setPote22(true);
                    grid[equipaAdversaria.getNrLista()-1][4] = equipa;
                    return equipaAdversaria;
                }else if(!equipaList.get(equipaAdversaria.getNrLista() - 1).isPote21()){
                    equipaList.get(equipaAdversaria.getNrLista() - 1).setPote21(true);
                    grid[equipaAdversaria.getNrLista()-1][3] = equipa;
                    return equipaAdversaria;
                }
            } else if (equipa.getNrLista() <= 27) {
                if (poteNr % 2 == 0 && !equipaList.get(equipaAdversaria.getNrLista() - 1).isPote32()) {
                    equipaList.get(equipaAdversaria.getNrLista() - 1).setPote32(true);
                    grid[equipaAdversaria.getNrLista()-1][6] = equipa;
                    return equipaAdversaria;
                }else if(!equipaList.get(equipaAdversaria.getNrLista() - 1).isPote31()){
                    equipaList.get(equipaAdversaria.getNrLista() - 1).setPote31(true);
                    grid[equipaAdversaria.getNrLista()-1][5] = equipa;
                    return equipaAdversaria;
                }
            } else if (equipa.getNrLista() <= 36) {
                if (poteNr % 2 == 0 && !equipaList.get(equipaAdversaria.getNrLista() - 1).isPote42()) {
                    equipaList.get(equipaAdversaria.getNrLista() - 1).setPote42(true);
                    grid[equipaAdversaria.getNrLista()-1][8] = equipa;
                    return equipaAdversaria;
                }else if(!equipaList.get(equipaAdversaria.getNrLista() - 1).isPote41())
                    equipaList.get(equipaAdversaria.getNrLista() - 1).setPote41(true);
                    grid[equipaAdversaria.getNrLista()-1][7] = equipa;
                    return equipaAdversaria;
                }
            }
        return null;
    }

    public boolean checkTeam(Equipa equipa, Equipa equipaAdversaria, int poteNr){
        int x=0;
        //Se a equipa for do pote 9
        if(equipa.getNrLista() <= 9){
            //Verifica se é em casa
            if(!equipaList.get(equipa.getNrLista()-1).isPote11()){
                //Se a equipa adversaria está preenchida em casa no pote 1
                if(equipaList.get(equipaAdversaria.getNrLista()-1).isPote11()){
                    return false;
                }
            }else if(!equipaList.get(equipa.getNrLista()-1).isPote12()){
                if(equipaList.get(equipaAdversaria.getNrLista()-1).isPote12()){
                    return false;
                }
            }
        }else if(equipa.getNrLista() <= 18){
            if(!equipaList.get(equipa.getNrLista()-1).isPote21()){
                if(equipaList.get(equipaAdversaria.getNrLista()-1).isPote21()){
                    return false;
                }
            }else if(equipaList.get(equipa.getNrLista()-1).isPote22()){
                if(equipaList.get(equipaAdversaria.getNrLista()-1).isPote22()){
                    return false;
                }
            }
        }else if(equipa.getNrLista() <= 27){
            if(!equipaList.get(equipa.getNrLista()-1).isPote31()){
                if(equipaList.get(equipaAdversaria.getNrLista()-1).isPote31()){
                    return false;
                }
            }else if(!grid[equipa.getNrLista()-1][0].isPote32()){
                if(grid[equipaAdversaria.getNrLista()-1][0].isPote32()){
                    return false;
                }
            }
        }else if(equipa.getNrLista() <= 36){
            if(!equipaList.get(equipa.getNrLista()-1).isPote41()){
                if(equipaList.get(equipaAdversaria.getNrLista()-1).isPote41()){
                    return false;
                }
            }else if(!equipaList.get(equipa.getNrLista()-1).isPote42()){
                if(equipaList.get(equipaAdversaria.getNrLista()-1).isPote12()){
                    return false;
                }
            }
        }

        //Se a equipa adversaria já tiver este oponente ou 2 oponentes do mesmo pais
        for(int i=0; i<9; i++){
            if(grid[equipaAdversaria.getNrLista()-1][1] != null && grid[equipa.getNrLista()-1][i] != null){
                Equipa equipaAdversariaSpot = grid[equipaAdversaria.getNrLista()-1][1];
                Equipa equipaSpot = grid[equipa.getNrLista()-1][i];
                //Se já jogou contra essa equipa
                if(equipaAdversariaSpot.equals(equipaSpot)){
                    return false;
                }
                //Se já tem 2 jogos contra o mesmo pais
                if(equipaAdversariaSpot.getPais().equals(equipaSpot.getPais())){
                    x++;
                }if(x == 3){
                    return false;
                }
            }else if(grid[equipaAdversaria.getNrLista()-1][2] != null && grid[equipa.getNrLista()-1][i] != null){
                Equipa equipaAdversariaSpot = grid[equipaAdversaria.getNrLista()-1][2];
                Equipa equipaSpot = grid[equipa.getNrLista()-1][i];

                //Se já jogou contra essa equipa
                if(equipaAdversariaSpot.equals(equipaSpot)){
                    return false;
                }
                //Se já tem 2 jogos contra o mesmo pais
                if(equipaAdversariaSpot.getPais().equals(equipaSpot.getPais())){
                    x++;
                }if(x == 3){
                    return false;
                }
            }
        }

        //Se forem do mesmo pais
        if(equipa.getPais().equals(equipaAdversaria.getPais())){
            return false;
        }

        //Se o pais tiver conflito com o outro pais
        for(int i=0; i<equipa.getPaisesConflito().size(); i++){
            if(equipa.getPaisesConflito().get(i).equals(equipaAdversaria.getPais())){
                return false;
            }
        }

        return true;
    }
}