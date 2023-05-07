package com.sistema.examenes.servicios.impl;

import com.sistema.examenes.modelo.Evaluacion;
import com.sistema.examenes.modelo.Usuario;
import com.sistema.examenes.repositorios.EvaluacionRepository;
import com.sistema.examenes.servicios.EvaluacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Service
public class EvaluacionServiceImpl implements EvaluacionService {

    @Autowired
    private EvaluacionRepository evaluacionRepository;
    @Override
    public Evaluacion agregarEvaluacion(Evaluacion evaluacion) {
        return evaluacionRepository.save(evaluacion);
    }

    @Override
    public Evaluacion actualizarEvaluacion(Evaluacion evaluacion) {
        return evaluacionRepository.save(evaluacion);
    }

    @Override
    public Set<Evaluacion> obtenerEvaluaciones() {
        return new LinkedHashSet<>(evaluacionRepository.findAll());
    }

    @Override
    public Evaluacion obtenerEvaluacion(Long evaluacionId) {
        return evaluacionRepository.findById(evaluacionId).get();
    }

    @Override
    public List<Evaluacion> obtenerPorUsuario(Usuario usuario) {
        return this.evaluacionRepository.findByUsuario(usuario);
    }


    @Override
    public void eliminarEvaluacion(Long evaluacionId) {
        Evaluacion evaluacion = new Evaluacion();
        evaluacion.setEvaluacionId(evaluacionId);
        evaluacionRepository.delete(evaluacion);

    }
}
