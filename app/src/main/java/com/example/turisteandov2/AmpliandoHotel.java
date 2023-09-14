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
    ImageView fotoAmpliandoHotel2;
    ImageView fotoAmpliandoHotel3;
    TextView calificacionAmpliandoHotel;
    TextView comentarioAmpliandoHotel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_hotel);
        fotoApliandoHotel=findViewById(R.id.fotohotelampliando);
        nombreAmpliandoHotel=findViewById(R.id.titulohotelampliando);
        numerohotelAmpliando=findViewById(R.id.numeroampliandohotel);
        preciohotelAmpliando=findViewById(R.id.preciohotelampliando);
        descripcionhotel=findViewById(R.id.descripcionhotelampliando);
        fotoAmpliandoHotel2=findViewById(R.id.imagenhotel1);
        fotoAmpliandoHotel3=findViewById(R.id.imagenhotel2);
        calificacionAmpliandoHotel=findViewById(R.id.calificaionampliandohotel);
        comentarioAmpliandoHotel=findViewById(R.id.comentarioampliandohotel);

        moldeHotel=(Moldehoteles)getIntent().getSerializableExtra("datoshotel");
        //cargando la info en los componentes graficos
        fotoApliandoHotel.setImageResource(moldeHotel.getFoto());
        nombreAmpliandoHotel.setText(moldeHotel.getNombre());
        numerohotelAmpliando.setText(moldeHotel.getTelefono());
        preciohotelAmpliando.setText(moldeHotel.getPrecio());
        descripcionhotel.setText(moldeHotel.getDescripcion());
        fotoAmpliandoHotel2.setImageResource(moldeHotel.getFoto2());
        fotoAmpliandoHotel3.setImageResource(moldeHotel.getFoto3());
        calificacionAmpliandoHotel.setText(moldeHotel.getCalificacion());
        comentarioAmpliandoHotel.setText(moldeHotel.getComentario());
    }
}