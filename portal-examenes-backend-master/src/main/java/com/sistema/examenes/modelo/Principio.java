package com.sistema.examenes.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "principios")
public class Principio {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long principioId;
    @Column(columnDefinition = "VARCHAR(1000)")
    private String titulo;
    @Column(columnDefinition = "VARCHAR(1000)")
    private String descripcion;
    private Boolean activo= true;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "principio")
    @JsonIgnore
    private Set<PrincipiosEvaluaciones> principiosEvaluaciones = new HashSet<>();

    public Principio(Long principioId) {
        this.principioId = principioId;
    }

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

    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Principio( ) {
    }
}
