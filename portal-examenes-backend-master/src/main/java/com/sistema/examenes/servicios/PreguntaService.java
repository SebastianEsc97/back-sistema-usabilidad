package com.sistema.examenes.servicios;

import com.sistema.examenes.modelo.Evaluacion;
import com.sistema.examenes.modelo.Pregunta;

import java.util.Set;

public interface PreguntaService {
    Pregunta agregarPregunta(Pregunta pregunta);
    Pregunta actualizarPregunta(Pregunta pregunta);
    Set<Pregunta> obtenerPreguntas();
    Pregunta obtenerPregunta(Long preguntaId);
    Set<Pregunta> obtenerPreguntasDelExamen(Evaluacion evaluacion);
    void eliminarPregunta(Long preguntaId);
}
