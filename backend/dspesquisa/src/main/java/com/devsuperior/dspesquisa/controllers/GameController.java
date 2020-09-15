package com.devsuperior.dspesquisa.controllers;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.devsuperior.dspesquisa.dto.GameDTO;
import com.devsuperior.dspesquisa.services.GameService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService service;

    @GetMapping
    public ResponseEntity<List<GameDTO>> findAll(){
        List<GameDTO> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
