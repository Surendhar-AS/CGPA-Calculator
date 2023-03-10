package com.example.cgpacalculatorapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.text.TextUtils;
import android.widget.*;
import android.view.View;
import android.os.Bundle;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MainActivity4 extends AppCompatActivity {
    Boolean flag=true;
    double a,b,c,d,e,g,h,i,j,a1,a2,a3,b1,b2,mark;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button e1=(Button) findViewById(R.id.e1);
        ConstraintLayout tmcl=(ConstraintLayout) findViewById(R.id.tmcl);
        Button e2=(Button) findViewById(R.id.e2);
        ConstraintLayout pmcl=(ConstraintLayout) findViewById(R.id.pmcl);
        Button e3=(Button) findViewById(R.id.e3);
        ConstraintLayout lmcl=(ConstraintLayout) findViewById(R.id.lmcl);
        Button gt=(Button) findViewById(R.id.gt);
        TextView gt1=(TextView) findViewById(R.id.gt1);
        EditText as1=(EditText)findViewById(R.id.AS1);
        EditText as2=(EditText)findViewById(R.id.AS2);
        EditText as3=(EditText)findViewById(R.id.AS3);
        EditText c1=(EditText)findViewById(R.id.C1);
        EditText c2=(EditText)findViewById(R.id.C2);
        EditText f=(EditText)findViewById(R.id.F);
        EditText r1=(EditText)findViewById(R.id.R1);
        EditText r2=(EditText)findViewById(R.id.R2);
        EditText r3=(EditText)findViewById(R.id.R3);
        EditText li=(EditText)findViewById(R.id.Li1);
        EditText lf=(EditText)findViewById(R.id.Lf1);
        EditText ct=(EditText)findViewById(R.id.crt);
        EditText cl=(EditText)findViewById(R.id.crl);
        EditText cj=(EditText)findViewById(R.id.crj);


        e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId())
                {
                    case R.id.e1:
                        if(flag==true)
                        {
                            tmcl.setVisibility(View.INVISIBLE);
                            e1.setText("enable");
                            flag=false;
                        }
                        else {
                            tmcl.setVisibility(View.VISIBLE);
                            e1.setText("disable");
                            flag=true;
                        }
                }
            }
        });
        e2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId())
                {
                    case R.id.e2:
                        if(flag==true)
                        {
                            pmcl.setVisibility(View.INVISIBLE);
                            e2.setText("enable");
                            flag=false;
                        }
                        else {
                            pmcl.setVisibility(View.VISIBLE);
                            e2.setText("disable");
                            flag=true;
                        }
                }
            }
        });
        e3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId())
                {
                    case R.id.e3:
                        if(flag==true)
                        {
                            lmcl.setVisibility(View.INVISIBLE);
                            e3.setText("enable");
                            flag=false;
                        }
                        else {
                            lmcl.setVisibility(View.VISIBLE);
                            e3.setText("disable");
                            flag=true;
                        }
                }
            }
        });
        gt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z=ct.getText().toString();
                String y=cl.getText().toString();
                String x=cj.getText().toString();
                String w=as1.getText().toString();
                String l=as2.getText().toString();
                String u=as3.getText().toString();
                String t=c1.getText().toString();
                String s=c2.getText().toString();
                String r=f.getText().toString();
                String q=r1.getText().toString();
                String p=r2.getText().toString();
                String o=r3.getText().toString();
                String n=li.getText().toString();
                String m=lf.getText().toString();
                if(TextUtils.isEmpty(z)){
                    ct.setText("0");
                }
                else {
                    a = Double.parseDouble(ct.getText().toString());
                }

                if(TextUtils.isEmpty(y)){
                    cl.setText("0");
                }
                else {
                    b = Double.parseDouble(cl.getText().toString());
                }
                if(TextUtils.isEmpty(x)){
                    cj.setText("0");
                }
                else {
                    c = Double.parseDouble(cj.getText().toString());
                }
                if(TextUtils.isEmpty(w)){
                    as1.setText("0");
                }
                else {
                    d = Double.parseDouble(as1.getText().toString());
                }
                if(TextUtils.isEmpty(l)){
                    as2.setText("0");
                }
                else {
                    e = Double.parseDouble(as2.getText().toString());
                }
                if(TextUtils.isEmpty(u)){
                    as3.setText("0");
                }
                else {
                    g = Double.parseDouble(as3.getText().toString());
                }
                if(TextUtils.isEmpty(t)){
                    c1.setText("0");
                }
                else {
                    h = Double.parseDouble(c1.getText().toString());
                }
                if(TextUtils.isEmpty(s)){
                    c2.setText("0");
                }
                else {
                    i = Double.parseDouble(c2.getText().toString());
                }
                if(TextUtils.isEmpty(r)){
                    f.setText("0");
                }
                else {
                    j = Double.parseDouble(f.getText().toString());
                }
                if(TextUtils.isEmpty(q)){
                    r1.setText("0");
                }
                else {
                    a1 = Double.parseDouble(r1.getText().toString());
                }
                if(TextUtils.isEmpty(p)){
                    r2.setText("0");
                }
                else {
                    a2 = Double.parseDouble(r2.getText().toString());
                }
                if(TextUtils.isEmpty(o)){
                    r3.setText("0");
                }
                else {
                    a3 = Double.parseDouble(r3.getText().toString());
                }
                if(TextUtils.isEmpty(n)){
                    li.setText("0");
                }
                else {
                    b1 = Double.parseDouble(li.getText().toString());
                }
                if(TextUtils.isEmpty(m)){
                    lf.setText("0");
                }
                else {
                    b2 = Double.parseDouble(lf.getText().toString());
                }
                mark=((a/(a+b+c))*(d+e+g+((h/50)*15)+((i/50)*15)+((j/100)*40)))+((b/(a+b+c))*(b1+b2))+((c/(a+b+c))*(a1+a2+a3));
                DecimalFormat k = new DecimalFormat("0.00");
                k.setRoundingMode(RoundingMode.UP);
                gt1.setText("Grand Total is " + k.format(mark));
            }
        });
    }
}