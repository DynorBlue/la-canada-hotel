package repositorios;

import modelo.Estancia;
import modelo.ReporteArticulo;
import modelo.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServicioRepositorio extends JpaRepository<Servicio, Integer> {
    List<Servicio> findByEstanciaOrderByFechaAsc(Estancia estancia);
}
