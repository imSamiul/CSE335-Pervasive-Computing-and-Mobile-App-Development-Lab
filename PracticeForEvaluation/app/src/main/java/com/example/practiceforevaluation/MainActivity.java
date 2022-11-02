package com.example.practiceforevaluation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText firstValue, secondValue;
    TextView showResult;
    double num1, num2, result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstValue = findViewById(R.id.num1EditTextId);
        secondValue = findViewById(R.id.num2EditTextId);
        showResult= findViewById(R.id.resultTextViewId);
    }

    public void operatorCall(View view) {
        num1 = Double.parseDouble(firstValue.getText().toString());
        num2= Double.parseDouble(secondValue.getText().toString());
        if (view.getId() == R.id.addButtonId) {
            result = num1 + num2;
        }
        else if (view.getId() == R.id.subButtonId) {
            result = num1 - num2;
        } else if (view.getId() == R.id.mulButtonId) {
            result = num1 * num2;
        } else if (view.getId() == R.id.divideButtonId) {
            result = num1 / num2;
        }
        showResult.setText("" + result);
    }
}