package com.example.administrador.gerenciamentodevendas;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.ArrayAdapter;

/**
 * Created by Administrador on 07/12/2015.
 */
public class Crud {
  SQLiteDatabase con;
    public Crud(SQLiteDatabase con){
        this.con=con;
    }

ArrayAdapter<Mercadoria> listmerc(Context context){
    ArrayAdapter<Mercadoria> adpmerc=new ArrayAdapter<Mercadoria>(context,android.R.layout.simple_list_item_1);
    Cursor cursor=con.query("MERCADORIA", null, null, null, null, null, null, null);

    if(cursor.getCount()>0)
        Mercadoria merc =new Mercadoria();
    
        adpmerc.add(cursor);
}


}

