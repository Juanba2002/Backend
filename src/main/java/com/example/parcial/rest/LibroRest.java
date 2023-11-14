package com.example.parcial.rest;
import com.example.parcial.modelo.Libro;
import com.example.parcial.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Libro/")
public class LibroRest {
    @Autowired
    private LibroService libroService;

    @CrossOrigin
    @PostMapping
    public ResponseEntity<Libro> createLibro(@RequestBody Libro libro) {
        Libro nuevoLibro = libroService.save(libro);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoLibro);
    }

    @CrossOrigin
    @GetMapping
    private ResponseEntity<List<Libro>> getAllLibros() {
        Iterable<Libro> libros = libroService.findAll();
        List<Libro> libroList = new ArrayList<>();

        libros.forEach(libroList::add);

        return ResponseEntity.ok(libroList);
    }

    @CrossOrigin
    @PutMapping("/{id}")
    public ResponseEntity<Libro> updateLibro(@PathVariable Long id, @RequestBody Libro libro) {
        Optional<Libro> libroExistente = libroService.findById(id);

        if (!libroExistente.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        libro.setId(id); // Aseguramos que la ID del libro sea la misma que la proporcionada en la URL.
        Libro libroActualizado = libroService.save(libro);

        return ResponseEntity.ok(libroActualizado);
    }

    @CrossOrigin
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLibro(@PathVariable Long id) {
        Optional<Libro> libroExistente = libroService.findById(id);

        if (libroExistente.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        libroService.delete(libroExistente.get());
        return ResponseEntity.noContent().build();
    }

}
