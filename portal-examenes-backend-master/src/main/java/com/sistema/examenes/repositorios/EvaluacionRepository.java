package com.sistema.examenes.repositorios;

import com.sistema.examenes.modelo.Evaluacion;
import com.sistema.examenes.modelo.Principio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EvaluacionRepository extends JpaRepository<Evaluacion,Long> {
    List<Evaluacion> findByPrincipio(Principio principio);

    List<Evaluacion> findByActivo(Boolean estado);

    List<Evaluacion> findByPrincipioAndActivo(Principio principio,Boolean estado);
}
