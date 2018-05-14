package com.example.a361151420162n.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by 36115142016.2N on 03/04/2018.
 */

public class Generico extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Intent intent;
        switch (menuItem.getItemId()) {
            case R.id.itemDeCadastro:
                intent = new Intent(this, TelaDeCadastroActivity.class);
                this.startActivity(intent);
                break;
            case R.id.itemAtualizacao:
                intent = new Intent(this, TelaDeAtualizacaoActivity.class);
                this.startActivity(intent);
                break;
            case R.id.itemDeExclusao:
                intent = new Intent(this, TelaDeExclusaoActivity.class);
                this.startActivity(intent);
                break;
            case R.id.itemDeListagem:
                intent = new Intent(this, TelaDeListagemActivity.class);
                this.startActivity(intent);
                break;
        }
        return true;
    }

}
