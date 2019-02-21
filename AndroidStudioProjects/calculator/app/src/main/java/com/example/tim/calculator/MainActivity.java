package com.example.tim.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2;
    EditText ed1,ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btn1=findViewById(R.id.add);
        btn2=findViewById(R.id.sub);
        ed1=findViewById(R.id.first);
        ed1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.getText().clear();
            }
        });
        ed2=findViewById(R.id.second);
        ed2.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       ed2.getText().clear();
                                   }
                               });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!ed1.getText().toString().isEmpty() && !ed2.getText().toString().isEmpty()) {
                    int num1 = Integer.parseInt(ed1.getText().toString());
                    int num2 = Integer.parseInt(ed2.getText().toString());
                    int sum = num1 + num2;
                    Toast.makeText(MainActivity.this, "sum is " + sum, Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "please enter num1", Toast.LENGTH_SHORT).show();
                }

            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!ed1.getText().toString().isEmpty() && !ed2.getText().toString().isEmpty()) {
                    int num1 = Integer.parseInt(ed1.getText().toString());
                    int num2 = Integer.parseInt(ed2.getText().toString());
                    int sub = num1 - num2;
                    Toast.makeText(MainActivity.this, "sum is " + sub, Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "please enter num2", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
