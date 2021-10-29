package Veterinaria.BD203422.controller;

import Veterinaria.BD203422.model.Mascota;
import Veterinaria.BD203422.repository.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MascotaController {

    @Autowired
    MascotaRepository mascotaRepository;

    @GetMapping(value = "mascota")
    public List<Mascota> getListMascota(){
        return mascotaRepository.findAll();
    }
}
