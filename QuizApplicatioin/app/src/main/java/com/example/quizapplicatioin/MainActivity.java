package com.example.quizapplicatioin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioGroup q1RadioGroup;
    int q1marks = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        q1RadioGroup = findViewById(R.id.q1radioGroupID);
    }

    public void toSecondPage(View view) {
        int selectedId = q1RadioGroup.getCheckedRadioButtonId();
          if (selectedId == R.id.q1radioBtn1ID) {
                q1marks = 5;
            }
          Intent myIntent = new Intent(this, SecondQuestion.class);
          myIntent.putExtra("Marks_of_Q1", q1marks);
            startActivity(myIntent);

    }



}