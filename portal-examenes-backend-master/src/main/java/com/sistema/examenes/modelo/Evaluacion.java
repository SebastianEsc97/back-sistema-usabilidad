package com.sistema.examenes.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "evaluaciones")
public class Evaluacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long evaluacionId;
    private String titulo;
    private String descripcion;
    private String numeroPreguntas;
    private boolean activo = false;
    @ManyToOne(fetch = FetchType.EAGER)
    private Principio principio;
    @OneToOne
    private Usuario usuario;
    @OneToMany(mappedBy = "evaluacion", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Pregunta> preguntas = new HashSet<>();

    public Long getEvaluacionId() {
        return evaluacionId;
    }

    public void setEvaluacionId(Long evaluacionId) {
        this.evaluacionId = evaluacionId;
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

    public String getNumeroPreguntas() {
        return numeroPreguntas;
    }

    public void setNumeroPreguntas(String numeroPreguntas) {
        this.numeroPreguntas = numeroPreguntas;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Principio getPrincipio() {
        return principio;
    }

    public void setPrincipio(Principio principio) {
        this.principio = principio;
    }

    public Set<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(Set<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Evaluacion() {

    }
}
