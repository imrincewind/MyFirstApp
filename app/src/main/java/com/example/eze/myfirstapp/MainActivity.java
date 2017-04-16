package com.example.eze.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    protected final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    private boolean s = true;
    private boolean r = false;
    private boolean m = true;
    private boolean d = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        RadioButton suma = (RadioButton) findViewById(R.id.suma);
        RadioButton resta = (RadioButton) findViewById(R.id.resta);
        RadioButton multiplicacion = (RadioButton) findViewById(R.id.multiplicacion);
        //RadioButton division = (RadioButton) findViewById(R.id.division);
        s = suma.isChecked();
        r = resta.isChecked();
        m = multiplicacion.isChecked();
       // d = division.isChecked();
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        EditText editText2 = (EditText) findViewById(R.id.edit_message2);
        String message2 = editText2.getText().toString();
        int a =  Integer.parseInt(message.toString());
        int b =  Integer.parseInt(message2.toString());
        int[] d = new int[2];
        d[0] = 0;
        d[1] = 0;
        d[0] = a;
        d[1] = b;
        //Integer c = a + b;

        //intent.putExtra(EXTRA_MESSAGE, c.toString());
        intent.putExtra("suma",s);
        intent.putExtra("resta",r);
        intent.putExtra("multiplicacion",m);
        //intent.putExtra("division",d);
        intent.putExtra(EXTRA_MESSAGE, d);
        startActivity(intent);
    }
}

