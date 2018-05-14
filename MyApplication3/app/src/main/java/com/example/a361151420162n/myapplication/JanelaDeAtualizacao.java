package com.example.a361151420162n.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class JanelaDeAtualizacao extends Generica {

    EditText campoMatricula, campoNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_janela_de_atualizacao);
        campoMatricula = findViewById(R.id.campoMatricula);
        campoNome = findViewById(R.id.campoNome);
    }

    public void atualizar(View view) {
        this.conectar();
        String str = "update aluno setnome = " + campoMatricula.getText().toString() + ", " + campoNome.getText().toString() + " where matricula =  " + campoMatricula.getText().toString() + " ;";
        banco.execSQL(str);
        new Mensagem(this, "SUCESSO NA ATUALIZAÇÃO");
    }
}
