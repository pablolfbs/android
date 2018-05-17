package com.example.a361151420162n.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText tel, mensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mensagem = findViewById(R.id.mensagem);
        tel = findViewById(R.id.tel);
    }

    public void clicar(View view) {

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:" + tel.getText().toString()));

        intent.putExtra("sms_body", mensagem.getText().toString());
        startActivity(intent);
    }

}
