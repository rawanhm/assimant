package com.example.assimant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText PersonName ;
Button enter ;
TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PersonName=(EditText)findViewById(R.id.PersonName);
         enter=(Button)findViewById(R.id.enter) ;
         name =(TextView)findViewById(R.id.name);
         enter.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                String nam = PersonName.getText().toString();
                name.setText("Hello " + nam+"!");
            }
        });


    }
}