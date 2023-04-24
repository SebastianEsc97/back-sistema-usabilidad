package com.sistema.examenes.controladores;

import com.sistema.examenes.modelo.Evaluacion;
import com.sistema.examenes.servicios.EvaluacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/evaluacion")
@CrossOrigin("*")
public class EvaluacionController {
    @Autowired
    private EvaluacionService evaluacionService;

    @PostMapping("/")
    public ResponseEntity<Evaluacion> guardarEvaluacion(@RequestBody Evaluacion evaluacion){
        return ResponseEntity.ok(evaluacionService.agregarEvaluacion(evaluacion));
    }

    @PutMapping("/")
    public ResponseEntity<Evaluacion> actualizarEvaluacion(@RequestBody Evaluacion evaluacion){
        return ResponseEntity.ok(evaluacionService.actualizarEvaluacion(evaluacion));
    }

    @GetMapping("/")
    public ResponseEntity<?> listarEvaluaciones(){
        return ResponseEntity.ok(evaluacionService.obtenerEvaluaciones());
    }

    @GetMapping("/{evaluacionId}")
    public Evaluacion listarEvaluacion(@PathVariable("evaluacionId") Long evaluacionId){
        return evaluacionService.obtenerEvaluacion(evaluacionId);
    }

    @DeleteMapping("/{evaluacionId}")
    public void eliminarEvaluacion(@PathVariable("evaluacionId") Long evaluacionId){
        evaluacionService.eliminarEvaluacion(evaluacionId);
    }
/*
    @GetMapping("/categoria/{categoriaId}")
    public List<Evaluacion> listarEvaluacionesDeUnaCategoria(@PathVariable("categoriaId") Long categoriaId){
        Categoria categoria = new Categoria();
        categoria.setCategoriaId(categoriaId);
        return evaluacionService(categoria);
    }

    @GetMapping("/activo")
    public List<Evaluacion> listarEvaluacionesActivos(){
        return evaluacionService.();
    }

    @GetMapping("/categoria/activo/{categoriaId}")
    public List<Evaluacion> listarEvaluacionesActivosDeUnaCategoria(@PathVariable("categoriaId") Long categoriaId){
        Categoria categoria = new Categoria();
        categoria.setCategoriaId(categoriaId);
        return examenService.obtenerExamenesActivosDeUnaCategoria(categoria);
    }
*/
}
