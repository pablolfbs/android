package com.example.a361151420162n.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class JanelaDeExclusao extends Generica {

    EditText campoMatricula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_janela_de_exclusao);
        campoMatricula = findViewById(R.id.campoMatricula);
    }

    public void excluir(View view) {
        this.conectar();
        banco.execSQL("delete from aluno where " + campoMatricula.getText().toString() + ";");
        new Mensagem(this, "SUCESSO NA EXCLUSÃO");
    }
}
