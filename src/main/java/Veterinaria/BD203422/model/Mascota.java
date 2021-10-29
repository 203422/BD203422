package Veterinaria.BD203422.model;

import Veterinaria.BD203422.model.Mascota;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MascotaRepository extends CrudRepository<Mascota, Integer> {
    List<Mascota> findAll();
}
