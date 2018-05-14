package com.example.a361151420162n.myapplication;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class TelaDeListagemActivity extends Generico {

    private SQLiteDatabase banco;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de_listagem);

        listView = findViewById(R.id.listView);

        banco = this.openOrCreateDatabase("escola", Context.MODE_PRIVATE, null);

        banco.execSQL("CREATE TABLE IF NOT EXISTS aluno (matricula INT PRIMARY KEY, nome VARCHAR(50));");

        Cursor cursor = banco.rawQuery("SELECT nome FROM aluno", null);

        ArrayList array = new ArrayList();

        if (cursor.moveToFirst()) {
            do {
                array.add(cursor.getString(0));
            } while (cursor.moveToNext());
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, array);

        listView.setAdapter(arrayAdapter);
    }
}
