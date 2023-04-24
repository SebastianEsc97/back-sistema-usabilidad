package com.sistema.examenes.servicios.impl;

import com.sistema.examenes.modelo.Principio;
import com.sistema.examenes.repositorios.PrincipioRepository;
import com.sistema.examenes.servicios.PrincipioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;
@Service
public class PrincipioServiceImpl implements PrincipioService {
    @Autowired
    PrincipioRepository principioRepository;
    @Override
    public Principio agregarPrincipio(Principio principio) {
        return principioRepository.save(principio);
    }

    @Override
    public Principio actualizarPrincipio(Principio principio) {
        return principioRepository.save(principio);
    }

    @Override
    public Set<Principio> obtenerPrincipios() {
        return new LinkedHashSet<>(principioRepository.findAll());
    }

    @Override
    public Principio obtenerPrincipio(Long principioId) {
        return principioRepository.findById(principioId).get();
    }

    @Override
    public void eliminarPrincipio(Long principioId) {
        Principio principio= new Principio();
        principio.setPrincipioId(principioId);
        principioRepository.delete(principio);
    }
}
