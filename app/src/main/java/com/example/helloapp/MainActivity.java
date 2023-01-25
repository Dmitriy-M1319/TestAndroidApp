package com.example.helloapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        TextView text = findViewById(R.id.header1);
        text.setText("Hello 1");
    }

    @SuppressLint("SetTextI18n")
    public void btnOnClicked(View view) {
        TextView text = findViewById(R.id.header1);
        if(text.getText().equals("Hello 1")) {
            text.setText("Hello 2");
        } else {
            text.setText("Hello 1");
        }
    }


}