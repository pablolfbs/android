package com.example.pablo.arquivos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {

    EditText campoEscrever, campoLer;
    String arquivo = "arquivo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoEscrever = findViewById(R.id.campoEscrever);
        campoLer = findViewById(R.id.campoLer);
    }

    public void escrever(View view) {
        try {
            FileOutputStream fileOutputStream = this.openFileOutput(arquivo, MODE_PRIVATE);
            fileOutputStream.write(campoEscrever.getText().toString().getBytes(), 0,
                    campoEscrever.getText().toString().length());
            fileOutputStream.close();
        } catch (Exception e) {
            campoLer.setText("FALHA NA ESCRITA: " + e.toString());
        }
    }

    public void ler(View view) {
        int digito;

        String str = "";
        try {
            FileInputStream fileInputStream = this.openFileInput(arquivo);
            while((digito = fileInputStream.read()) != -1){
                str += Character.toString((char) digito);
            }
            fileInputStream.close();
            campoLer.setText(str);
        } catch (Exception e) {
            campoLer.setText("FALHA NA ESCRITA: " + e.toString());
        }
    }
}
