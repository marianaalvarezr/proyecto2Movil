package com.example.turisteandov2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Toast;

import com.example.turisteandov2.adaptadores.Adaptadorhotel;
import com.example.turisteandov2.adaptadores.Adaptadorsitios;
import com.example.turisteandov2.moldes.Moldehoteles;
import com.example.turisteandov2.moldes.Moldesitios;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class ListaSitios extends AppCompatActivity {
    ArrayList<Moldesitios> listaSitios=new ArrayList<>();
    RecyclerView recyclerView;

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_sitios);
        recyclerView=findViewById(R.id.listadinamicasitios);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        db.collection("users")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                String nombreSitios=document.getString("nombre");
                                String precioSitios=document.getString("precio");
                                String telefonoSitios=document.getString("telefono");

                                Toast.makeText(ListaSitios.this, nombreSitios, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaSitios.this, precioSitios, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaSitios.this, telefonoSitios, Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            //Log.w(TAG, "Error getting documents.", task.getException());
                        }
                    }
                });

        llenarListaConDatos();
        Adaptadorsitios adaptadorSitios=new Adaptadorsitios(listaSitios);
        recyclerView.setAdapter(adaptadorSitios);
    }

    private void llenarListaConDatos() {
       listaSitios.add(new Moldesitios("Pilon de azucar", "$100000","3135138297",R.drawable.pilon,"Pilón de Azúcar, un icónico faro en La Guajira, se alza majestuosamente en un paisaje desértico, guiando a los navegantes con su luz centenaria.",R.drawable.pilondeazucar1,R.drawable.pilondeazucar2,"Un lugar con paisajes maravillosos","5/5"));
       listaSitios.add(new Moldesitios("Playa ojo de agua", "$90000","3145188291",R.drawable.ojodeagua,"La Playa del Ojo del Agua en La Guajira es un paraíso escondido, donde aguas cristalinas acarician arenas doradas bajo un cielo infinito.",R.drawable.ojodelaguaa, R.drawable.ojodelaguaaa,"Muy bonito lugar, aunque hay mucha gente","4/5"));
       listaSitios.add(new Moldesitios("El faro", "$50000","3205138292",R.drawable.elfaro, "El Faro de La Guajira es una estructura imponente que emerge en medio del paisaje desértico, guiando a los marinos con su luz constante.",R.drawable.elfaroo,R.drawable.elfarooo,"Un lugar muy concorrido y de dificil acceso, sin embargo, la vista es bonita", "3/5"));
       listaSitios.add(new Moldesitios("Punta gallinas", "$110000","3035168257",R.drawable.puntagallinas,"Punta Gallinas, en La Guajira, es el punto más septentrional de América del Sur, un paraíso remoto de playas, dunas y paisajes asombrosos.",R.drawable.puntaallinass,R.drawable.puntagallinasss,"Punta Gallinas es un rincón mágico en La Guajira, super recomendado", "5/5"));
       listaSitios.add(new Moldesitios("Parque Nacional Natural Macuira", "$150000","3115138290",R.drawable.macuira,"El Parque Nacional Natural Macuira, en La Guajira, es un tesoro ecológico con desiertos, montañas, oasis y una biodiversidad única que encanta a los aventureros.",R.drawable.parque1,R.drawable.parque2,"Un lugar que retrata lo bonito de la naturaleza","5/5"));
    }
}