package com.example.parcial.DTO;

import com.example.parcial.modelo.Biblioteca;

public class LibroDTO {

    private Long id;

    private String nombre;

    private String autor;

    private Biblioteca biblioteca;
    public LibroDTO(){

    }

    public LibroDTO(Long id, String nombre, String autor, Biblioteca biblioteca) {
        this.id = id;
        this.nombre = nombre;
        this.autor = autor;
        this.biblioteca = biblioteca;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }
}
