package com.example.champeons.service;

import com.example.champeons.entity.Equipa;
import com.example.champeons.entity.Pais;
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

        for(int i=0; i<equipaList.size(); i++){
            Equipa equipa = equipaList.get(i);
            ArrayList<Equipa> listaAdversarios = equipa.getAdversariosLista();

            for(int x=0; x<2;){
                if(equipa.getAdversariosLista().get(x) == null){
                    int y = 1 + (int)(Math.random() * ((9 - 1) + 1));
                    --y;
                    Equipa equipaAdversaria = equipaList.get(y);
                    Boolean conflito = false;
                    for(int verificarPais=0; verificarPais<48-1; verificarPais++){
                        if(equipaAdversaria.getAdversariosLista().get(verificarPais).getPais() == equipa.getPais()){
                            conflito = true;
                            break;
                        }
                    }
                    for(int verificarPaisProibido=0; verificarPaisProibido<equipaAdversaria.getPaisesConflito().size(); verificarPaisProibido++){
                        if(equipa.getPais() == equipaAdversaria.getPaisesConflito().get(verificarPaisProibido)){
                            conflito = true;
                            break;
                        }
                    }

                    if(conflito = false && equipa.getPais() != equipaAdversaria.getPais()){
                        for(int introduzir=0; introduzir<2; introduzir++){
                            if(equipa.getAdversariosLista().set(introduzir, equipaAdversaria) != null){
                                x++;
                            }
                        }
                    }
                }else{
                    x++;
                }
            }

            gameTable.add(listaAdversarios);
        }
        return gameTable;
    }
}
