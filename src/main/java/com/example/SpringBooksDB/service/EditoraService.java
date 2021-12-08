package com.example.SpringBooksDB.service;

import com.example.SpringBooksDB.entities.Autor;
import com.example.SpringBooksDB.entities.Editora;
import com.example.SpringBooksDB.interfaces.AutorRepository;
import com.example.SpringBooksDB.interfaces.EditoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EditoraService {
    @Autowired
    private EditoraRepository repo;

    public void iniciar(){
        repo.save(new Editora("Bumba Meu Boi"));
        repo.save(new Editora("Arqueiro"));
    }

    public Editora cadastraEditora(Editora editora) {
        repo.save(editora);
        return editora;
    }

    public List busca() {
        return (List) repo.findAll();
    }

    public Optional<Editora> buscaEditora(long Id) {

        return repo.findById(Id);
    }

    public void delete(long id) {
        repo.deleteById(id);
    }
}
