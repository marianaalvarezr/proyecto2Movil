package com.example.turisteandov2.moldes;

public class Molderestaurantes {
    private String titulo;
    private String precio;
    private String plato;
    private String telefono;
    private Integer foto;

    public Molderestaurantes() {
    }

    public Molderestaurantes(String titulo, String precio, String plato, String telefono, Integer foto) {
        this.titulo = titulo;
        this.precio = precio;
        this.plato = plato;
        this.telefono = telefono;
        this.foto = foto;
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

}

