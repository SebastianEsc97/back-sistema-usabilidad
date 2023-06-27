package com.sistema.examenes.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "evaluaciones")
public class Evaluacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long evaluacionId;
    @Column(columnDefinition = "VARCHAR(1000)")
    private String url;
    @Column(columnDefinition = "VARCHAR(1000)")
    private String titulo;
    @Column(columnDefinition = "VARCHAR(1000)")
    private String descripcion;
    @Column
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column
    @Temporal(TemporalType.DATE)
    private Date ultimaFecha;
    private boolean activo = true;

    @ManyToOne(fetch = FetchType.EAGER)
    private Usuario usuario;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "evaluacion")
    @JsonIgnore
    private Set<PrincipiosEvaluaciones> principiosEvaluaciones = new HashSet<>();
    @Column(columnDefinition = "VARCHAR(1000)")
    private String comentario;

    public Evaluacion(Long evaluacionId) {
        this.evaluacionId = evaluacionId;
    }


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

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Set<PrincipiosEvaluaciones> getPrincipiosEvaluaciones() {
        return principiosEvaluaciones;
    }

    public void setPrincipiosEvaluaciones(Set<PrincipiosEvaluaciones> principiosEvaluaciones) {
        this.principiosEvaluaciones = principiosEvaluaciones;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getUltimaFecha() {
        return ultimaFecha;
    }

    public void setUltimaFecha(Date ultimaFecha) {
        this.ultimaFecha = ultimaFecha;
    }

    public Evaluacion() {

    }
}
