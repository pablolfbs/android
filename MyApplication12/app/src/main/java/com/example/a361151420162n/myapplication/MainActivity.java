package com.example.a361151420162n.myapplication;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private RadioButton radioButtonPF;
    private RadioButton radioButtonPJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        radioButtonPF = findViewById(R.id.radioButtonPF);
        radioButtonPJ = findViewById(R.id.radioButtonPJ);
    }

    public void processar(View view) {
        String str;

        if (radioButtonPF.isChecked()) {
            str = "O usuário selecionou pessoa física";
        } else if (radioButtonPJ.isChecked()) {
            str = "O usuário selecionou pessoa jurídica";
        } else {
            str = "O usuário ainda não selecionou nenhuma opção";
        }

        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("OPÇÃO DO USUÁRIO");
        alertDialog.setMessage(str);
        alertDialog.show();

    }

}
