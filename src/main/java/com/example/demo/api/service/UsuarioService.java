package com.example.demo.api.service;

import com.example.demo.api.model.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UsuarioService {

    private List<Usuario> userList;

    public UsuarioService(List<Usuario> userList) {
        userList = new ArrayList<>();

        Usuario user = new Usuario(1L, "João", "joao.com", "123");

        userList.addAll(Arrays.asList(user));

    }

    public Optional getUsuario(Integer id) {
        Optional<Object> optional = Optional.empty();
        for (Usuario user : userList) {
            if (id == user.getId()) {
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
