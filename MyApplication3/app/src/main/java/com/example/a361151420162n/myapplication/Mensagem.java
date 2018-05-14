package com.example.a361151420162n.myapplication;

import android.app.AlertDialog;
import android.content.Context;

/**
 * Created by 36115142016.2N on 07/05/2018.
 */

public class Mensagem {
    Mensagem(Context context, String str) {
        AlertDialog alertDialog = new AlertDialog.Builder(context).create();
        alertDialog.setTitle("MENSAGEM");
        alertDialog.setMessage(str);
        alertDialog.show();
    }
}
