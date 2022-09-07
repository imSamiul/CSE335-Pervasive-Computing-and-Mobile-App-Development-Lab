package com.example.labevaluation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText name, phone, section, weight, height;
    TextView showResult;
    double gWeight, gHeight, bmi;
    String gName, gPhone, gSection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        phone = findViewById(R.id.phone);
        section = findViewById(R.id.section);
        weight = findViewById(R.id.weight);
        height = findViewById(R.id.height);
        showResult = findViewById(R.id.showResult);
    }

    @SuppressLint("SetTextI18n")
    public void display(View view) {
        gName = name.getText().toString();
        gPhone = phone.getText().toString();
        gSection = section.getText().toString();
        gWeight = Double.parseDouble(weight.getText().toString());
        gHeight = Double.parseDouble(height.getText().toString());
        bmi = gWeight / (gHeight * gHeight);
        if (bmi <= 18.4) {
            showResult.setText("Hi " + gName + " (" + gPhone + ")," + " you are underweight, take care of your health");
        }
        if (18.5 <= bmi && bmi <= 24.9) {
            showResult.setText("Hi " + gName + " (" + gPhone + ")," + " you are Normal, take care of your health");
        }
        if (25.0 <= bmi && bmi <= 39.9) {
            showResult.setText("Hi " + gName + " (" + gPhone + ")," + " you are Overweight, take care of your health");
        }
        if (bmi > 40.0) {
            showResult.setText("Hi " + gName + " (" + gPhone + ")," + " you are Obese, take care of your health");

        }
    }
}