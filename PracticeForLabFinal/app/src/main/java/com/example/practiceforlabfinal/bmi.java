package com.example.practiceforlabfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class bmi extends AppCompatActivity {
    EditText height, weight;
    TextView displayBMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        height = findViewById(R.id.heightID);
        weight = findViewById(R.id.weightID);
        displayBMI = findViewById(R.id.bmiResult);

    }

    public void calculatebmi(View view) {
        double wt = Double.parseDouble(weight.getText().toString());
        double ht = Double.parseDouble(height.getText().toString());
        double result = wt / (ht*ht);
        displayBMI.setText(""+result);
    }
}