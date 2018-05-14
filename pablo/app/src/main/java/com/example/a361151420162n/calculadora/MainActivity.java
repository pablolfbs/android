package com.example.a361151420162n.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnSoma, btnSub, btnDiv, btnMulti, btnIgual, btnC;
    private TextView labelResult;

    int n1 = 0, n2 = 0, resultado;
    String op = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnSoma = findViewById(R.id.btnSoma);
        btnSub = findViewById(R.id.btnSub);
        btnMulti = findViewById(R.id.btnMulti);
        btnDiv = findViewById(R.id.btnDiv);
        btnIgual = findViewById(R.id.btnIgual);
        btnC = findViewById(R.id.btnC);
        labelResult = findViewById(R.id.labelResult);
    }

//    public void clicarBnt0(View view) {
//        labelResult.setText(Integer.toString(0));
//    }
//    public void clicarBnt1(View view) {
//        labelResult.setText(Integer.toString(1));
//    }
//    public void clicarBnt2(View view) {
//        labelResult.setText(Integer.toString(2));
//    }
//    public void clicarBnt3(View view) {
//        labelResult.setText(Integer.toString(3));
//    }
//    public void clicarBnt4(View view) {
//        labelResult.setText(Integer.toString(4));
//    }
//    public void clicarBnt5(View view) {
//        labelResult.setText(Integer.toString(5));
//    }
//    public void clicarBnt6(View view) {
//        labelResult.setText(Integer.toString(6));
//    }
//    public void clicarBnt7(View view) {
//        labelResult.setText(Integer.toString(7));
//    }
//    public void clicarBnt8(View view) {
//        labelResult.setText(Integer.toString(8));
//    }
//    public void clicarBnt9(View view) {
//        labelResult.setText(Integer.toString(9));
//    }

    public void BtnSoma(View view) {
        labelResult.setText("+");
    }
    public void BtnSub(View view) {
        labelResult.setText("-");
    }
    public void BtnMulti(View view) {
        labelResult.setText("*");
    }
    public void BtnDiv(View view) {
        labelResult.setText("/");
    }

    public void processar(View view) {
        //n = Integer.parseInt(labelResult.getText().toString());

        switch (view.getId()) {
            case R.id.btn0:
                labelResult.append("0");
                break;
            case R.id.btn1:
                labelResult.append("1");
                break;
            case R.id.btn2:
                labelResult.append("2");
                break;
            case R.id.btn3:
                labelResult.append("3");
                break;
            case R.id.btn4:
                labelResult.append("4");
                break;
            case R.id.btn5:
                labelResult.append("5");
                break;
            case R.id.btn6:
                labelResult.append("6");
                break;
            case R.id.btn7:
                labelResult.append("7");
                break;
            case R.id.btn8:
                labelResult.append("8");
                break;
            case R.id.btn9:
                labelResult.append("9");
                break;
            case R.id.btnSoma:
                n1 = Integer.parseInt(labelResult.getText().toString());
                op = "+";
                labelResult.setText("");
                break;
            case R.id.btnSub:
                n1 = Integer.parseInt(labelResult.getText().toString());
                break;
            case R.id.btnMulti:
                n1 = Integer.parseInt(labelResult.getText().toString());
                break;
            case R.id.btnDiv:
                n1 = Integer.parseInt(labelResult.getText().toString());
                break;
            case R.id.btnIgual:

                n2 = Integer.parseInt(labelResult.getText().toString());

                switch (op){
                    case "+":
                        resultado = n1 + n2;
                        break;
                }

                labelResult.setText(String.valueOf(resultado));

        }
    }

    public void btnIgual(View view) {

    }

    public void calculo(View view) {
        switch (view.getId()) {
            case R.id.btnSoma:
                labelResult.setText(n1 + n2);
                break;
            case R.id.btnSub:
                labelResult.setText(n1 - n2);
                break;
            case R.id.btnMulti:
                labelResult.setText(n1 * n2);
                break;
            case R.id.btnDiv:
                labelResult.setText(n1 / n2);
                break;
        }
    }

    public void btnC(View view) {
        labelResult.setText(null);
    }

}
