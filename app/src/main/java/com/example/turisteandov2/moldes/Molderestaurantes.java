package com.example.turisteandov2.moldes;

import java.io.Serializable;

public class Molderestaurantes implements Serializable {
    private String titulo;
    private String precio;
    private String plato;
    private String telefono;
    private Integer foto;
    private String descripcion;
    private Integer foto2;
    private Integer foto3;
    private String comentario;
    private String calificacion;

    public Molderestaurantes() {
    }

    public Molderestaurantes(String titulo, String precio, String plato, String telefono, Integer foto, String descripcion, Integer foto2, Integer foto3, String comentario, String calificacion) {
        this.titulo = titulo;
        this.precio = precio;
        this.plato = plato;
        this.telefono = telefono;
        this.foto = foto;
        this.descripcion = descripcion;
        this.foto2 = foto2;
        this.foto3 = foto3;
        this.comentario = comentario;
        this.calificacion = calificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getPlato() {
        return plato;
    }

    public void setPlato(String plato) {
        this.plato = plato;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getFoto2() {
        return foto2;
    }

    public void setFoto2(Integer foto2) {
        this.foto2 = foto2;
    }

    public Integer getFoto3() {
        return foto3;
    }

    public void setFoto3(Integer foto3) {
        this.foto3 = foto3;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }
}

