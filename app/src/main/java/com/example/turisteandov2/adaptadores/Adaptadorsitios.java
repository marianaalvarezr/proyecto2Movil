package com.example.turisteandov2.adaptadores;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.turisteandov2.AmpliandoHotel;
import com.example.turisteandov2.AmpliandoSitios;
import com.example.turisteandov2.R;
import com.example.turisteandov2.moldes.Moldehoteles;
import com.example.turisteandov2.moldes.Moldesitios;

import java.util.ArrayList;

public class Adaptadorsitios extends RecyclerView.Adapter<Adaptadorsitios.viewHolder>{
    public ArrayList<Moldesitios> ListaSitios;

    public Adaptadorsitios(ArrayList<Moldesitios> listaSitios) {
        this.ListaSitios = listaSitios;
    }
    @NonNull
    @Override
    public Adaptadorsitios.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.moldesitios,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull Adaptadorsitios.viewHolder holder, int position) {
        holder.actualizarDatos(ListaSitios.get(position));

    }

    @Override
    public int getItemCount() {
        return ListaSitios.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView fotoSitios;
        TextView nombreSitio;
        TextView precioSitio;
        TextView contactoSitio;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotoSitios=itemView.findViewById(R.id.fotoSitio);

            nombreSitio=itemView.findViewById(R.id.titulomoldesitios);
            precioSitio=itemView.findViewById(R.id.precioListasitios);
            contactoSitio=itemView.findViewById(R.id.numeroContactoSitios);

        }
        public void actualizarDatos(Moldesitios moldesitios) {
            fotoSitios.setImageResource(moldesitios.getFoto1());
            nombreSitio.setText(moldesitios.getNombre());
            precioSitio.setText(moldesitios.getPrecio());
            contactoSitio.setText(moldesitios.getTelefono());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent= new Intent(itemView.getContext(), AmpliandoSitios.class);
                    intent.putExtra("datossitios",moldesitios);
                    itemView.getContext().startActivity(intent);
                }
            });

        }
    }
}
