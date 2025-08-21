package repositorios;

import modelo.Estancia;
import modelo.Habitacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabitacionRepositorio extends JpaRepository<Habitacion, Integer> {
}
