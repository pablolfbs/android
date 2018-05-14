package com.example.a361151420162n.exercicioclicarbotao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView labelSaida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        labelSaida = (TextView)findViewById(R.id.labelSaida);
    }

    public void clicarBotao(View view) {

        String str = labelSaida.getText().toString();

        if (str.equals("") || str.equals("Bye!!")) {
            labelSaida.setText("Hello!!");
        } else if (str.equals("Hello!!")) {
            labelSaida.setText("Bye!!");
        }

    }

}
