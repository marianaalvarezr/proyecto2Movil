package com.example.turisteandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.turisteandov2.moldes.Moldehoteles;

public class AmpliandoHotel extends AppCompatActivity {

    Moldehoteles moldeHotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_hotel);

        moldeHotel=(Moldehoteles)getIntent().getSerializableExtra("datoshotel");
        Toast.makeText(this, moldeHotel.getNombre(), Toast.LENGTH_LONG).show();
    }
}