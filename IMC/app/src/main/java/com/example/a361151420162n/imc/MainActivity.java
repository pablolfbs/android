package com.example.a361151420162n.imc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText campoAltura, campoPeso;
    private TextView labelResultado,labelResultado1, labelConceito, labelConceito1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        campoAltura = (EditText) findViewById(R.id.campoAltura);
        campoPeso = (EditText) findViewById(R.id.campoPeso);
        labelResultado = (TextView) findViewById(R.id.labelResultado);
        labelResultado1 = (TextView) findViewById(R.id.labelResultado1);
        labelConceito = (TextView) findViewById(R.id.labelConceito);
        labelConceito1 = (TextView) findViewById(R.id.labelConceito1);
    }

    public void calcularIMC(View view) {
        float altura = Float.parseFloat(campoAltura.getText().toString());
        float peso = Float.parseFloat(campoPeso.getText().toString());
        float res = peso / (altura * altura);
        labelResultado.setText(Float.toString(res));
        labelResultado1.setText("RESULTADO  ");

        if (res < 17) {
            labelConceito.setText("Abaixo de 17  ");
            labelConceito1.setText("Muito abaixo do peso");
        } else if (res > 17 && res < 18.49) {
            labelConceito.setText("Entre 17 e 18,49  ");
            labelConceito1.setText("Abaixo do peso");
        } else if (res > 18.5 && res < 24.99) {
            labelConceito.setText("Entre 18,5 e 24,99  ");
            labelConceito1.setText("Peso normal");
        } else if (res > 25 && res < 29.99) {
            labelConceito.setText("Entre 25 e 29,99  ");
            labelConceito1.setText("Acima do peso");
        } else if (res > 30 && res < 34.99) {
            labelConceito.setText("Entre 30 e 34,99  ");
            labelConceito1.setText("Obesidade I");
        } else if (res > 35 && res < 39.99) {
            labelConceito.setText("Entre 35 e 39,99  ");
            labelConceito1.setText("Obesidade II (severa)");
        } else if (res > 40) {
            labelConceito.setText("Acima de 40  ");
            labelConceito1.setText("Obesidade III (mórbida)");
        }

    }

}
