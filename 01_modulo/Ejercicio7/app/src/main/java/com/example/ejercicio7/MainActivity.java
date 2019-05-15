package com.example.ejercicio7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    SeekBar sbBarra;
    int iwidth=65, iheight=52;
    float density;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DisplayMetrics medidas= getResources().getDisplayMetrics();
        density=medidas.densityDpi;

        img=(ImageView)findViewById(R.id.imgGoku);
        sbBarra=(SeekBar)findViewById(R.id.sbBarra);

        sbBarra.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                float ancho=((progress+iwidth)*density)*2/160;

                float alto=((progress+iheight)*density)*2/160;

                img.getLayoutParams().height=(int)alto;
                img.getLayoutParams().width=(int)ancho;
                img.requestLayout();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
