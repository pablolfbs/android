package com.example.a361151420162n.myapplication;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private ArrayAdapter arrayAdapter;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        spinner = findViewById(R.id.spinner);

        String array[] = new String[2];
        array[0] = "PESSOA FÍSICA";
        array[1] = "PESSOA JURÍDICA";

        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, array);

        spinner.setAdapter(arrayAdapter);
    }

    public void processar(View view) {

        spinner = findViewById(R.id.spinner);
        String str = spinner.getSelectedItem().toString();

        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("MENSAGEM");
        alertDialog.setMessage(str);
        alertDialog.show();

    }

}
