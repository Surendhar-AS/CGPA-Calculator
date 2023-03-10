package com.example.cgpacalculatorapp;


import androidx.appcompat.app.AppCompatActivity;

import android.text.TextUtils;
import android.widget.*;
import android.view.View;
import android.os.Bundle;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MainActivity2 extends AppCompatActivity {

    double g,s,b,c,d,a,e,f,cc;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        EditText CC=(EditText) findViewById(R.id.CC);
        EditText S=(EditText) findViewById(R.id.S);
        EditText A=(EditText) findViewById(R.id.A);
        EditText B=(EditText) findViewById(R.id.B);
        EditText C=(EditText) findViewById(R.id.C);
        EditText D=(EditText) findViewById(R.id.D);
        EditText E=(EditText) findViewById(R.id.E);
        EditText F=(EditText) findViewById(R.id.F);
        Button cgpab=(Button) findViewById(R.id.cgpab);
        TextView cgpa=(TextView) findViewById(R.id.cgpa);
        cgpab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String y=S.getText().toString();
                if(TextUtils.isEmpty(y)){
                    S.setText("0");
                }
                else {
                    s = Double.parseDouble(S.getText().toString());
                }
                String x=A.getText().toString();
                if(TextUtils.isEmpty(x)){
                    A.setText("0");
                }
                else {
                    a = Double.parseDouble(A.getText().toString());
                }
                String w=B.getText().toString();
                if(TextUtils.isEmpty(w)){
                    B.setText("0");
                }
                else {
                    b = Double.parseDouble(B.getText().toString());
                }
                String v=C.getText().toString();
                if(TextUtils.isEmpty(v)){
                    C.setText("0");
                }
                else {
                    c = Double.parseDouble(C.getText().toString());
                }
                String u=D.getText().toString();
                if(TextUtils.isEmpty(u)){
                    D.setText("0");
                }
                else {
                    d = Double.parseDouble(D.getText().toString());
                }
                String t=E.getText().toString();
                if(TextUtils.isEmpty(t)){
                    E.setText("0");
                }
                else {
                    e = Double.parseDouble(E.getText().toString());
                }
                String r=F.getText().toString();
                if(TextUtils.isEmpty(r)){
                    F.setText("0");
                }
                else {
                    f = Double.parseDouble(F.getText().toString());
                }
                String q=CC.getText().toString();
                if(TextUtils.isEmpty(q)){
                    CC.setText("0");
                }
                else {
                    cc = Double.parseDouble(CC.getText().toString());
                }
                if((a+b+c+d+e+f+s)==cc) {
                    g = ((s * 10) + (a * 9) + (b * 8) + (c * 7) + (d * 6) + (e * 5)) / cc;
                    DecimalFormat z = new DecimalFormat("0.00");
                    z.setRoundingMode(RoundingMode.UP);
                    cgpa.setText("your cgpa is " + z.format(g));
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"total credit is should equal to the sum of all the credit",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}