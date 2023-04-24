package com.sistema.examenes.controladores;

import com.sistema.examenes.modelo.Principio;
import com.sistema.examenes.servicios.PrincipioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/principio")
@CrossOrigin("*")
public class PrincipioController {

    @Autowired
    private PrincipioService principioService;
    @PostMapping("/")
    public ResponseEntity<Principio> guardarPrincipio(@RequestBody Principio principio){
        Principio principioGuardado = principioService.agregarPrincipio(principio);
        return ResponseEntity.ok(principioGuardado);
    }

    @GetMapping("/{principioId}")
    public Principio listarPrincipioPorId(@PathVariable("principioId") Long principioId){
        return principioService.obtenerPrincipio(principioId);
    }

    @GetMapping("/")
    public ResponseEntity<?> listarPrincipios(){
        return ResponseEntity.ok(principioService.obtenerPrincipios());
    }

    @PutMapping("/")
    public Principio actualizarPrincipio(@RequestBody Principio principio){
        return principioService.actualizarPrincipio(principio);
    }

    @DeleteMapping("/{principioId}")
    public void eliminarPrincipio(@PathVariable("principioId") Long principioId){
        principioService.eliminarPrincipio(principioId);
    }

}
