package com.example.administrador.gerenciamentodevendas;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrador on 07/12/2015.
 */
public class Banco extends SQLiteOpenHelper{

Script script=new Script();
    public Banco(Context context) {
        super(context,"CONTROLE",null, 1);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL(script.chamascript());
    }


    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
