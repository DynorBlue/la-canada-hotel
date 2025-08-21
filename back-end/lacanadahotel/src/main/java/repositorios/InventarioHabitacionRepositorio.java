package repositorios;

import modelo.Estancia;
import modelo.Huesped;
import modelo.InventarioHabitacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventarioHabitacionRepositorio extends JpaRepository<InventarioHabitacion, Integer> {
    InventarioHabitacion findByEstancia(Estancia estancia);}
