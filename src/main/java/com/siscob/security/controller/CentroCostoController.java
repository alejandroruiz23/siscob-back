package com.siscob.security.controller;


import com.siscob.security.entity.CentroCosto;
import com.siscob.security.service.CentroCostoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/modulo/centro-costo")
@RequiredArgsConstructor

public class CentroCostoController {

    @Autowired
    private CentroCostoService service;

    @GetMapping
    public List<CentroCosto> listar(){
        return service.listar();
    }

    @PostMapping
    public CentroCosto insertar(@RequestBody CentroCosto ctoCosto){
        return service.insertar(ctoCosto);
    }

    @PutMapping
    public  CentroCosto actualizar(@RequestBody CentroCosto ctoCosto){
        return service.actualizar(ctoCosto);
    }

    @DeleteMapping
    public void eliminar(@RequestBody CentroCosto ctoCosto){
        service.eliminar(ctoCosto);
    }
}
