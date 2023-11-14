package com.example.parcial.service;

import com.example.parcial.modelo.Libro;
import com.example.parcial.repositories.LibroRepository;

import java.util.Optional;

public class LibroService implements LibroRepository {
    @Override
    public <S extends Libro> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Libro> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Libro> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Libro> findAll() {
        return null;
    }

    @Override
    public Iterable<Libro> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Libro entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Libro> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
