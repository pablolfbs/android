package com.example.pablo.mensagens;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText contato, mensagem;
    Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contato = findViewById(R.id.contato);
        mensagem = findViewById(R.id.mensagem);
        botao = findViewById(R.id.botao);
    }

    public void enviar(View view) {
        String maybe = contato.getText().toString();

        String validPattern = "^\\d*$";
        maybe.matches(validPattern);
        if (maybe.matches(validPattern)) {
            try {
                String text = mensagem.getText().toString();// Replace with your message.

                String toNumber = "5521" + contato.getText().toString(); // Replace with mobile phone number without +Sign or leading zeros.

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://api.whatsapp.com/send?phone=" + toNumber + "&text=" + text));
                startActivity(intent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/html");
            intent.putExtra(Intent.EXTRA_EMAIL, new String[]{contato.getText().toString()});
            intent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
            intent.putExtra(Intent.EXTRA_TEXT, mensagem.getText().toString());

            startActivity(Intent.createChooser(intent, "Send Email"));
        }

//        boolean result = false;
//
//        try {
//            int i = Integer.parseInt(maybe);
//            result = true;
//        } catch (Exception e) {
//
//        }
//
//        if (result) {
//
//        } else {
//
//        }
    }
}
