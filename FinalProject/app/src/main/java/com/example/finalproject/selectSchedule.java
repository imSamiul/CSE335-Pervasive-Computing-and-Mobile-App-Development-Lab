package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class selectSchedule extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
String[] route ={"1.Dhanmondi-DSC","2.Uttara-Rajlokkhi-DSC","3.Tongi College gate-DSC","4.ECB Chattor-Mirpur-DSC", "5.Konabari Pukur Par-Zirabo-Ashulia Bazar-DSC", "6.Baipail-Nabinagar-C&B-DSC", "7.Dhamrai Bus Stand-Nabinagar-C&B-DSC", "8.Savar-C&B-DSC", "9.Narayanganj Chasara-Dhanmondi-DSC","10.Green Model Town-Mugdha Model Thana-Malibag-Rampura-DSC"};
Spinner routeSpinner;
String routeName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_schedule);
        routeSpinner = findViewById(R.id.routeSpinnerId);
        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.my_selected_item,route);
        adapter.setDropDownViewResource(R.layout.my_dropdown_item);
        routeSpinner.setAdapter(adapter);
        routeSpinner.setOnItemSelectedListener(this);
    }


    public void goBack(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }




    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        routeName = route[i];
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
    public void showBus(View view) {
        Intent intent = new Intent(this, BusSchedule.class);
        intent.putExtra("routeName",routeName);
    }
}