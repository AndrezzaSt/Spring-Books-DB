package com.example.SpringBooksDB.service;

import com.example.SpringBooksDB.entities.Editora;
import com.example.SpringBooksDB.entities.Livro;
import com.example.SpringBooksDB.interfaces.EditoraRepository;
import com.example.SpringBooksDB.interfaces.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {
    @Autowired
    private LivroRepository repo;

    public void iniciar(){
        repo.save(new Livro("As bizarras aventuras de JOJO", 1996));
        repo.save(new Livro("Beowulf", 1878 ));
    }


    public Livro cadastraLivro(Livro livro) {
        repo.save(livro);
        return livro;
    }

    public List busca() {
        return (List) repo.findAll();
    }

    public Optional<Livro> buscaLivro(long Id) {

        return repo.findById(Id);
    }

    public void delete(long id) {
        repo.deleteById(id);
    }
}
