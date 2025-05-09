package com.libcode.ExamenCortoII.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.GenerationType;

@Entity
@Table(name="Clases")
public class Clase {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    @Column
    private String CodigoClase;

    @Column
    private String TipoClase;

    @Column
    private int cupo;

    @Column
    private String Horario;

    @Column
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "entrenador_id")
    private Entrenador entrenador;

    @ManyToMany
    @JoinTable(name = "AsistenciaClase",
            joinColumns = @JoinColumn(name = "clase_id"),
            inverseJoinColumns = @JoinColumn(name = "miembro_id"))
    private List<Miembro> miembros;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoClase() {
        return CodigoClase;
    }

    public void setCodigoClase(String codigoClase) {
        CodigoClase = codigoClase;
    }

    public String getTipoClase() {
        return TipoClase;
    }

    public void setTipoClase(String tipoClase) {
        TipoClase = tipoClase;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String horario) {
        Horario = horario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
}
