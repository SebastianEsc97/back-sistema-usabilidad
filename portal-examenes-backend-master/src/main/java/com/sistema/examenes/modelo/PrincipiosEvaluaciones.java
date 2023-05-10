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

    @ManyToOne(fetch = FetchType.EAGER)
    private Evaluacion evaluacion;

    @ManyToOne(fetch = FetchType.EAGER)
    private Principio principio;

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
}
