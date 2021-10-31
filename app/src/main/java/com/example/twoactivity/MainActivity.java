package com.example.twoactivity;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements OnClickListener {
    Button btnActTwo;
    Button btnActThree;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnActTwo = (Button) findViewById(R.id.btnActTwo);
        btnActTwo.setOnClickListener(this);
        btnActThree = (Button)  findViewById(R.id.btnActThree);
        btnActThree.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnActTwo:
                Intent intent = new Intent(this, ActivityTwo.class);
            startActivity(intent);
                break;
            case R.id.btnActThree:
                Intent intent1 = new Intent(this, ActivityThree.class);
            startActivity(intent1);
                break;
        }
    }



}

