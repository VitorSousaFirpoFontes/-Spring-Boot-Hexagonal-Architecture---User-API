package com.example.arq_hexagonal.infrastructure.dto;

import lombok.Data;

@Data
public class UsuarioRegistroDTO {
    private String nome;
    private String email;
    private String senha;
}
