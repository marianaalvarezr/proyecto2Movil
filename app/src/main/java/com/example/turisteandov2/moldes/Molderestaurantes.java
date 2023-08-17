package com.example.turisteandov2.moldes;

public class Molderestaurantes {
    private String titulo;
    private String precio;
    private String tituloplato;
    private String plato;
    private String telefono;
    private Integer foto;
    private Integer fotoPlato;

    public Molderestaurantes() {
    }

    public Molderestaurantes(String titulo, String precio, String tituloplato, String plato, String telefono, Integer foto, Integer fotoPlato) {
        this.titulo = titulo;
        this.precio = precio;
        this.tituloplato = tituloplato;
        this.plato = plato;
        this.telefono = telefono;
        this.foto = foto;
        this.fotoPlato = fotoPlato;
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

    public String getTituloplato() {
        return tituloplato;
    }

    public void setTituloplato(String tituloplato) {
        this.tituloplato = tituloplato;
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

    public Integer getFotoPlato() {
        return fotoPlato;
    }

    public void setFotoPlato(Integer fotoPlato) {
        this.fotoPlato = fotoPlato;
    }
}

