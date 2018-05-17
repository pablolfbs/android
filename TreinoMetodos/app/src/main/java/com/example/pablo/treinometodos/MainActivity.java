package com.example.pablo.treinometodos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = findViewById(R.id.texto);
    }

    public void textoOi() {
        texto.setText("Oi");
    }

    public void textoOla() {
        texto.setText("Olá");
    }

    public void clicar(View view) {
        String str = texto.getText().toString();
        if (str.equals("") || str.equals("Oi")) {
            textoOla();
        } else if (str.equals("Olá")) {
            textoOi();
        }
    }


}
