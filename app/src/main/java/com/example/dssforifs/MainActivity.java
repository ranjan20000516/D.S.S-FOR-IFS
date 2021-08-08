package com.example.dssforifs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button1_screen1);

        button.setOnClickListener(v -> {

            Intent intent1=new Intent(MainActivity.this,Screen_2.class);
            startActivity(intent1);
        });
    }
}