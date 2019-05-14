package com.example.ejercicio4;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtTexto;
    CheckBox checkNegrita, checkCursiva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTexto=(EditText)findViewById(R.id.txtTexto);
        checkNegrita=(CheckBox)findViewById(R.id.checkNegrita);
        checkCursiva=(CheckBox)findViewById(R.id.checkCursiva);

        checkNegrita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkNegrita.isChecked() && !checkCursiva.isChecked()){
                    txtTexto.setTypeface(null, Typeface.BOLD);
                }else if (!checkNegrita.isChecked() && checkCursiva.isChecked()){
                    txtTexto.setTypeface(null, Typeface.ITALIC);
                }else if(checkNegrita.isChecked() && checkCursiva.isChecked()){
                    txtTexto.setTypeface(null, Typeface.BOLD_ITALIC);
                }else if(!checkNegrita.isChecked() && !checkCursiva.isChecked()){
                    txtTexto.setTypeface(null, Typeface.NORMAL);
                }
            }
        });

        checkCursiva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkNegrita.isChecked() && !checkCursiva.isChecked()){
                    txtTexto.setTypeface(null, Typeface.BOLD);
                }else if (!checkNegrita.isChecked() && checkCursiva.isChecked()){
                    txtTexto.setTypeface(null, Typeface.ITALIC);
                }else if(checkNegrita.isChecked() && checkCursiva.isChecked()){
                    txtTexto.setTypeface(null, Typeface.BOLD_ITALIC);
                }else if(!checkNegrita.isChecked() && !checkCursiva.isChecked()){
                    txtTexto.setTypeface(null, Typeface.NORMAL);
                }
            }
        });
    }

}
