package com.example.turisteandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.turisteandov2.moldes.Moldehoteles;
import com.example.turisteandov2.moldes.Moldesitios;

public class AmpliandoSitios extends AppCompatActivity {
    Moldesitios moldesitios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_sitios);
        moldesitios=(Moldesitios)getIntent().getSerializableExtra("datossitios");
        Toast.makeText(this, moldesitios.getNombre(), Toast.LENGTH_SHORT).show();
    }
}