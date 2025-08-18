package modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "InventarioHabitacion")
public class InventarioHabitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_inventario;

    @ManyToOne
    @JoinColumn(name = "id_estancia")
    @Column(nullable = false)
    private Estancia estancia;

    private boolean control_AC;

    private boolean control_tv;

    private boolean minisplit;

    private boolean cama;

    private boolean tarjeta_llave;

   //constructor vacio

    public InventarioHabitacion() {
    }

    //constructor lleno

    public InventarioHabitacion(boolean cama, boolean tarjeta_llave, boolean minisplit, int id_inventario, Estancia estancia, boolean control_tv, boolean control_AC) {
        this.cama = cama;
        this.tarjeta_llave = tarjeta_llave;
        this.minisplit = minisplit;
        this.id_inventario = id_inventario;
        this.estancia = estancia;
        this.control_tv = control_tv;
        this.control_AC = control_AC;
    }


    //getters y setters

    public boolean isCama() {
        return cama;
    }

    public void setCama(boolean cama) {
        this.cama = cama;
    }

    public boolean isTarjeta_llave() {
        return tarjeta_llave;
    }

    public void setTarjeta_llave(boolean tarjeta_llave) {
        this.tarjeta_llave = tarjeta_llave;
    }

    public boolean isMinisplit() {
        return minisplit;
    }

    public void setMinisplit(boolean minisplit) {
        this.minisplit = minisplit;
    }

    public int getId_inventario() {
        return id_inventario;
    }

    public void setId_inventario(int id_inventario) {
        this.id_inventario = id_inventario;
    }

    public Estancia getEstancia() {
        return estancia;
    }

    public void setEstancia(Estancia estancia) {
        this.estancia = estancia;
    }

    public boolean isControl_tv() {
        return control_tv;
    }

    public void setControl_tv(boolean control_tv) {
        this.control_tv = control_tv;
    }

    public boolean isControl_AC() {
        return control_AC;
    }

    public void setControl_AC(boolean control_AC) {
        this.control_AC = control_AC;
    }
}
