package com.example.champeons.controller;

import com.example.champeons.entity.Equipa;
import com.example.champeons.service.JogosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping(path = "/api/jogos/")
public class JogosController {

    private final JogosService jogosService;

    @GetMapping(path = "/list")
    public ArrayList<Equipa> todasEquipas(){
        return jogosService.getList();
    }

    @GetMapping(path = "/all/giveaway")
    public ArrayList<ArrayList> sorteioEquipas(){
        return jogosService.getAllGiveaway();
    }

    @Autowired
    public JogosController(JogosService jogosService) {
        this.jogosService = jogosService;
    }
}
