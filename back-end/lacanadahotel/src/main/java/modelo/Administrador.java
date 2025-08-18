package modelo;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity // se usa para representar que esta clase es una entidad en la base de datos
@Table(name = "Administrador") // El nombre con el que se mapea la clase en la base de datos
public class Administrador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_administrador;

    @Column(nullable = false)
    private String usuario;

    @Column(nullable = false)
    private String nombre_completo;

    @Column(nullable = false)
    private String password_hash;

    @Column(nullable = false)
    private String password_salt;

    private LocalDate fecha_creacion;


    // constructor vacio

    public Administrador() {
    }
    //constructor lleno

    public Administrador(String usuario, String password_salt, String password_hash, String nombre_completo, int id_administrador, LocalDate fecha_creacion) {
        this.usuario = usuario;
        this.password_salt = password_salt;
        this.password_hash = password_hash;
        this.nombre_completo = nombre_completo;
        this.id_administrador = id_administrador;
        this.fecha_creacion = fecha_creacion;
    }


    //getters y setters

    public LocalDate getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(LocalDate fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public int getId_administrador() {
        return id_administrador;
    }

    public void setId_administrador(int id_administrador) {
        this.id_administrador = id_administrador;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getPassword_hash() {
        return password_hash;
    }

    public void setPassword_hash(String password_hash) {
        this.password_hash = password_hash;
    }

    public String getPassword_salt() {
        return password_salt;
    }

    public void setPassword_salt(String password_salt) {
        this.password_salt = password_salt;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
