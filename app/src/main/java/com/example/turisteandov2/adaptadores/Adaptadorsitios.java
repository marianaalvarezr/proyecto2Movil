package com.example.turisteandov2.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

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
        public void actualizarDatos(Moldesitios moldeHotel) {
            fotoSitios.setImageResource(moldeHotel.getFoto1());
            nombreSitio.setText(moldeHotel.getNombre());
            precioSitio.setText(moldeHotel.getPrecio());
            contactoSitio.setText(moldeHotel.getTelefono());

        }
    }
}
