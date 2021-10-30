package Veterinaria.BD203422.controller;

import Veterinaria.BD203422.model.Duenio;
import Veterinaria.BD203422.repository.DuenioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DuenioController {

    @Autowired
    DuenioRepository duenioRepository;

    @GetMapping(value = "duenio")
    public List<Duenio> getListDuenio(){
        return duenioRepository.findAll();
    }

    @PostMapping(value = "/Duenio/add")
    public Duenio addDuenio(@RequestBody Duenio duenio){

        return duenioRepository.save(duenio);
    }
}

