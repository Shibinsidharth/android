package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bmul,bdiv,bclear,beq,bdot;
    EditText e;
    Double a,b,c;
    int d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);
        b3=(Button) findViewById(R.id.b3);
        b4=(Button) findViewById(R.id.b4);
        b5=(Button) findViewById(R.id.b5);
        b6=(Button) findViewById(R.id.b6);
        b7=(Button) findViewById(R.id.b7);
        b8=(Button) findViewById(R.id.b8);
        b9=(Button) findViewById(R.id.b9);
        b0=(Button) findViewById(R.id.b0);
        bdot=(Button) findViewById(R.id.bdot);
        badd=(Button) findViewById(R.id.badd);
        bsub=(Button) findViewById(R.id.bsub);
        bmul=(Button) findViewById(R.id.bmul);
        bdiv=(Button) findViewById(R.id.bdiv);
        bclear=(Button) findViewById(R.id.bclear);
        beq=(Button) findViewById(R.id.beq);
        e=(EditText) findViewById(R.id.editText);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
              @Override
            public void onClick(View v) {
                  e.setText(e.getText()+"3");
              }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"0");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+".");
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Double.parseDouble(e.getText().toString());
                d=1;
                e.setText("");
            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Double.parseDouble(e.getText().toString());
                d=2;
                e.setText("");
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Double.parseDouble(e.getText().toString());
                d=3;
                e.setText("");
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Double.parseDouble(e.getText().toString());
                d=4;
                e.setText("");
            }
        });
        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText("");
            }
        });
        beq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=Double.parseDouble(e.getText().toString());
                if(d==1){
                    c=a+b;
                }
                else if(d==2){
                    c=a-b;
                }
                else if(d==3){
                    c=a*b;
                }
                else{
                    c=a/b;
                }
                e.setText(Double.toString(c));
            }
        });
    }
}
