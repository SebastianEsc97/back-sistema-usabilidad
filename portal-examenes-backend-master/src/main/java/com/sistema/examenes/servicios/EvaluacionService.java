package com.sistema.examenes.servicios;

import com.sistema.examenes.modelo.Evaluacion;

import java.util.Set;

public interface EvaluacionService {
    Evaluacion agregarEvaluacion(Evaluacion evaluacion);
    Evaluacion actualizarEvaluacion(Evaluacion evaluacion);
    Set<Evaluacion> obtenerEvaluaciones();
    Evaluacion obtenerEvaluacion(Long evaluacionId);
    void eliminarEvaluacion(Long evaluacionId);
}
