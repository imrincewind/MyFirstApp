package com.example.eze.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        EditText editText2 = (EditText) findViewById(R.id.edit_message2);
        String message2 = editText2.getText().toString();
        int a =  Integer.parseInt(message.toString());
        int b =  Integer.parseInt(message2.toString());
        Integer c = a + b;

        intent.putExtra(EXTRA_MESSAGE, c.toString());
        startActivity(intent);
    }
}

