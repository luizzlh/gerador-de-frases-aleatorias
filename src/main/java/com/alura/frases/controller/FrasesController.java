package com.alura.frases.controller;

import com.alura.frases.DTO.SerieDTO;
import com.alura.frases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/series/frases")
public class FrasesController {
    @Autowired
    private FraseService servico;

    @GetMapping()
    public SerieDTO obterFrase(){
        return servico.obterFrase();
    }
}
