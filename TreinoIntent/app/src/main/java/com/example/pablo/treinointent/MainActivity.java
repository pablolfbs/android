package com.example.pablo.treinointent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText matricula, nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        matricula = findViewById(R.id.matricula);
        nome = findViewById(R.id.nome);
    }

    public void clicar(View view) {
        Aluno aluno = new Aluno();
        aluno.matricula = Integer.parseInt(matricula.getText().toString());
        aluno.nome = nome.getText().toString();

        Intent intent = new Intent(this, Tela2Activity.class);
        intent.putExtra("aluno", aluno);

        this.startActivity(intent);
    }

}
