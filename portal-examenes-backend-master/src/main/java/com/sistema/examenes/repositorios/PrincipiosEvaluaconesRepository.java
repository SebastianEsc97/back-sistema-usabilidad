package com.sistema.examenes.repositorios;

import com.sistema.examenes.modelo.Evaluacion;
import com.sistema.examenes.modelo.PrincipiosEvaluaciones;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PrincipiosEvaluaconesRepository extends JpaRepository<PrincipiosEvaluaciones, Long> {
    List<PrincipiosEvaluaciones> findByEvaluacion(Evaluacion evaluacion);

}
