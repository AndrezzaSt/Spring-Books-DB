package com.example.SpringBooksDB.entities;

import javax.persistence.*;
import java.util.*;

@Entity
public class Editora {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String nome;

    @OneToMany(mappedBy = "editora")
    private Collection<Livro> livros;

    public Editora() {
    }

    public Editora(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
