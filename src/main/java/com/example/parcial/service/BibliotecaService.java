package com.example.parcial.service;

import com.example.parcial.modelo.Biblioteca;
import com.example.parcial.repositories.BibliotecaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BibliotecaService implements BibliotecaRepository {

    @Autowired
    BibliotecaRepository bibliotecaRepository;

    @Override
    public <S extends Biblioteca> S save(S entity) {
        return bibliotecaRepository.save(entity);
    }

    @Override
    public <S extends Biblioteca> Iterable<S> saveAll(Iterable<S> entities) {
        return bibliotecaRepository.saveAll(entities);
    }

    @Override
    public Optional<Biblioteca> findById(Long id) {
        return bibliotecaRepository.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return bibliotecaRepository.existsById(id);
    }

    @Override
    public Iterable<Biblioteca> findAll() {
        return bibliotecaRepository.findAll();
    }

    @Override
    public Iterable<Biblioteca> findAllById(Iterable<Long> longs) {
        return bibliotecaRepository.findAllById(longs);
    }

    @Override
    public long count() {
        return bibliotecaRepository.count();
    }

    @Override
    public void deleteById(Long id) {
        bibliotecaRepository.deleteById(id);
    }

    @Override
    public void delete(Biblioteca entity) {
        bibliotecaRepository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {
        bibliotecaRepository.deleteAllById(longs);
    }

    @Override
    public void deleteAll(Iterable<? extends Biblioteca> entities) {
        bibliotecaRepository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        bibliotecaRepository.deleteAll();
    }
}
