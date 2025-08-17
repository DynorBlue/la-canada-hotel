package modelo;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "Estancia")
public class Estancia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_estancia;

    @ManyToOne
    @JoinColumn(name = "id_habitacion")
    //hacer los atributos  no nulos
    @Column(nullable = false)
    private Habitacion habitacion;

    @ManyToOne
    @JoinColumn(name = "id_huesped")
    @Column(nullable = false)
    private Huesped huesped;

    @Column(nullable = false)
    private int numero_personas;

    @Column(nullable = false)
    private String nombre_personas;

    @Column(nullable = false)
    private LocalDateTime fecha_entrada;

    @Column(nullable = false)
    private LocalDateTime fecha_salida;

    @Column(nullable = false)
    private BigDecimal tarifa_total;

    //constructor vacio

    public Estancia() {
    }

    //constructor lleno

    public Estancia(LocalDateTime fecha_entrada, LocalDateTime fecha_salida, Habitacion habitacion, Huesped huesped, String nombre_personas, int id_estancia, int numero_personas, BigDecimal tarifa_total) {
        this.fecha_entrada = fecha_entrada;
        this.fecha_salida = fecha_salida;
        this.habitacion = habitacion;
        this.huesped = huesped;
        this.nombre_personas = nombre_personas;
        this.id_estancia = id_estancia;
        this.numero_personas = numero_personas;
        this.tarifa_total = tarifa_total;
    }

    //setters y getters

    public LocalDateTime getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(LocalDateTime fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }

    public BigDecimal getTarifa_total() {
        return tarifa_total;
    }

    public void setTarifa_total(BigDecimal tarifa_total) {
        this.tarifa_total = tarifa_total;
    }

    public int getNumero_personas() {
        return numero_personas;
    }

    public void setNumero_personas(int numero_personas) {
        this.numero_personas = numero_personas;
    }

    public String getNombre_personas() {
        return nombre_personas;
    }

    public void setNombre_personas(String nombre_personas) {
        this.nombre_personas = nombre_personas;
    }

    public int getId_estancia() {
        return id_estancia;
    }

    public void setId_estancia(int id_estancia) {
        this.id_estancia = id_estancia;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public LocalDateTime getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(LocalDateTime fecha_salida) {
        this.fecha_salida = fecha_salida;
    }
}
