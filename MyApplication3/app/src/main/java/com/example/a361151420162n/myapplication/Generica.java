package com.example.a361151420162n.myapplication;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class Generica extends AppCompatActivity {

    SQLiteDatabase banco;

    void conectar() {
        banco = this.openOrCreateDatabase("escola", Context.MODE_PRIVATE, null);
        banco.execSQL("create table if not exists aluno (matricula int primary key, nome varchar(50));");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generica);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        this.getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Intent intent = null;
        switch (menuItem.getItemId()) {
            case R.id.cadastrar:
                intent = new Intent(this, JanelaDeCadastro.class);
                break;
            case R.id.atualizar:
                intent = new Intent(this, JanelaDeAtualizacao.class);
                break;
            case R.id.excluir:
                intent = new Intent(this, JanelaDeExclusao.class);
                break;
            case R.id.listar:
                intent = new Intent(this, JanelaDeListagem.class);
                break;
        }
        this.startActivity(intent);
        finish();
        return true;
    }

}
