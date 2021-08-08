package com.example.dssforifs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;

public class Screen_4 extends AppCompatActivity {

    DataBase dataBase= new DataBase(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4);


        Intent intent4= getIntent();
        String text=intent4.getStringExtra(Screen_3.EXTRA_TEXT);

    }

    public void show()
    {
//        Cursor cursor=dataBase.getInfo();

    }

}