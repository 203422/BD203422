package Veterinaria.BD203422.controller;
import Veterinaria.BD203422.model.Cita;
import Veterinaria.BD203422.repository.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CitaController {

    @Autowired
    CitaRepository citaRepository;

    @GetMapping(value = "cita")
    public List<Cita> getListCita(){
        return citaRepository.findAll();
    }

    @PostMapping(value = "/Cita/add")
    public Cita addCita(@RequestBody Cita cita){
        return citaRepository.save(cita);
    }
}
