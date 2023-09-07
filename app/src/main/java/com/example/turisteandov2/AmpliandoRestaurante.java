package com.example.turisteandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.turisteandov2.moldes.Moldehoteles;
import com.example.turisteandov2.moldes.Molderestaurantes;

public class AmpliandoRestaurante extends AppCompatActivity {

    Molderestaurantes molderestaurantes;
    ImageView fotoAmpliandoRest;
    TextView nombreAmpliandoRest;
    TextView numeroApmliandoRest;
    TextView precioAmpliandoRest;
    TextView platorecomendado;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_restaurante);
        fotoAmpliandoRest=findViewById(R.id.fotorestampliando);
        nombreAmpliandoRest=findViewById(R.id.titulorestampliando);
        numeroApmliandoRest=findViewById(R.id.numerorestampliando);
        precioAmpliandoRest=findViewById(R.id.preciorestampliando);
        platorecomendado=findViewById(R.id.platorecomendado);
        molderestaurantes =(Molderestaurantes)getIntent().getSerializableExtra("datosrestaurantes");

        fotoAmpliandoRest.setImageResource(molderestaurantes.getFoto());
        nombreAmpliandoRest.setText(molderestaurantes.getTitulo());
        numeroApmliandoRest.setText(molderestaurantes.getTelefono());
        precioAmpliandoRest.setText(molderestaurantes.getPrecio());
        platorecomendado.setText(molderestaurantes.getPlato());
    }
}