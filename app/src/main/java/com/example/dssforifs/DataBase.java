package com.example.dssforifs;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBase extends SQLiteOpenHelper {

    private static final String dataBaseName="model";
    public DataBase(@Nullable Context context) {
        super(context, dataBaseName, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String q="create table user (model text, area text)";
        db.execSQL(q);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

   public Cursor getInfo(String data)
  {
       SQLiteDatabase db=this.getReadableDatabase();
       Cursor cursor=db.rawQuery("select * from user where area == 'data'",null);
      return cursor;
   }


}
