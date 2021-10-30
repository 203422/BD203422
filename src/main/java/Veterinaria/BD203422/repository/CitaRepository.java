package Veterinaria.BD203422.repository;

import Veterinaria.BD203422.model.Cita;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CitaRepository extends CrudRepository<Cita, Integer> {
    List<Cita> findAll();
    Cita save(Cita cita);
}
