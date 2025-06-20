package com.example.arq_hexagonal.infrastructure.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class ValidacaoExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> tratarErro(Exception e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Erro: " + e.getMessage());
    }
}
