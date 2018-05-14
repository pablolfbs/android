package com.example.a361151420162n.myapplication;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class TelaDeCadastroActivity extends Generico {

    private SQLiteDatabase banco;

    private EditText campoMatricula, campoNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de_cadastro);

        campoMatricula = findViewById(R.id.campoMatricula);
        campoNome = findViewById(R.id.campoNome);
    }

    public void processar(View view) {
        // new Mensagem(this, "FUNCIONOU");

        banco = this.openOrCreateDatabase("escola", Context.MODE_PRIVATE, null);

        banco.execSQL("CREATE TABLE IF NOT EXISTS aluno (matricula INT PRIMARY KEY, nome VARCHAR(50));");

        String instrucao = "INSERT INTO aluno VALUES (" + campoMatricula.getText() + ", '" + campoNome.getText().toString() + "');";
    }

}
