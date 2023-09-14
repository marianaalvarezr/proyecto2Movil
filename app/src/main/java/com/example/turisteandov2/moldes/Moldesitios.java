package com.example.turisteandov2.moldes;

import java.io.Serializable;

public class Moldesitios implements Serializable {
    private String nombre;
    private String precio;
    private String telefono;
    private Integer foto;
    private String descripcion;
    private Integer foto2;
    private Integer foto3;
    private String comentario;
    private String calificacion;
    public Moldesitios() {
    }

    public Moldesitios(String nombre, String precio, String telefono, Integer foto, String descripcion, Integer foto2, Integer foto3, String comentario, String calificacion) {
        this.nombre = nombre;
        this.precio = precio;
        this.telefono = telefono;
        this.foto = foto;
        this.descripcion = descripcion;
        this.foto2 = foto2;
        this.foto3 = foto3;
        this.comentario = comentario;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
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

    public void setFoto1(Integer foto1) {
        this.foto = foto;
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
