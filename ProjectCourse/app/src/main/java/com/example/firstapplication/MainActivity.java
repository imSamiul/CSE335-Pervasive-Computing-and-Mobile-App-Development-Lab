package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
//    EditText nameEditText;
    EditText firstValue, secondValue;
    TextView showResult;
    double fValue, sValue, result;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        nameEditText = findViewById(R.id.nameEditTextId);
        firstValue = findViewById(R.id.firstValue);
        secondValue = findViewById(R.id.secondValue);
        showResult = findViewById(R.id.showResult);
    }


//    public void clickFunction(View view) {
//        Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show();
//    }

//    public void submitFunction(View view) {
//        String name = nameEditText.getText().toString();
//        Toast.makeText(this, "Welcome " + name, Toast.LENGTH_SHORT).show();
//
//    }

    public void onPlus(View view) {
        fValue = Double.parseDouble(firstValue.getText().toString());
        sValue =Double.parseDouble( secondValue.getText().toString());
        result =(fValue+sValue);
        showResult.setText(df.format(result));

    }

    public void onMinus(View view) {
        fValue = Double.parseDouble(firstValue.getText().toString());
        sValue =Double.parseDouble( secondValue.getText().toString());
        result =(fValue-sValue);
        showResult.setText(df.format(result));
    }

    public void onMultiply(View view) {
        fValue = Double.parseDouble(firstValue.getText().toString());
        sValue =Double.parseDouble( secondValue.getText().toString());
        result =(fValue*sValue);
        showResult.setText(df.format(result));
    }

    public void onDivide(View view) {
        fValue = Double.parseDouble(firstValue.getText().toString());
        sValue =Double.parseDouble( secondValue.getText().toString());
        result =(fValue/sValue);
        showResult.setText(df.format(result));
    }
}