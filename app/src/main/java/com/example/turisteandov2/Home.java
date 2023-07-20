package com.example.turisteandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Locale;

public class Home extends AppCompatActivity {
    //ZONA ATRIBUTOS
    Button botonHoteles;
    Button botonRestaurantes;
    Button botonSitios;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        botonHoteles = findViewById(R.id.botonhoteles);
        botonRestaurantes = findViewById(R.id.botonrestaurantes);
        botonSitios = findViewById(R.id.botonsitios);
        //detectando eventos
        botonHoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHoteles=new Intent(Home.this,Hoteleshome.class);
                startActivity(intentHoteles);
            }
        });
        botonRestaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRestaurantes=new Intent(Home.this,RestaurantesHome.class);
                startActivity(intentRestaurantes);
            }
        });
        botonSitios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSitios=new Intent(Home.this,SitiosHome.class);
                startActivity(intentSitios);
            }
        });
    }

    public void cambiarIdioma(String idioma){
        //configurar el lenguaje del telefono
        Locale lenguaje=new Locale(idioma);
        Locale.setDefault(lenguaje);

        //configuramos globalmente el telefono
        Configuration configuracionTelefono=getResources().getConfiguration();
        configuracionTelefono.locale=lenguaje;

        //Ejecutamos la configuracion
        getBaseContext().getResources().updateConfiguration(configuracionTelefono,getBaseContext().getResources().getDisplayMetrics());
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int itemSeleccionado = item.getItemId();
        switch (itemSeleccionado) {
            case (R.id.opcion1):
                this.cambiarIdioma("en");
                Intent intentIngles=new Intent(Home.this, Home.class);
                startActivity(intentIngles);
                break;
            case (R.id.opcion2):
                this.cambiarIdioma("es");
                Intent intentEspanol=new Intent(Home.this, Home.class);
                startActivity(intentEspanol);
                break;
            case (R.id.opcion3):
                this.cambiarIdioma("it");
                Intent intentItaliano=new Intent(Home.this, Home.class);
                startActivity(intentItaliano);
                break;
            case (R.id.opcion4):
               Intent intent = new Intent(Home.this,Acerca.class);
               startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}