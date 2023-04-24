package com.sistema.examenes.controladores;

import com.sistema.examenes.modelo.Evaluacion;
import com.sistema.examenes.modelo.Pregunta;
import com.sistema.examenes.servicios.EvaluacionService;
import com.sistema.examenes.servicios.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/pregunta")
@CrossOrigin("*")
public class PreguntaController {
    @Autowired
    private PreguntaService preguntaService;

    @Autowired
    private EvaluacionService evaluacionService;

    @PostMapping("/")
    public ResponseEntity<Pregunta> guardarPregunta(@RequestBody Pregunta pregunta) {
        return ResponseEntity.ok(preguntaService.agregarPregunta(pregunta));
    }

    @PutMapping("/")
    public ResponseEntity<Pregunta> actualizarPregunta(@RequestBody Pregunta pregunta) {
        return ResponseEntity.ok(preguntaService.actualizarPregunta(pregunta));
    }

    @GetMapping("/evaluacion/{evaluacionId}")
    public ResponseEntity<?> listarPreguntasEvaluacion(@PathVariable("evaluacionId") Long evaluacionId){
        Evaluacion evaluacion = evaluacionService.obtenerEvaluacion(evaluacionId);
        Set<Pregunta> preguntas = evaluacion.getPreguntas();
        List evaluaciones = new ArrayList(preguntas);
        if(evaluaciones.size() > Integer.parseInt(evaluacion.getNumeroPreguntas())){
            evaluaciones = evaluaciones.subList(0,Integer.parseInt(evaluacion.getNumeroPreguntas() + 1));
        }
        //Collections.shuffle(evaluaciones);
        return ResponseEntity.ok(evaluaciones);

    }
    @GetMapping("/{preguntaId}")
    public Pregunta listarPreguntaPorId(@PathVariable("preguntaId") Long preguntaId){
        return preguntaService.obtenerPregunta(preguntaId);
    }

    @DeleteMapping("/{preguntaId}")
    public void eliminarPregunta(@PathVariable("preguntaId") Long preguntaId){
        preguntaService.eliminarPregunta(preguntaId);
    }
}
