package com.sistema.examenes.modelo;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "principios_evaluaciones")
public class PrincipiosEvaluaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long principiosEvaluacionesId;

    private Long respuesta;
    @Column(columnDefinition = "VARCHAR(1000)")
    private String comentario;

    @ManyToOne(fetch = FetchType.EAGER)
    private Evaluacion evaluacion;

    @ManyToOne(fetch = FetchType.EAGER)
    private Principio principio;

    private Boolean estado;

    public Long getPrincipiosEvaluacionesId() {
        return principiosEvaluacionesId;
    }

    public void setPrincipiosEvaluacionesId(Long principiosEvaluacionesId) {
        this.principiosEvaluacionesId = principiosEvaluacionesId;
    }

    public long getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(long respuesta) {
        this.respuesta = respuesta;
    }

    public Evaluacion getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(Evaluacion evaluacion) {
        this.evaluacion = evaluacion;
    }

    public Principio getPrincipio() {
        return principio;
    }

    public void setPrincipio(Principio principio) {
        this.principio = principio;
    }

    public void setRespuesta(Long respuesta) {
        this.respuesta = respuesta;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
