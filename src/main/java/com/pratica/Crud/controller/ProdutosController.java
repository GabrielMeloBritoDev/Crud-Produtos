package com.pratica.Crud.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto")
public class ProdutosController {
    @GetMapping
    public ResponseEntity getAllprodutos(){
        return ResponseEntity.ok("Deu certo");
    }

}
