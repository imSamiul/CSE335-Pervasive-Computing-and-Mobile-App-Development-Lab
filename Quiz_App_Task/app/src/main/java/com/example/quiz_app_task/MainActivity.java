package com.example.quiz_app_task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {
    RadioGroup myq1RadioGroup;
    int q1marks = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myq1RadioGroup = findViewById(R.id.q1radioGroupID);
    }

    public void nextFunction(View view) {
        if (myq1RadioGroup.getCheckedRadioButtonId() == R.id.q1radioBtn1ID) {
            q1marks = 5;
        }
        Intent myIntent = new Intent(this,  com.example.quiz_app_task.SecondActivity.class);
        myIntent.putExtra("Marks_of_Q1", q1marks);
        startActivity(myIntent);

    }
}