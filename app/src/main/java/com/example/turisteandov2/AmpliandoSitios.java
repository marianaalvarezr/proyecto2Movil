package com.example.turisteandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.turisteandov2.moldes.Moldehoteles;
import com.example.turisteandov2.moldes.Moldesitios;

public class AmpliandoSitios extends AppCompatActivity {
    Moldesitios moldesitios;
    ImageView fotoAmpliandoSitios;
    TextView nombreAmpliandoSitios;
    TextView numeroAmpliandoSitios;
    TextView precioAmpliandoSitios;
    TextView descripcionsitios;
    ImageView fotoAmpliandoSitios2;
    ImageView fotoAmpliandoSitios3;
    TextView calificacionAmpliandoSitios;
    TextView comentarioAmpliandoSitios;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_sitios);

        fotoAmpliandoSitios=findViewById(R.id.fotositiosampliando);
        nombreAmpliandoSitios=findViewById(R.id.titulositiosampliando);
        numeroAmpliandoSitios=findViewById(R.id.numerositiosampliando);
        precioAmpliandoSitios=findViewById(R.id.preciositiosampliando);
        descripcionsitios=findViewById(R.id.descripcionsitiosampliando);
        fotoAmpliandoSitios2=findViewById(R.id.imagensitios1);
        fotoAmpliandoSitios3=findViewById(R.id.imagensitios2);
        calificacionAmpliandoSitios=findViewById(R.id.calificaionampliandositios);
        comentarioAmpliandoSitios=findViewById(R.id.comentarioampliandositios);

        moldesitios=(Moldesitios)getIntent().getSerializableExtra("datossitios");

        fotoAmpliandoSitios.setImageResource(moldesitios.getFoto());
        nombreAmpliandoSitios.setText(moldesitios.getNombre());
        numeroAmpliandoSitios.setText(moldesitios.getTelefono());
        numeroAmpliandoSitios.setText(moldesitios.getPrecio());
        precioAmpliandoSitios.setText((moldesitios.getPrecio()));
        descripcionsitios.setText(moldesitios.getDescripcion());
        fotoAmpliandoSitios2.setImageResource(moldesitios.getFoto2());
        fotoAmpliandoSitios3.setImageResource(moldesitios.getFoto3());
        calificacionAmpliandoSitios.setText(moldesitios.getCalificacion());
        comentarioAmpliandoSitios.setText(moldesitios.getComentario());
    }
}