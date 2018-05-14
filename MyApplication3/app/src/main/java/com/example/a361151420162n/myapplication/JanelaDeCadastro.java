package com.example.a361151420162n.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class JanelaDeCadastro extends Generica {

    EditText campoMatricula, campoNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_janela_de_cadastro);
        campoMatricula = findViewById(R.id.campoMatricula);
        campoNome = findViewById(R.id.campoNome);
    }

    public void cadastrar(View view) {
        this.conectar();
        banco.execSQL("insert into aluno values (" + campoMatricula.getText() + ", " + campoNome.getText().toString() + ");");
        new Mensagem(this, "SUCESSO NO CADASTRO");
    }
}
