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
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_sitios);

        fotoAmpliandoSitios=findViewById(R.id.fotositiosampliando);
        nombreAmpliandoSitios=findViewById(R.id.titulositiosampliando);
        numeroAmpliandoSitios=findViewById(R.id.numerositiosampliando);
        precioAmpliandoSitios=findViewById(R.id.preciositiosampliando);

        moldesitios=(Moldesitios)getIntent().getSerializableExtra("datossitios");

        fotoAmpliandoSitios.setImageResource(moldesitios.getFoto());
        nombreAmpliandoSitios.setText(moldesitios.getNombre());
        numeroAmpliandoSitios.setText(moldesitios.getTelefono());
        numeroAmpliandoSitios.setText(moldesitios.getPrecio());
    }
}