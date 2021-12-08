package com.example.SpringBooksDB.controller;

import com.example.SpringBooksDB.entities.Autor;
import com.example.SpringBooksDB.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/autor")
public class AutorController {
    @Autowired
    AutorService autorService;


    @PostMapping("/cadastro")
    public void cadastro(@RequestBody Autor autor) {
        autorService.cadastraAutor(autor);
    }

    @GetMapping("/buscar")
    public List buscaTodos() {
        return autorService.busca();
    }

    @GetMapping("/{id}")
    public Autor buscaAutor(@PathVariable("id") Long id) {
        return autorService.buscaAutor(id).stream().findFirst().orElseThrow();
    }

    @DeleteMapping("/{autor}")
    public void delete(@PathVariable("id") Long id) {
        autorService.delete(id);
    }

}
