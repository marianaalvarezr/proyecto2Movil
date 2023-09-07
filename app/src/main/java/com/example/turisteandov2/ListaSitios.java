package com.example.turisteandov2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.turisteandov2.adaptadores.Adaptadorhotel;
import com.example.turisteandov2.adaptadores.Adaptadorsitios;
import com.example.turisteandov2.moldes.Moldehoteles;
import com.example.turisteandov2.moldes.Moldesitios;

import java.util.ArrayList;

public class ListaSitios extends AppCompatActivity {
    ArrayList<Moldesitios> listaSitios=new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_sitios);
        recyclerView=findViewById(R.id.listadinamicasitios);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        llenarListaConDatos();
        Adaptadorsitios adaptadorSitios=new Adaptadorsitios(listaSitios);
        recyclerView.setAdapter(adaptadorSitios);
    }

    private void llenarListaConDatos() {
       listaSitios.add(new Moldesitios("Pilon de azucar", "$100000","3135138297",R.drawable.pilon));
       listaSitios.add(new Moldesitios("Playa ojo de agua", "$90000","3145188291",R.drawable.ojodeagua));
       listaSitios.add(new Moldesitios("El faro", "$50000","3205138292",R.drawable.elfaro));
       listaSitios.add(new Moldesitios("Punta gallinas", "$110000","3035168257",R.drawable.puntagallinas));
       listaSitios.add(new Moldesitios("Parque Nacional Natural Macuira", "$150000","3115138290",R.drawable.macuira));
    }
}