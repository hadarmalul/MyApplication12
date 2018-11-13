package com.example.user.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2;
    TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        txt1 = (TextView) findViewById(R.id.txt1);
    }

    public void rdclick(View view) {
        Random rd = new Random();
        int r = rd.nextInt();
        txt1.setText("Number: "+r);
    }

    public void cnlclick(View view) {
        txt1.setText("Number not found");
    }
}
