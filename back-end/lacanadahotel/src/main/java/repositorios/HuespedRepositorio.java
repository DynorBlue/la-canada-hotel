package repositorios;

import modelo.Estancia;
import modelo.Huesped;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HuespedRepositorio extends JpaRepository<Huesped, Integer> {
    List<Huesped> findByNombreAndApellido_paterno(String nombre, String apellido_paterno);}
