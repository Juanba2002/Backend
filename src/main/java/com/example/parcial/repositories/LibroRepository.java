package com.example.parcial.repositories;

import com.example.parcial.modelo.Libro;
import org.springframework.data.repository.CrudRepository;

public interface LibroRepository extends CrudRepository<Libro, Long> {
}
