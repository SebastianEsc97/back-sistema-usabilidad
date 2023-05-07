package com.sistema.examenes.servicios.impl;

import com.sistema.examenes.modelo.Evaluacion;
import com.sistema.examenes.modelo.PrincipiosEvaluaciones;
import com.sistema.examenes.repositorios.PrincipiosEvaluaconesRepository;
import com.sistema.examenes.servicios.PrincipiosEvaluacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrincipiosEvaluacionesServiceImpl implements PrincipiosEvaluacionesService {
    @Autowired
    private PrincipiosEvaluaconesRepository principiosEvaluaconesRepository;
    @Override
    public PrincipiosEvaluaciones agregarPrincipioEvaluacion(PrincipiosEvaluaciones principiosEvaluaciones) {
        return principiosEvaluaconesRepository.save(principiosEvaluaciones);
    }

    @Override
    public PrincipiosEvaluaciones actualizarPrincipioEvaluacion(PrincipiosEvaluaciones principiosEvaluaciones) {
        return principiosEvaluaconesRepository.save(principiosEvaluaciones);
    }

    @Override
    public List<PrincipiosEvaluaciones> obtenerPorEvaluacion(Evaluacion evaluacion) {
        return this.principiosEvaluaconesRepository.findByEvaluacion(evaluacion);
    }
}
