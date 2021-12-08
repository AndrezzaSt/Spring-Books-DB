package com.example.SpringBooksDB.service;

import com.example.SpringBooksDB.entities.Autor;
import com.example.SpringBooksDB.interfaces.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {
    @Autowired
    private AutorRepository repo;
//
//    public void iniciar(){
//        repo.save(new Autor("Andrezj","Nome Polones"));
//        repo.save(new Autor("Maria","Betania"));
//    }

    public Autor cadastraAutor(Autor autor) {
        repo.save(autor);
        return autor;
    }

    public List busca() {
        return (List) repo.findAll();
    }

    public Optional<Autor> buscaAutor(long Id) {

        return repo.findById(Id);
    }

    public void delete(long id) {
        repo.deleteById(id);
    }
}
