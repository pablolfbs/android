package com.example.a361151420162n.navegacao1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * Created by 36115142016.2n on 26/03/2018.
 */

public class Menu extends AppCompatActivity {

    private Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = findViewById(R.id.button);
    }

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent2;

        switch (item.getItemId()) {
            case R.id.itemTela1:
                intent2 = new Intent(this, MainActivity.class);
                startActivity(intent2);
                break;
            case R.id.itemTela2:
                intent2 = new Intent(this, Tela2Activity.class);
                startActivity(intent2);
                break;
        }
        return true;
    }

}
