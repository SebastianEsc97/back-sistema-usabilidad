package com.sistema.examenes.servicios;


import com.sistema.examenes.modelo.Evaluacion;
import com.sistema.examenes.modelo.PrincipiosEvaluaciones;
import com.sistema.examenes.modelo.Usuario;

import java.util.List;

public interface PrincipiosEvaluacionesService {

    PrincipiosEvaluaciones agregarPrincipioEvaluacion(PrincipiosEvaluaciones principiosEvaluaciones);
    PrincipiosEvaluaciones actualizarPrincipioEvaluacion(PrincipiosEvaluaciones principiosEvaluaciones);
    List<PrincipiosEvaluaciones> obtenerPorEvaluacion(Evaluacion evaluacion);

}
