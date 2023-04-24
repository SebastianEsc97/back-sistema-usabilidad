package com.sistema.examenes.repositorios;

import com.sistema.examenes.modelo.Evaluacion;
import com.sistema.examenes.modelo.Pregunta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface PreguntaRepository extends JpaRepository<Pregunta,Long> {
    Set<Pregunta> findByEvaluacion(Evaluacion evaluacion);
}
