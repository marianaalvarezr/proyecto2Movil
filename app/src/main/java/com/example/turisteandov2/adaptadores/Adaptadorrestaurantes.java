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
import com.example.turisteandov2.moldes.Molderestaurantes;

import java.util.ArrayList;

public class Adaptadorrestaurantes extends RecyclerView.Adapter<Adaptadorrestaurantes.viewHolder>{

    public ArrayList<Molderestaurantes> listaRestaurantes;

    public Adaptadorrestaurantes(ArrayList<Molderestaurantes> listaRestaurantes) {
        this.listaRestaurantes = listaRestaurantes;
    }

    @NonNull
    @Override
    public Adaptadorrestaurantes.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.molderestaurante,null,false);
        return new Adaptadorrestaurantes().viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull Adaptadorhotel.viewHolder holder, int position) {
        holder.actualizarDatos(listaRestaurantes.get(position));

    }

    @Override
    public int getItemCount() {
        return listaRestaurantes.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView fotoRestaurante1;
        ImageView fotoRestaurante2;
        TextView nombreRestaurante;
        TextView plato;
        TextView precio;
        TextView telefono;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotoRestaurante1 = itemView.findViewById(R.id.fotoRestaurante);
            fotoRestaurante2 = itemView.findViewById(R.id.imagenplato);


            nombreRestaurante = itemView.findViewById(R.id.tituloRestaurante);
            plato = itemView.findViewById(R.id.plato);
            precio = itemView.findViewById(R.id.rangoPlato);
            telefono = itemView.findViewById(R.id.numerocontactoRestaurante);
        }

        public void actualizarDatos(Molderestaurantes molderestaurantes) {
            fotoRestaurante1.setImageResource(molderestaurantes.getFoto());
            fotoRestaurante2.setImageResource(molderestaurantes.getFotoPlato());
            nombreRestaurante.setText(molderestaurantes.getTitulo());
            plato.setText(molderestaurantes.getPlato());
            precio.setText(molderestaurantes.getPrecio());
            telefono.setText(molderestaurantes.getTelefono());

        }
    }
}
