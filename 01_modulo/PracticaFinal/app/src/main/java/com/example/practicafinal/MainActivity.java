package com.example.practicafinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.example.practicafinal.adaptadores.AdaptadorCurso;
import com.example.practicafinal.modelo.Cursos;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rb=(RecyclerView)findViewById(R.id.rb);
        llenarRecicle();
    }

    private void llenarRecicle() {
        Cursos curso1=new Cursos();
        Cursos curso2=new Cursos();
        Cursos curso3=new Cursos();
        curso1.setNombre("Moviles");
        curso1.setPorcentaje(20);
        curso2.setNombre("Base de datos");
        curso2.setPorcentaje(30);
        curso3.setNombre("Desarrollo WEB");
        curso3.setPorcentaje(30);

        List<Cursos> lista=new ArrayList<>();
        lista.add(curso1);
        lista.add(curso2);
        lista.add(curso3);

        AdaptadorCurso adaptador= new AdaptadorCurso(this,lista);
        LinearLayoutManager llm=new LinearLayoutManager(this);
        rb.setLayoutManager(llm);
        rb.setAdapter(adaptador);

    }
}
