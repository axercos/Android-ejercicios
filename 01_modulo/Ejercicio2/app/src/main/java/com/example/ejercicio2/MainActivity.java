package com.example.ejercicio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.txtnum1)
    EditText txtnum1;
    @BindView(R.id.txtnum2)
    EditText txtnum2;

    @BindView(R.id.rbresta)
    RadioButton rbresta;
    @BindView(R.id.rbsuma)
    RadioButton rbsuma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btncalculo)
    public void hacerCalculo(){
        Toast.makeText(this,"Presiones", Toast.LENGTH_LONG).show();
    }
}
