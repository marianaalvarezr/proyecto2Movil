package com.example.turisteandov2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Toast;

import com.example.turisteandov2.adaptadores.Adaptadorhotel;
import com.example.turisteandov2.adaptadores.Adaptadorrestaurantes;
import com.example.turisteandov2.moldes.Moldehoteles;
import com.example.turisteandov2.moldes.Molderestaurantes;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class ListaRestaurantes extends AppCompatActivity {

    ArrayList<Molderestaurantes> listaRestaurantes =new ArrayList<>();
    RecyclerView recyclerView;

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurantes);

        recyclerView=findViewById(R.id.listadinamicarestaurantes);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        db.collection("users")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                String nombreRestaurante=document.getString("nombre");
                                String precioRestaurante=document.getString("precio");
                                String telefonoRestaurante=document.getString("telefono");
                                String platoRestaurante=document.getString("plato");

                                Toast.makeText(ListaRestaurantes.this, nombreRestaurante, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaRestaurantes.this, precioRestaurante, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaRestaurantes.this, telefonoRestaurante, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaRestaurantes.this, platoRestaurante, Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            //Log.w(TAG, "Error getting documents.", task.getException());
                        }
                    }
                });

        llenarListaConDatos();
        Adaptadorrestaurantes adaptadorrestaurantes=new Adaptadorrestaurantes(listaRestaurantes);
        recyclerView.setAdapter(adaptadorrestaurantes);
    }

    private void llenarListaConDatos() {
        listaRestaurantes.add(new Molderestaurantes("Playa arco iris", "$10000-$40000","Robalo","3135138297",R.drawable.playaarcoiris, "Un restaurante en La Guajira que fusiona sabores autóctonos con creatividad, ofreciendo platos frescos y una experiencia gastronómica cultural única.",R.drawable.rest1,R.drawable.rest2,"Comida deliciosa a un buen precio y co buen servicio","5/5"));
        listaRestaurantes.add(new Molderestaurantes("Juacos", "$10000-$40000","Trucha","3145138299",R.drawable.juacos,"Un acogedor restaurante en La Guajira, donde la brisa marina se mezcla con aromas exóticos, ofreciendo auténtica comida local y hospitalidad.",R.drawable.juacoss,R.drawable.juacosss,"Un poco sucio pero muy buena atención","3/4"));
        listaRestaurantes.add(new Molderestaurantes("Pargo Dorado", "$10000-$40000","Pargo","3115137207",R.drawable.pargodorado,"Un rincón culinario en La Guajira, donde la tradición se encuentra con la innovación, sirviendo platos regionales con un toque contemporáneo.",R.drawable.pargodoradoo,R.drawable.pargodoradooo,"Un restaurante con un concepto diferene en la guajira, muy agradable","4/5"));
        listaRestaurantes.add(new Molderestaurantes("El caracol", "$10000-$40000","Cangrejo","3148138200",R.drawable.elcaracol,"Un restaurante en La Guajira que deslumbra con su menú diverso, celebrando la riqueza de la cultura gastronómica local en un ambiente acogedor.",R.drawable.caracool,R.drawable.caracoool,"La comida exquisita, sin embargo, falta en la atencion al cliente","3/5"));
        listaRestaurantes.add(new Molderestaurantes("Estrella del mar", "$10000-$40000","Pollo","3106206321",R.drawable.estrelladelmar,"Un restaurante en La Guajira que despierta los sentidos con sabores auténticos y vistas panorámicas de la costa caribeña.",R.drawable.rest1,R.drawable.rest2,"Buena comida, desorden en el lugar","2/5"));

    }
}