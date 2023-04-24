package com.sistema.examenes.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "principios")
public class Principio {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long principioId;
    private String titulo;
    private String descripcion;
    @OneToMany(mappedBy = "principio",cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Evaluacion> evaluaciones = new LinkedHashSet<>();

    public Long getPrincipioId() {
        return principioId;
    }

    public void setPrincipioId(Long principioId) {
        this.principioId = principioId;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Set<Evaluacion> getEvaluaciones() {
        return evaluaciones;
    }

    public void setEvaluaciones(Set<Evaluacion> evaluaciones) {
        this.evaluaciones = evaluaciones;
    }

    public Principio( ) {
    }
}
