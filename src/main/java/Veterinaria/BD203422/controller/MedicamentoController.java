package Veterinaria.BD203422.controller;

import Veterinaria.BD203422.model.Mascota;
import Veterinaria.BD203422.model.Medicamento;
import Veterinaria.BD203422.repository.MedicamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MedicamentoController {

    @Autowired
    MedicamentoRepository medicamentoRepository;

    @GetMapping(value = "medicamento")
    public List<Medicamento> getListMedicamento(){

        return medicamentoRepository.findAll();
    }

    @PostMapping(value = "/Medicamento/add")
    public Medicamento addMedicamento(@RequestBody Medicamento medicamento){

        return medicamentoRepository.save(medicamento);
    }
}
