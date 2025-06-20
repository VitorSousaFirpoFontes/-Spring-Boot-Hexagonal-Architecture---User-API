package com.example.arq_hexagonal.application.service;

import com.example.arq_hexagonal.domain.model.Usuario;
import com.example.arq_hexagonal.domain.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public Usuario salvar(Usuario usuario) {
        return repository.save(usuario);
    }
}
