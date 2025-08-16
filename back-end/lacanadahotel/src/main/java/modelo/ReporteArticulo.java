package modelo;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "ReporteArticulo")
public class ReporteArticulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_reporte;

    @ManyToOne
    @JoinColumn(name = "id_estancia")
    private Estancia estancia;

    @Column(nullable = false)
    private String articulo;

    @Column(nullable = false)
    private String estado;

    @Column(nullable = false)
    private LocalDateTime fecha;

    //constructor vacio

    public ReporteArticulo() {
    }

    //constructor LLeno

    public ReporteArticulo(String articulo, String estado, Estancia estancia, LocalDateTime fecha, int id_reporte) {
        this.articulo = articulo;
        this.estado = estado;
        this.estancia = estancia;
        this.fecha = fecha;
        this.id_reporte = id_reporte;
    }

    //getters y setters


    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Estancia getEstancia() {
        return estancia;
    }

    public void setEstancia(Estancia estancia) {
        this.estancia = estancia;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public int getId_reporte() {
        return id_reporte;
    }

    public void setId_reporte(int id_reporte) {
        this.id_reporte = id_reporte;
    }
}
