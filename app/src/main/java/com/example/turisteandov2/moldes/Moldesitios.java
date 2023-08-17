package com.example.turisteandov2.moldes;

public class Moldesitios {
    private String nombre;
    private String precio;
    private String telefono;
    private Integer foto;
    private Integer foto1;
    private Integer foto2;
    private Integer foto3;
    private Integer foto4;

    public Moldesitios() {
    }

    public Moldesitios(String nombre, String precio, String telefono, Integer foto, Integer foto1, Integer foto2, Integer foto3, Integer foto4) {
        this.nombre = nombre;
        this.precio = precio;
        this.telefono = telefono;
        this.foto = foto;
        this.foto1 = foto1;
        this.foto2 = foto2;
        this.foto3 = foto3;
        this.foto4 = foto4;
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

    public void setFoto(Integer foto) {
        this.foto = foto;
    }

    public Integer getFoto1() {
        return foto1;
    }

    public void setFoto1(Integer foto1) {
        this.foto1 = foto1;
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

    public Integer getFoto4() {
        return foto4;
    }

    public void setFoto4(Integer foto4) {
        this.foto4 = foto4;
    }
}
