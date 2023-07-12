package com.siscob.security.service;

import com.siscob.security.entity.CentroCosto;
import com.siscob.security.repository.CentroCostoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CentroCostoService {
    @Autowired
    private CentroCostoRepo repo;

    public List<CentroCosto> listar() {
        return repo.findAll();
    }

    public CentroCosto insertar(CentroCosto ctoCosto) {
        return repo.save(ctoCosto);
    }

    public CentroCosto actualizar(CentroCosto ctoCosto) {
        return repo.save(ctoCosto);
    }

    public void eliminar(CentroCosto ctoCosto ) {
        repo.delete(ctoCosto);
    }
}
