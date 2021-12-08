package com.example.SpringBooksDB.entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String titulo;
    private int ano;

    @ManyToOne()
    private Editora editora;

    @ManyToMany
    private Collection<Autor> autores;

    public Livro() {
    }

    public Livro(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    public Long getId() {
        return id;
    }


}
