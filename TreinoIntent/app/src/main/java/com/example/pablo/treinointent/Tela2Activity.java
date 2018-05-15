package com.example.pablo.treinointent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class Tela2Activity extends AppCompatActivity {

    EditText matricula, nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        matricula = findViewById(R.id.matricula);
        nome = findViewById(R.id.nome);

        Intent intent = this.getIntent();

        Aluno aluno = (Aluno) intent.getSerializableExtra("aluno");

        matricula.setText(String.valueOf(aluno.matricula));
        nome.setText(aluno.nome);

    }
}
