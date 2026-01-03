package com.alura.frases.service;

import com.alura.frases.DTO.SerieDTO;
import com.alura.frases.models.Frase;
import com.alura.frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repositorio;

    public SerieDTO converteDados(Optional<Frase> frase){
        if(frase.isPresent()){
            Frase f = frase.get();
            return new SerieDTO(f.getId(), f.getTitulo(), f.getFrase(),
                    f.getPersonagem(), f.getPoster());
        }else{
            return null;
        }

    }

    public SerieDTO obterFrase(){
        return converteDados(repositorio.obterFraseAleatoria());
    }


}
