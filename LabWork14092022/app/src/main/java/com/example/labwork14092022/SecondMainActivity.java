package com.example.labwork14092022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondMainActivity extends AppCompatActivity {
    TextView outputView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_main);
        outputView = findViewById(R.id.outputView);

        Intent myGetIntent = getIntent();
        String name = myGetIntent.getStringExtra("userdata");
        String password = myGetIntent.getStringExtra("password");
        outputView.setText("Welcome " +  name +" "+ password);

    }
}