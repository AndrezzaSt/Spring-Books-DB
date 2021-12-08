package com.example.SpringBooksDB.interfaces;

import com.example.SpringBooksDB.entities.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
