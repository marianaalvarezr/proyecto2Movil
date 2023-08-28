package com.example.turisteandov2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.turisteandov2.adaptadores.Adaptadorhotel;
import com.example.turisteandov2.adaptadores.Adaptadorrestaurantes;
import com.example.turisteandov2.moldes.Moldehoteles;
import com.example.turisteandov2.moldes.Molderestaurantes;

import java.util.ArrayList;

public class ListaRestaurantes extends AppCompatActivity {

    ArrayList<Molderestaurantes> listaRestaurantes =new ArrayList<>();
    RecyclerView recyclerView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurantes);

        recyclerView=findViewById(R.id.listadinamicarestaurantes);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        llenarListaConDatos();
        Adaptadorrestaurantes adaptadorrestaurantes=new Adaptadorrestaurantes(listaRestaurantes);
        recyclerView.setAdapter(adaptadorrestaurantes);
    }

    private void llenarListaConDatos() {
        listaRestaurantes.add(new Molderestaurantes("Playa arco iris", "$10000-$40000","Robalo","3135138297",R.drawable.playaarcoiris));
        listaRestaurantes.add(new Molderestaurantes("Juacos", "$10000-$40000","Trucha","3145138299",R.drawable.juacos));
        listaRestaurantes.add(new Molderestaurantes("Pargo Dorado", "$10000-$40000","Pargo","3115137207",R.drawable.pargodorado));
        listaRestaurantes.add(new Molderestaurantes("El caracol", "$10000-$40000","Cangrejo","3148138200",R.drawable.elcaracol));
        listaRestaurantes.add(new Molderestaurantes("Estrella del mar", "$10000-$40000","Pollo","3106206321",R.drawable.estrelladelmar));

    }
}