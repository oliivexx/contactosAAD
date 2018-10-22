package com.example.antonio.contactosaad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Contacto> contactos;
    RecyclerView recycler;
    String nombre, telefono;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton = findViewById(R.id.addCon);
        recycler = (RecyclerView) findViewById(R.id.recycler);
        recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        contactos = new ArrayList<>();

        for(int i = 0; i<contactos.size(); i++){
            //contactos.add(nombre, telefono);
        }

        Adaptador adapter = new Adaptador(contactos);
        recycler.setAdapter(adapter);
    }

    public void añadirContacto(View view){
        Intent intent = new Intent(MainActivity.this, AddContacto.class);
        startActivity(intent);
    }
}
