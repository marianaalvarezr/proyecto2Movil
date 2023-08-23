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

import java.util.ArrayList;

public class Adaptadorsitios extends RecyclerView.Adapter<Adaptadorsitios.viewHolder>{
    public ArrayList<Moldehoteles> ListaSitios;

    public Adaptadorsitios(ArrayList<Moldehoteles> listaSitios) {
        this.ListaSitios = listaSitios;
    }
    @NonNull
    @Override
    public Adaptadorsitios.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.moldesitios,null,false);
        return new Adaptadorsitios().viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull Adaptadorsitios.viewHolder holder, int position) {
        holder.actualizarDatos(listaitios.get(position));

    }

    @Override
    public int getItemCount() {
        return listasitios.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView fotoSitios1;
        ImageView fotoSitios2;
        ImageView fotoSitios3;
        ImageView fotoSitios4;
        ImageView fotoSitios5;
        TextView nombreSitio;
        TextView precioSitio;
        TextView contactoSitio;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotoHotel1=itemView.findViewById(R.id.fotolistahotel);
            fotoHotel2=itemView.findViewById(R.id.foto1);
            fotoHotel3=itemView.findViewById(R.id.foto2);
            fotoHotel4=itemView.findViewById(R.id.foto3);
            fotoHotel5=itemView.findViewById(R.id.foto4);


            nombreHotel=itemView.findViewById(R.id.nombreListaHoteles);
            precioHotel=itemView.findViewById(R.id.precioListaHoteles);
            contactoHotel=itemView.findViewById(R.id.numeroContacto);

        }
    }
}
