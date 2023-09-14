package com.example.turisteandov2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.turisteandov2.adaptadores.Adaptadorhotel;
import com.example.turisteandov2.moldes.Moldehoteles;

import java.util.ArrayList;

public class ListaHoteles extends AppCompatActivity {

    ArrayList<Moldehoteles> listaHoteles=new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);

        recyclerView=findViewById(R.id.listadinamicahoteles);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        llenarListaConDatos();
        Adaptadorhotel adaptadorHoteles=new Adaptadorhotel(listaHoteles);
        recyclerView.setAdapter(adaptadorHoteles);
    }
    public void llenarListaConDatos(){
        listaHoteles.add(new Moldehoteles("Hotel Wayira Beach", "$100000","3135138297",R.drawable.wayiraampliando, "Un lujoso hotel frente al mar con habitaciones elegantes, vistas panorámicas, gastronomía exquisita y servicios de primera clase para relajación inolvidable.",R.drawable.wayirahotel,R.drawable.wayira3,"Es un hotel muy agradable con muchas alternativas y perfecto para la familia","5/5"));
        listaHoteles.add(new Moldehoteles("Rancheria Utta", "$90000","3235138298",R.drawable.rancheriautta, "Un encantador refugio, con cabañas rústicas, gastronomía espectacular, playas vírgenes, atardeceres espectaculares y auténtica hospitalidad local.",R.drawable.rancheria1, R.drawable.rancheria2, "Un hotel que sin duda te hace vivir una experiencia inmersiva.", "4.5/5"));
        listaHoteles.add(new Moldehoteles("Hotel Playa Arcoiris", "$800000","3175138291",R.drawable.playaarcoiris, "Un hotel boutique en La Guajira que combina lujo y cultura local, ofreciendo una experiencia única con habitaciones exquisitamente comodas.",R.drawable.playaarcoiris,R.drawable.playaarcoiriss,"Un hotel comodo, economico y agradable.","4/5"));
        listaHoteles.add(new Moldehoteles("Hotel Palomino Sunrise", "$120000","3235138280",R.drawable.palominosunrise, "Un pintoresco hotel en La Guajira, rodeado de paisajes desérticos y playas paradisíacas, con comodidades modernas y un ambiente relajante.",R.drawable.palomino, R.drawable.palominoo,"Un hotel bastante cómodo, con intalaciones muy bonitas y espacios agradables", "5/5"));
        listaHoteles.add(new Moldehoteles("Hotel Casa coraje", "$950000","3145138197",R.drawable.casacoraje,"Un refugio frente al mar en La Guajira, con bungalows playeros, acceso directo a la playa, y deliciosos platos regionales en su restaurante.",R.drawable.ccoraje,R.drawable.casacorajee,"Ubicación conveniente y bonitas habitaciones e instalaciones","4.5/5"));
    }
}