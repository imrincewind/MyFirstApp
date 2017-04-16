package com.example.eze.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        //String aMostrar = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
       // TextView textView = new TextView(this);
        //textView.setTextSize(40);
        //textView.setText("La suma es: " +  aMostrar + " si señor.");
        boolean suma = getIntent().getExtras().getBoolean("suma");
        boolean resta = getIntent().getExtras().getBoolean("resta");
        boolean multiplicacion = getIntent().getExtras().getBoolean("multiplicacion");
        int[] arr = intent.getIntArrayExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        int ans = 0;
        String ansb = "Vuelva atrás y seleccione alguna opción";
        if(resta){
            ans = arr[0] - arr[1];
            ansb = "La resta resulta: " +  ans + " si señor.";
        } else if (suma) {
            ans = arr[0] + arr[1];
            ansb = "La suma es: " +  ans + " si señor.";
        } else if (multiplicacion) {
            ans = arr[0] * arr[1];
            ansb = "La multiplicación da: " +  ans + " si señor.";
        } else{
            double x = arr[0];
            double y = arr[1];
            double d = x / y;
            ansb = "La división da: " +  d + " si señor.";
        }
        textView.setText(ansb);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_main2);
        layout.addView(textView);
    }
}
