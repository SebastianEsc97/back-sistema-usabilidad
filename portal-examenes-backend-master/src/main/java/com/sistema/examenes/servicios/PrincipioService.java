package com.sistema.examenes.servicios;

import com.sistema.examenes.modelo.Principio;

import java.util.Set;

public interface PrincipioService {
    Principio agregarPrincipio(Principio principio);
    Principio actualizarPrincipio(Principio principio);
    Set<Principio> obtenerPrincipios();
    Principio obtenerPrincipio(Long principioId);
    void eliminarPrincipio(Long principioId);
}
