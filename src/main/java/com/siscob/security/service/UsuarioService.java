package com.siscob.security.service;

import com.siscob.security.user.Usuario;
import com.siscob.security.user.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepositorio repositorio;

    public List<Usuario> listar() {return repositorio.findAll();}

    //no funcionales los actualizar, eliminar
    public Usuario actualizar(Usuario usuario){return repositorio.save(usuario);}
    public void eliminar(Usuario usuario){repositorio.delete(usuario);}
}
