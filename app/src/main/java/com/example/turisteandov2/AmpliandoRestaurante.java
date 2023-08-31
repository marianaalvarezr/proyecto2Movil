package com.example.turisteandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.turisteandov2.moldes.Moldehoteles;
import com.example.turisteandov2.moldes.Molderestaurantes;

public class AmpliandoRestaurante extends AppCompatActivity {

    Molderestaurantes molderestaurantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_restaurante);
        molderestaurantes =(Molderestaurantes)getIntent().getSerializableExtra("datosrestaurantes");
        Toast.makeText(this, molderestaurantes.getTitulo(), Toast.LENGTH_LONG).show();
    }
}