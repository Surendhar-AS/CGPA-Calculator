package com.example.cgpacalculatorapp;


import androidx.appcompat.app.AppCompatActivity;
import android.widget.*;
import android.view.View;
import android.content.*;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button cgpa =(Button) findViewById(R.id.cgpa);
        Button gpa =(Button) findViewById(R.id.gpa);
        Button gt =(Button) findViewById(R.id.gt);
        cgpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(i);
            }
        });
        gpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,MainActivity3.class);
                startActivity(i);
            }
        });
        gt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,MainActivity4.class);
                startActivity(i);
            }
        });

    }
}