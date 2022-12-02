package com.example.practiceforlabfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button(View view) {
        if (view.getId() == R.id.btnBMI) {
            Intent intent = new Intent(this, bmi.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.btnCurrencyConverter){
            Intent intent = new Intent(this, currencyconverter.class);
            startActivity(intent);
    }
        else if(view.getId() == R.id.btnStudentList){
            Intent intent = new Intent(this, studentlist.class);
            startActivity(intent);
        }
    }
}