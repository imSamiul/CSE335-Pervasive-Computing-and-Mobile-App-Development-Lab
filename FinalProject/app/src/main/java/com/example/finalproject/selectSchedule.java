package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class selectSchedule extends AppCompatActivity implements OnItemClickListener {
String[] route ={"1.Dhanmondi-DSC","2.Uttara-Rajlokkhi-DSC","3.Tongi College gate-DSC","4.ECB Chattor-Mirpur-DSC", "5.Konabari Pukur Par-Zirabo-Ashulia Bazar-DSC", "6.Baipail-Nabinagar-C&B-DSC", "7.Dhamrai Bus Stand-Nabinagar-C&B-DSC", "8.Savar-C&B-DSC", "9.Narayanganj Chasara-Dhanmondi-DSC","10.Green Model Town-Mugdha Model Thana-Malibag-Rampura-DSC"};
Spinner routeSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_schedule);
        routeSpinner = findViewById(R.id.routeSpinnerId);
        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.my_selected_item,route);
        adapter.setDropDownViewResource(R.layout.my_dropdown_item);
        routeSpinner.setAdapter(adapter);
//        routeSpinner.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
    public void goBack(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}