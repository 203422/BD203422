package Veterinaria.BD203422.repository;

import Veterinaria.BD203422.model.Medicamento;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MedicamentoRepository extends CrudRepository<Medicamento, Integer> {
    List<Medicamento> findAll();
    Medicamento save(Medicamento medicamento);
}
