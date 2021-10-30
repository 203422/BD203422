package Veterinaria.BD203422.repository;

import Veterinaria.BD203422.model.Duenio;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DuenioRepository extends CrudRepository<Duenio, Integer> {
    List<Duenio> findAll();
    Duenio save(Duenio duenio);
}
