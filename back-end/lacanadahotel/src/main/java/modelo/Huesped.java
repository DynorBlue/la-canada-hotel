package modelo;


import jakarta.persistence.*;

@Entity
@Table(name = "Huesped")
public class Huesped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_huesped;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido_paterno;


    private String apellido_materno;

    private String correo_electronico;

    private String telefono;

    @Column(nullable = false)
    private String ciudad;

    @Column(nullable = false)
    private String pais;

    @Column(nullable = false)
    private String colonia;

    @Column(nullable = false)
    private String calle;

    @Column(nullable = false)
    private String numExt;


    private String numInt;

    //coonstructor vacio

    public Huesped() {
    }

    //constructor lleno

    public Huesped(String apellido_materno, String telefono, String apellido_paterno, String calle, String ciudad, String colonia, String correo_electronico, int id_huesped, String nombre, String numExt, String numInt, String pais) {
        this.apellido_materno = apellido_materno;
        this.telefono = telefono;
        this.apellido_paterno = apellido_paterno;
        this.calle = calle;
        this.ciudad = ciudad;
        this.colonia = colonia;
        this.correo_electronico = correo_electronico;
        this.id_huesped = id_huesped;
        this.nombre = nombre;
        this.numExt = numExt;
        this.numInt = numInt;
        this.pais = pais;
    }



    //setters y getters

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNumInt() {
        return numInt;
    }

    public void setNumInt(String numInt) {
        this.numInt = numInt;
    }

    public String getNumExt() {
        return numExt;
    }

    public void setNumExt(String numExt) {
        this.numExt = numExt;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_huesped() {
        return id_huesped;
    }

    public void setId_huesped(int id_huesped) {
        this.id_huesped = id_huesped;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }
}
