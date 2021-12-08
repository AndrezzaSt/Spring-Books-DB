package com.example.SpringBooksDB.interfaces;
import com.example.SpringBooksDB.entities.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AutorRepository extends JpaRepository<Autor, Long>{
}
