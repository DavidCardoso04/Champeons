package com.example.champeons.service;

import com.example.champeons.entity.Equipa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

import static com.example.champeons.ChampeonsApplication.equipaList;

@Service
public class JogosService {

    public ArrayList<Equipa> getList(){
        return equipaList;
    }

    public ArrayList<ArrayList> getAllGiveaway(){
        ArrayList<ArrayList> gameTable = new ArrayList<>(36);
        ArrayList<Equipa> pote1Bloqueados = new ArrayList<>(9);
        ArrayList<Equipa> pote2Bloqueados = new ArrayList<>(9);
        ArrayList<Equipa> pote3Bloqueados = new ArrayList<>(9);
        ArrayList<Equipa> pote4Bloqueados = new ArrayList<>(9);
        Random random = new Random();

        for(int i=0; i<equipaList.size(); i++){
            Equipa equipa = equipaList.get(i);
            ArrayList<Equipa> listaAdversarios = equipa.getAdversariosLista();
            listaAdversarios.add(equipa);

            for(int x=0; x<2;){
                int y = 1 + (int)(Math.random() * ((9 - 1) + 1);
                if(pote1Bloqueados.get(y-1) == null && equipa.getPais() != equipaList.get(y-1).getPais()){
                    pote1Bloqueados.set(y-1, equipaList.get(y-1));

                }
            }

            gameTable.add(listaAdversarios);
        }
        return gameTable;
    }
}
