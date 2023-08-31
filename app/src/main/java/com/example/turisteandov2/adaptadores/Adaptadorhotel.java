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
import com.example.turisteandov2.R;
import com.example.turisteandov2.moldes.Moldehoteles;

import java.util.ArrayList;

public class Adaptadorhotel extends RecyclerView.Adapter<Adaptadorhotel.viewHolder>{

    //Todo adaptador tiene una lista de elementos
    public ArrayList<Moldehoteles> listaHoteles;

    //creamos un constructor vacio
    public Adaptadorhotel() {
    }



    public Adaptadorhotel(ArrayList<Moldehoteles> listaHoteles) {
        this.listaHoteles = listaHoteles;
    }

    @NonNull
    @Override
    public Adaptadorhotel.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //esta parte de codigo permite crear N copias del molde grafico
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.moldehoteles,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull Adaptadorhotel.viewHolder holder, int position) {
        holder.actualizarDatos(listaHoteles.get(position));

    }

    @Override
    public int getItemCount() {
        return listaHoteles.size();
    }


    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView fotoHotel;
        TextView nombreHotel;
        TextView precioHotel;
        TextView contactoHotel;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotoHotel=itemView.findViewById(R.id.fotolistahotel);

            nombreHotel=itemView.findViewById(R.id.nombreListaHoteles);
            precioHotel=itemView.findViewById(R.id.precioListaHoteles);
            contactoHotel=itemView.findViewById(R.id.numeroContacto);

        }

        public void actualizarDatos(Moldehoteles moldeHotel) {
            fotoHotel.setImageResource(moldeHotel.getFoto());
            nombreHotel.setText(moldeHotel.getNombre());
            precioHotel.setText(moldeHotel.getPrecio());
            contactoHotel.setText(moldeHotel.getTelefono());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent= new Intent(itemView.getContext(), AmpliandoHotel.class);
                    intent.putExtra("datoshotel", moldeHotel);
                    itemView.getContext().startActivity(intent);
                }
            });

        }
    }
}

