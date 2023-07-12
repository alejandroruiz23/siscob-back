package com.siscob.security.controller;


import com.siscob.security.service.UsuarioService;
import com.siscob.security.user.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/modulo/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping
    public List<Usuario> listar(){return service.listar();}


    //no funcionales los actualizar, eliminar
    @PutMapping
    public Usuario actualizar(@RequestBody Usuario usuario){return service.actualizar(usuario);}

    @DeleteMapping
    public void eliminar(@RequestBody Usuario usuario){service.eliminar(usuario);}
}
