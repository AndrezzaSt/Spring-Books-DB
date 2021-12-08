package com.example.SpringBooksDB.controller;

import com.example.SpringBooksDB.entities.Editora;
import com.example.SpringBooksDB.entities.Livro;
import com.example.SpringBooksDB.service.EditoraService;
import com.example.SpringBooksDB.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/livro")
public class LivroController {
    @Autowired
    LivroService livroService;

    @GetMapping("/iniciar")
    public void iniciar() {
        livroService.iniciar();
    }

    @PostMapping("/cadastrar")
    public void cadastro(@RequestBody Livro livro) {
        livroService.cadastraLivro(livro);
    }

    @GetMapping
    public List buscaTodos() {
        return livroService.busca();
    }

    @GetMapping("/{id}")
    public Livro buscaLivro(@PathVariable("id") Long id) {
        return livroService.buscaLivro(id).stream().findFirst().orElseThrow();
    }

    @DeleteMapping("/{livro}")
    public void delete(@PathVariable("id") Long id) {
        livroService.delete(id);
    }
}
