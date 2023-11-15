package com.example.parcial.service;

import com.example.parcial.modelo.Libro;
import com.example.parcial.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LibroService implements LibroRepository {

    @Autowired
    LibroRepository libroRepository;

    @Override
    public <S extends Libro> S save(S entity) {
        return libroRepository.save(entity);
    }

    @Override
    public <S extends Libro> Iterable<S> saveAll(Iterable<S> entities) {
        return libroRepository.saveAll(entities);
    }

    @Override
    public Optional<Libro> findById(Long id) {
        return libroRepository.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return libroRepository.existsById(id);
    }

    @Override
    public Iterable<Libro> findAll() {
        return libroRepository.findAll();
    }

    @Override
    public Iterable<Libro> findAllById(Iterable<Long> longs) {
        return libroRepository.findAllById(longs);
    }

    @Override
    public long count() {
        return libroRepository.count();
    }

    @Override
    public void deleteById(Long id) {
        libroRepository.deleteById(id);
    }

    @Override
    public void delete(Libro entity) {
        libroRepository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {
        libroRepository.deleteAllById(longs);
    }

    @Override
    public void deleteAll(Iterable<? extends Libro> entities) {
        libroRepository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        libroRepository.deleteAll();
    }
}
