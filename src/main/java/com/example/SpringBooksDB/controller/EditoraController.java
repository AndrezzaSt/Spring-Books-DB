package com.example.SpringBooksDB.controller;

import com.example.SpringBooksDB.entities.Autor;
import com.example.SpringBooksDB.entities.Editora;
import com.example.SpringBooksDB.service.AutorService;
import com.example.SpringBooksDB.service.EditoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/editora")
public class EditoraController {
    @Autowired
    EditoraService editoraService;

    @GetMapping("/iniciar")
    public void iniciar() {
        editoraService.iniciar();
    }

    @PostMapping("/cadastrar")
    public void cadastro(@RequestBody Editora editora) {
        editoraService.cadastraEditora(editora);
    }

    @GetMapping
    public List buscaTodos() {
        return editoraService.busca();
    }

    @GetMapping("/{id}")
    public Editora buscaEditora(@PathVariable("id") Long id) {
        return editoraService.buscaEditora(id).stream().findFirst().orElseThrow();
    }

    @DeleteMapping("/{editora}")
    public void delete(@PathVariable("id") Long id) {
        editoraService.delete(id);
    }
}
