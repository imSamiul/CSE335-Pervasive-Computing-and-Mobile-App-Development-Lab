package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Objects;

public class selectSchedule extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String[] route = {"Select a route", "1.Dhanmondi-DSC", "2.Uttara-Rajlokkhi-DSC", "3.Tongi College gate-DSC", "4.ECB Chattor-Mirpur-DSC", "5.Konabari Pukur Par-Zirabo-Ashulia Bazar-DSC", "6.Baipail-Nabinagar-C&B-DSC", "7.Dhamrai Bus Stand-Nabinagar-C&B-DSC", "8.Savar-C&B-DSC", "9.Narayanganj Chasara-Dhanmondi-DSC", "10.Green Model Town-Mugdha Model Thana-Malibag-Rampura-DSC"};
    Spinner routeSpinner;
    int selectedSchedule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_schedule);
        Objects.requireNonNull(getSupportActionBar()).hide();
        routeSpinner = findViewById(R.id.routeSpinnerId);
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.my_selected_item, route);
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
        selectedSchedule = i;
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void selectScheduleBtn(View view) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        Bundle bundle = new Bundle();
        Fragment showbus = new showbus();
        Fragment editBusSchedule = new editBusSchedule();
        if (view.getId() == R.id.showBusSchedule) {
            if (selectedSchedule == 1) {
                bundle.putString("busId", "BUS_SCH_001");
                showbus.setArguments(bundle);
                ft.add(R.id.framelayout, showbus);
            }
            else if (selectedSchedule == 2) {
                bundle.putString("busId", "BUS_SCH_002");
                showbus.setArguments(bundle);
                ft.add(R.id.framelayout, showbus);
            }
            else if (selectedSchedule == 3) {
                bundle.putString("busId", "BUS_SCH_003");
                showbus.setArguments(bundle);
                ft.add(R.id.framelayout, showbus);
            }
            else if (selectedSchedule == 4) {
                bundle.putString("busId", "BUS_SCH_004");
                showbus.setArguments(bundle);
                ft.add(R.id.framelayout, showbus);
            }
            else if (selectedSchedule == 5) {
                bundle.putString("busId", "BUS_SCH_005");
                showbus.setArguments(bundle);
                ft.add(R.id.framelayout, showbus);
            }
            else if (selectedSchedule == 6) {
                bundle.putString("busId", "BUS_SCH_006");
                showbus.setArguments(bundle);
                ft.add(R.id.framelayout, showbus);
            }
            else if (selectedSchedule == 7) {
                bundle.putString("busId", "BUS_SCH_007");
                showbus.setArguments(bundle);
                ft.add(R.id.framelayout, showbus);
            }
            else if (selectedSchedule == 8) {
                bundle.putString("busId", "BUS_SCH_008");
                showbus.setArguments(bundle);
                ft.add(R.id.framelayout, showbus);
            }
            else if (selectedSchedule == 9) {
                bundle.putString("busId", "BUS_SCH_009");
                showbus.setArguments(bundle);
                ft.add(R.id.framelayout, showbus);
            }
            else if (selectedSchedule == 10) {
                bundle.putString("busId", "BUS_SCH_010");
                showbus.setArguments(bundle);
                ft.add(R.id.framelayout, showbus);
            }
            else{
                Toast.makeText(this, "Please select a route.", Toast.LENGTH_SHORT).show();
            }
            ft.commit();
        }
        else if (view.getId() == R.id.editBusSchedule) {
            if (selectedSchedule == 1) {
                bundle.putString("busId", "BUS_SCH_001");
                editBusSchedule.setArguments(bundle);
                ft.add(R.id.framelayout, editBusSchedule);
            }
            else if (selectedSchedule == 2) {
                bundle.putString("busId", "BUS_SCH_002");
                editBusSchedule.setArguments(bundle);
                ft.add(R.id.framelayout, editBusSchedule);
            }
            else if (selectedSchedule == 3) {
                bundle.putString("busId", "BUS_SCH_003");
                editBusSchedule.setArguments(bundle);
                ft.add(R.id.framelayout, editBusSchedule);
            }
            else if (selectedSchedule == 4) {
                bundle.putString("busId", "BUS_SCH_004");
                editBusSchedule.setArguments(bundle);
                ft.add(R.id.framelayout, editBusSchedule);
            }
            else if (selectedSchedule == 5) {
                bundle.putString("busId", "BUS_SCH_005");
                editBusSchedule.setArguments(bundle);
                ft.add(R.id.framelayout, editBusSchedule);
            }
            else if (selectedSchedule == 6) {
                bundle.putString("busId", "BUS_SCH_006");
                editBusSchedule.setArguments(bundle);
                ft.add(R.id.framelayout, editBusSchedule);
            }
            else if (selectedSchedule == 7) {
                bundle.putString("busId", "BUS_SCH_007");
                editBusSchedule.setArguments(bundle);
                ft.add(R.id.framelayout, editBusSchedule);
            }
            else if (selectedSchedule == 8) {
                bundle.putString("busId", "BUS_SCH_008");
                editBusSchedule.setArguments(bundle);
                ft.add(R.id.framelayout, editBusSchedule);
            }
            else if (selectedSchedule == 9) {
                bundle.putString("busId", "BUS_SCH_009");
                editBusSchedule.setArguments(bundle);
                ft.add(R.id.framelayout, editBusSchedule);
            }
            else if (selectedSchedule == 10) {
                bundle.putString("busId", "BUS_SCH_010");
                editBusSchedule.setArguments(bundle);
                ft.add(R.id.framelayout, editBusSchedule);
            }
            else{
                Toast.makeText(this, "Please select a route.", Toast.LENGTH_SHORT).show();
            }
            ft.commit();
        }
        else if (view.getId()==R.id.go_back){
            Intent myIntent = new Intent(this, MainActivity.class);
            startActivity(myIntent);
        }
        else if (view.getId()==R.id.about_me){
            Intent myIntent = new Intent(this, about_me.class);
            startActivity(myIntent);
        }
        else if (view.getId()==R.id.exit){
            this.finishAffinity();
        }
    }
}