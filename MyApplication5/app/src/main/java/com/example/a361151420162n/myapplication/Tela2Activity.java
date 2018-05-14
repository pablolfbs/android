package com.example.a361151420162n.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Tela2Activity extends AppCompatActivity {

    private EditText campoMatricula, campoNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        campoMatricula = (EditText)findViewById(R.id.campoMatricula);
        campoNome = (EditText)findViewById(R.id.campoNome);

        Intent intent = this.getIntent();

        Aluno aluno;
        aluno = (Aluno)intent.getSerializableExtra("aluno");

        campoMatricula.setText(String.valueOf(aluno.matricula));
        campoNome.setText((aluno.nome));

        // campoMatricula.setText(String.valueOf(intent.getIntExtra("matricula", 0)));
        // campoNome.setText(intent.getStringExtra("nome"));
    }
}
