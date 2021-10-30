package Veterinaria.BD203422.model;

import javax.persistence.*;

@Entity
@Table(name = "medicamento")
public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMedicamento;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "codigo")
    private String codigo;

    @Column(name = "fechaCaducidad")
    private String fechaCaducidad;

    @Column(name = "sustanciaActiva")
    private String sustanciaActiva;

    public Medicamento(){

    }

    public Medicamento(int idMedicamento, String nombre, String codigo, String fechaCaducidad, String sustanciaActiva){
        this.idMedicamento = idMedicamento;
        this.nombre = nombre;
        this.codigo = codigo;
        this.fechaCaducidad = fechaCaducidad;
        this.sustanciaActiva = sustanciaActiva;
    }

    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getSustanciaActiva() {
        return sustanciaActiva;
    }

    public void setSustanciaActiva(String sustanciaActiva) {
        this.sustanciaActiva = sustanciaActiva;
    }
}