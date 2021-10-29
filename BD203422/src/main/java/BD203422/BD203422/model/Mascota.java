package BD203422.BD203422.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mascota")
public class Mascota {

    @Id
    @Column(name = "idMascota")
    private int idMascota;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "fechaIngreso")
    private String fechaIngreso;

    @Column(name = "razon")
    private String razon;

    public Mascota(){

    }

    public Mascota(int idMascota, String nombre, String tipo, String fechaIngreso, String razon){
        this.idMascota = idMascota;
        this.nombre = nombre;
        this.tipo = tipo;
        this.fechaIngreso = fechaIngreso;
        this.razon = razon;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }
}
