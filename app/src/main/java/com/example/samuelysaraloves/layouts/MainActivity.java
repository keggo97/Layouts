package com.example.samuelysaraloves.layouts;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
Button btn1;
TextView t1;
int c=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crazy_layout);
/*
        btn1=findViewById(R.id.btn1);
        t1=findViewById(R.id.tw1);

        //aqui hago el conteo del visnes+
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               FrameLayout.LayoutParams ls = new FrameLayout.LayoutParams(-2,-2);
               c=c+1;

               t1.setText(String.valueOf(c));

            }
        });



        //aqui se mueve el visnes
        new CountDownTimer(1100000, 500) {
            @Override
            public void onTick(long millisUntilFinished) {
                Random generador = new Random();

                Integer[] preguntas = {Gravity.TOP,Gravity.BOTTOM, Gravity.RIGHT, Gravity.LEFT, Gravity.CENTER};

                FrameLayout.LayoutParams lp =  new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT,FrameLayout.LayoutParams.WRAP_CONTENT);

                lp.gravity=preguntas[generador.nextInt(preguntas.length)];

                btn1.setLayoutParams(lp);
            }
            /* yeah bby

            @Override
            public void onFinish() {
                Toast.makeText(MainActivity.this, "se acabo", Toast.LENGTH_LONG);
            }
        }.start();
*/


    }
}
