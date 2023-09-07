package com.example.turisteandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.turisteandov2.moldes.Moldehoteles;

public class AmpliandoHotel extends AppCompatActivity {

    Moldehoteles moldeHotel;
    ImageView fotoApliandoHotel;
    TextView nombreAmpliandoHotel;
    TextView numerohotelAmpliando;
    TextView preciohotelAmpliando;
    TextView descripcionhotel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_hotel);
        fotoApliandoHotel=findViewById(R.id.fotohotelampliando);
        nombreAmpliandoHotel=findViewById(R.id.titulohotelampliando);
        numerohotelAmpliando=findViewById(R.id.numeroampliandohotel);
        preciohotelAmpliando=findViewById(R.id.preciohotelampliando);
        descripcionhotel=findViewById(R.id.descripcionhotelampliando);

        moldeHotel=(Moldehoteles)getIntent().getSerializableExtra("datoshotel");
        //cargando la info en los componentes graficos
        fotoApliandoHotel.setImageResource(moldeHotel.getFoto());
        nombreAmpliandoHotel.setText(moldeHotel.getNombre());
        numerohotelAmpliando.setText(moldeHotel.getTelefono());
        preciohotelAmpliando.setText(moldeHotel.getPrecio());
        descripcionhotel.setText(moldeHotel.getDescripcion());
    }
}