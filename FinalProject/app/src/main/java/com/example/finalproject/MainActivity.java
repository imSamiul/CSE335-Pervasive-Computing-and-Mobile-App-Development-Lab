package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();
    }

    public void busSchedule(View view) {
        Intent intent = new Intent(this, selectSchedule.class);
        startActivity(intent);
    }


    public void namazSchedule(View view) {
        Intent intent = new Intent(this, NamazSchedulePlaceSelect.class);
        startActivity(intent);
    }
}