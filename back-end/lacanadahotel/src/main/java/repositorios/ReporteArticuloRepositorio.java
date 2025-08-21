package repositorios;

import modelo.Estancia;
import modelo.Huesped;
import modelo.ReporteArticulo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReporteArticuloRepositorio extends JpaRepository<ReporteArticulo, Integer> {

    List<ReporteArticulo> findAllByEstanciaOrderByFechaAsc(Estancia estancia);
}
