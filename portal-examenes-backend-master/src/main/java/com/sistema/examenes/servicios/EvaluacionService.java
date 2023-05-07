package com.sistema.examenes.servicios;

import com.sistema.examenes.modelo.Evaluacion;
import com.sistema.examenes.modelo.Usuario;

import java.util.List;
import java.util.Set;

public interface EvaluacionService {
    Evaluacion agregarEvaluacion(Evaluacion evaluacion);
    Evaluacion actualizarEvaluacion(Evaluacion evaluacion);
    Set<Evaluacion> obtenerEvaluaciones();
    Evaluacion obtenerEvaluacion(Long evaluacionId);
    List<Evaluacion> obtenerPorUsuario(Usuario usuario);
    void eliminarEvaluacion(Long evaluacionId);
}
