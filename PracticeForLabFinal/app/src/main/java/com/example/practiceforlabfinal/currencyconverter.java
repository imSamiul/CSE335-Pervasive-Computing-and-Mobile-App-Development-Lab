package com.example.practiceforlabfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class currencyconverter extends AppCompatActivity {

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currencyconverter);
        radioGroup = findViewById(R.id.radioGroupID);
    }

    public void convertType(View view) {
        int selectedId = radioGroup.getCheckedRadioButtonId();
        if (selectedId == R.id.bdtToUsd){
            displayFragment(new bdtousd(),1);
        }
        else if(selectedId == R.id.usdToBdt){
            displayFragment(new usdtobdt(),2);
        }
    }

    private void displayFragment(Fragment fragment, int flag) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        if (flag ==1){
            ft.add(R.id.fragment,fragment );
        }
        else if (flag == 2){
            ft.replace(R.id.fragment,fragment);
        }
        ft.commit();
    }
}