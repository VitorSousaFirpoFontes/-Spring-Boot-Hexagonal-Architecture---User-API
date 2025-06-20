package com.example.arq_hexagonal.infrastructure.controller;

import com.example.arq_hexagonal.application.service.UsuarioService;
import com.example.arq_hexagonal.domain.model.Usuario;
import com.example.arq_hexagonal.infrastructure.dto.UsuarioRegistroDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Usuario> cadastrar(@RequestBody UsuarioRegistroDTO dto) {
        Usuario usuario = new Usuario(null, dto.getNome(), dto.getEmail(), dto.getSenha());
        Usuario salvo = service.salvar(usuario);
        return ResponseEntity.ok(salvo);
    }
}
