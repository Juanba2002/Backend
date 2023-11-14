package com.example.parcial.rest;

import com.example.parcial.modelo.Biblioteca;
import com.example.parcial.service.BibliotecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Biblioteca/")
public class BibliotecaRest {
    @Autowired
    private BibliotecaService bibliotecaService;

    @CrossOrigin
    @PostMapping
    public ResponseEntity<Biblioteca> createBiblioteca(@RequestBody Biblioteca biblioteca) {
        Biblioteca nuevaBiblioteca = bibliotecaService.save(biblioteca);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevaBiblioteca);
    }

    @CrossOrigin
    @GetMapping
    private ResponseEntity<List<Biblioteca>> getAllBibliotecas() {
        Iterable<Biblioteca> bibliotecas = bibliotecaService.findAll();
        List<Biblioteca> bibliotecaList = new ArrayList<>();

        bibliotecas.forEach(bibliotecaList::add);

        return ResponseEntity.ok(bibliotecaList);
    }

    @CrossOrigin
    @PutMapping("/{id}")
    public ResponseEntity<Biblioteca> updateBiblioteca(@PathVariable Long id, @RequestBody Biblioteca biblioteca) {
        Optional<Biblioteca> bibliotecaExistente = bibliotecaService.findById(id);

        if (!bibliotecaExistente.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        biblioteca.setId(id); // Aseguramos que la ID de la biblioteca sea la misma que la proporcionada en la URL.
        Biblioteca bibliotecaActualizada = bibliotecaService.save(biblioteca);

        return ResponseEntity.ok(bibliotecaActualizada);
    }

    @CrossOrigin
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBiblioteca(@PathVariable Long id) {
        Optional<Biblioteca> bibliotecaExistente = bibliotecaService.findById(id);

        if (bibliotecaExistente.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        bibliotecaService.delete(bibliotecaExistente.get());
        return ResponseEntity.noContent().build();
    }

}
