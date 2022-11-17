package com.example.labtask_16_11_22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String[] convertArray = {"Select One", "BMI", "Currency Converter"};
    Spinner mySpinner;
    String selectedData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, convertArray);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner= findViewById(R.id.calculateTypeSpinner);
        mySpinner.setAdapter(aa);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            selectedData = convertArray[i];
            if (selectedData.equals("BMI")){
//Go to BMI Activity
            } else if (selectedData.equals("Currency Converter")) {
                //Go to currancy converter activity.
            }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}