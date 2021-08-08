package com.example.dssforifs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

public class Screen_3 extends AppCompatActivity {

     public static final String EXTRA_TEXT="extra_text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);

        String[] states=getResources().getStringArray(R.array.States);

        AutoCompleteTextView editText=findViewById(R.id.state_editable_text_view);
        ArrayAdapter<String> adapter= new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, states);
        editText.setAdapter(adapter);


        EditText editable_button=  findViewById(R.id.area_editable_text);
        Button button=findViewById(R.id.show_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text= editable_button.getText().toString();
                Intent intent3=new Intent(Screen_3.this,Screen_4.class);
                intent3.putExtra(EXTRA_TEXT,text);
                startActivity(intent3);
            }
        });
    }
}