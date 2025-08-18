package modelo;


import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Entity
@Table(name = "Servicio")
public class Servicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_servicio;

    @ManyToOne
    @JoinColumn(name = "id_estancia")
    @Column(nullable = false)
    private Estancia estancia;

    @Column(nullable = false, length = 100)
    private String nombre_servicio;

    @Column(nullable = false)
    private BigDecimal costo;

    @Column(nullable = false)
    private LocalDateTime fecha_solicitud;

    @Column(nullable = false, length = 50)
    private String estado_pago;

    private LocalDateTime fecha_pago;

    @Column(length = 50)
    private String forma_pago;

    //constructor vacio

    public Servicio() {
    }

    //constructor lleno

    public Servicio(BigDecimal costo, String nombre_servicio, int id_servicio, String forma_pago, LocalDateTime fecha_solicitud, LocalDateTime fecha_pago, Estancia estancia, String estado_pago) {
        this.costo = costo;
        this.nombre_servicio = nombre_servicio;
        this.id_servicio = id_servicio;
        this.forma_pago = forma_pago;
        this.fecha_solicitud = fecha_solicitud;
        this.fecha_pago = fecha_pago;
        this.estancia = estancia;
        this.estado_pago = estado_pago;
    }

    //getters y setters


    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }

    public String getEstado_pago() {
        return estado_pago;
    }

    public void setEstado_pago(String estado_pago) {
        this.estado_pago = estado_pago;
    }

    public Estancia getEstancia() {
        return estancia;
    }

    public void setEstancia(Estancia estancia) {
        this.estancia = estancia;
    }

    public LocalDateTime getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(LocalDateTime fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public LocalDateTime getFecha_solicitud() {
        return fecha_solicitud;
    }

    public void setFecha_solicitud(LocalDateTime fecha_solicitud) {
        this.fecha_solicitud = fecha_solicitud;
    }

    public String getForma_pago() {
        return forma_pago;
    }

    public void setForma_pago(String forma_pago) {
        this.forma_pago = forma_pago;
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public String getNombre_servicio() {
        return nombre_servicio;
    }

    public void setNombre_servicio(String nombre_servicio) {
        this.nombre_servicio = nombre_servicio;
    }
}
