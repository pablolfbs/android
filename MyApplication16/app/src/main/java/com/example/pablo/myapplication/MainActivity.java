package com.example.pablo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText campoMatricula, campoNome;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoMatricula = findViewById(R.id.campoMatricula);
        campoNome = findViewById(R.id.campoNome);
        textView = findViewById(R.id.textView);
    }

    public void clicar(View view) {
        if (campoMatricula != null) {
            textView.setText(campoMatricula.getText().toString() + " " + campoNome.getText().toString());
        }
    }
}
