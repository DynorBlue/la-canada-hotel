package repositorios;

import modelo.Administrador;
import modelo.Estancia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface EstanciaRepositorio extends JpaRepository<Estancia, Integer> {

    List<Estancia> findByFechaEntradaOrderByFechaEntradaAsc(LocalDateTime fechaEntrada);
    List<Estancia> findByHabitacionNombre_habitacion(String nombre_habitacion);
    List<Estancia> findByHuespedNombre(String nombre);
}
