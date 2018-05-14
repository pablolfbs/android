package com.example.a361151420162n.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText campoMatricula, campoNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        campoMatricula = (EditText)findViewById(R.id.campoMatricula);
        campoNome = (EditText)findViewById(R.id.campoNome);
    }

    public void clicar(View view) {
        Aluno aluno = new Aluno();
        aluno.matricula = Integer.parseInt(campoMatricula.getText().toString());
        aluno.nome = campoNome.getText().toString();

        Intent intent = new Intent(this, Tela2Activity.class);
        intent.putExtra("aluno", aluno);


        // Intent intent = new Intent(this, Tela2Activity.class);
        // intent.putExtra("matricula", Integer.parseInt(campoMatricula.getText().toString()));
        // intent.putExtra("nome", campoNome.getText().toString());
        this.startActivity(intent);
    }

}
