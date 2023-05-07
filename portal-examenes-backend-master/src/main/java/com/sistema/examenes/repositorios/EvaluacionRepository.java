package com.sistema.examenes.repositorios;

import com.sistema.examenes.modelo.Evaluacion;
import com.sistema.examenes.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EvaluacionRepository extends JpaRepository<Evaluacion,Long> {
    List<Evaluacion> findByUsuario(Usuario Usuario);

    List<Evaluacion> findByActivo(Boolean estado);

    List<Evaluacion> findByUsuarioAndActivo(Long UsuarioId,Boolean estado);
}
