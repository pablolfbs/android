package com.example.a361151420162n.navegacao1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Tela2Activity extends Menu {

    private TextView nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        Intent intent = this.getIntent();
        String str = intent.getStringExtra("aluno");
        this.nome = findViewById(R.id.textView3);
        this.nome.setText(str);
    }
}
