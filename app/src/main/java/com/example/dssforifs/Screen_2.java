package com.example.dssforifs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Screen_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);


        Button button=findViewById(R.id.tap_for_information_button);

        button.setOnClickListener(v -> {
            Intent intent2=new Intent(Screen_2.this,Screen_3.class);

            startActivity(intent2);
        });
    }
}