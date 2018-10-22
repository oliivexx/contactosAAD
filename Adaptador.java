package com.example.antonio.contactosaad;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {

    ArrayList<Contacto> contactos;

    public Adaptador(ArrayList<Contacto> contactos) {
        this.contactos = contactos;
    }




    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, null, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.addContact(contactos.get(i));
    }

    @Override
    public int getItemCount() {
        return contactos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nombre, telefono;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.nombre);
            telefono = itemView.findViewById(R.id.telefono);
        }


        public void addContact(String name, String phone) {
            Contacto contact = new Contacto(name, phone);
            contactos.add(contact);
        }

        public void removeContact(int position) {
            contactos.remove(position);
        }

        public void updateContact(Contacto contact, int position) {
            contactos.set(position, contact);
        }

    }
}
