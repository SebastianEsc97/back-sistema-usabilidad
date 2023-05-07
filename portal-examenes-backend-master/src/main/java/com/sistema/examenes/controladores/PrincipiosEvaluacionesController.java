package com.sistema.examenes.controladores;


import com.sistema.examenes.modelo.Evaluacion;
import com.sistema.examenes.modelo.PrincipiosEvaluaciones;
import com.sistema.examenes.modelo.Usuario;
import com.sistema.examenes.servicios.PrincipiosEvaluacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/principiosevaluaciones")
@CrossOrigin("*")
public class PrincipiosEvaluacionesController {
    @Autowired
    private PrincipiosEvaluacionesService principiosEvaluacionesService;

    @PostMapping("/")
    public ResponseEntity<PrincipiosEvaluaciones> guardar(@RequestBody PrincipiosEvaluaciones principiosEvaluaciones){
        return ResponseEntity.ok(principiosEvaluacionesService.agregarPrincipioEvaluacion(principiosEvaluaciones));
    }

    @PutMapping("/")
    public ResponseEntity<PrincipiosEvaluaciones> actualizar(@RequestBody PrincipiosEvaluaciones principiosEvaluaciones){
        return ResponseEntity.ok(principiosEvaluacionesService.actualizarPrincipioEvaluacion(principiosEvaluaciones));
    }

    @GetMapping("/evaluacion/{evaluacionId}")
    public List<PrincipiosEvaluaciones> traerPorEvaluacion(@PathVariable("evaluacionId") Long evaluacionId){
        Evaluacion evaluacion= new Evaluacion();
        evaluacion.setEvaluacionId(evaluacionId);
        return  principiosEvaluacionesService.obtenerPorEvaluacion(evaluacion);
    }
}
