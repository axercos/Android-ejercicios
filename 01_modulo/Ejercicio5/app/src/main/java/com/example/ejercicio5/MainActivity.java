package com.example.ejercicio5;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txt1;
    Spinner sp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1=(EditText) findViewById(R.id.txt1);
        sp1=(Spinner) findViewById(R.id.sp1);

        //
        String []opciones={"Normal","Negrita","Cursiva","Cursiva y Negrita"};

        //adapter

        ArrayAdapter<String> adaptador=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, opciones);

        //modelos
        sp1.setAdapter(adaptador);

        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
           @Override
           public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
               Log.e("Aplicacion","Presiono");
               String opcion=sp1.getSelectedItem().toString();
               switch (opcion){
                   case "Negrita": txt1.setTypeface(null, Typeface.BOLD);
                   break;
                   case "Cursiva": txt1.setTypeface(null, Typeface.ITALIC);
                   break;
                   case "Cursiva y Negrita": txt1.setTypeface(null, Typeface.BOLD_ITALIC);
                   break;
                   default:
                       txt1.setTypeface(null, Typeface.NORMAL);
                       break;
               }
           }

           @Override
            public void onNothingSelected(AdapterView<?> parent){

           }

        });
    }
}
