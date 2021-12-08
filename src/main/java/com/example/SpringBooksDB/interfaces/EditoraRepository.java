package com.example.SpringBooksDB.interfaces;

import com.example.SpringBooksDB.entities.Editora;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EditoraRepository extends JpaRepository<Editora, Long> {
}
