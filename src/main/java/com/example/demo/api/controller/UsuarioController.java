package com.example.demo.api.controller;

import com.example.demo.api.model.Usuario;
import com.example.demo.api.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UsuarioController {
    private UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/user")
    public Usuario getUser(@RequestParam Integer id) {
        Optional<Usuario> user = usuarioService.getUsuario(id);
        if (user.isPresent()) {
            return (Usuario) user.get();
        } else {
            return null;
        }

    }
}
