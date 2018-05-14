package com.example.a361151420162n.navegacao1;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Menu {

    private Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = findViewById(R.id.button);
    }

    public void clicar(View view) {
        Intent intent = new Intent(this, Tela2Activity.class);
        intent.putExtra("aluno", "Pablo");
        startActivity(intent);
    }

}
