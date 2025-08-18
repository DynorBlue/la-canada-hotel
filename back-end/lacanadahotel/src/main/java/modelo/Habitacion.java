package modelo;


import jakarta.persistence.*;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "Habitacion")
public class Habitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_habitacion;

    @Column(nullable = false, length = 50)
    private String nombre_habitacion;

    @Column(nullable = false, length = 300)
    private String descripcion;

    @Column(nullable = false, length = 200)
    private String capacidad_maxima;

    private Boolean disponibilidad;

    //constructor

    public Habitacion() {
    }
    //constructor LLeno

    public Habitacion(String capacidad_maxima, String nombre_habitacion, int id_habitacion, Boolean disponibilidad, String descripcion) {
        this.capacidad_maxima = capacidad_maxima;
        this.nombre_habitacion = nombre_habitacion;
        this.id_habitacion = id_habitacion;
        this.disponibilidad = disponibilidad;
        this.descripcion = descripcion;
    }


    //getters y setters

    public String getCapacidad_maxima() {
        return capacidad_maxima;
    }

    public void setCapacidad_maxima(String capacidad_maxima) {
        this.capacidad_maxima = capacidad_maxima;
    }

    public String getNombre_habitacion() {
        return nombre_habitacion;
    }

    public void setNombre_habitacion(String nombre_habitacion) {
        this.nombre_habitacion = nombre_habitacion;
    }

    public int getId_habitacion() {
        return id_habitacion;
    }

    public void setId_habitacion(int id_habitacion) {
        this.id_habitacion = id_habitacion;
    }

    public Boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
