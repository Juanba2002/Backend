package com.example.parcial.service;

import com.example.parcial.modelo.Biblioteca;
import com.example.parcial.repositories.BibliotecaRepository;

import java.util.Optional;

public class BibliotecaService implements BibliotecaRepository {
    @Override
    public <S extends Biblioteca> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Biblioteca> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Biblioteca> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Biblioteca> findAll() {
        return null;
    }

    @Override
    public Iterable<Biblioteca> findAllById(Iterable<Long> longs) {
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
    public void delete(Biblioteca entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Biblioteca> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
