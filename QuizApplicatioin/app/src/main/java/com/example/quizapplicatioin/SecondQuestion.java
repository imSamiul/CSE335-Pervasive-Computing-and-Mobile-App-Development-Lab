package com.example.quizapplicatioin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioGroup;

public class SecondQuestion extends AppCompatActivity {
 RadioGroup radioGroup;
 int q2marks = 0;
 int q1marks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_question);
        radioGroup = findViewById(R.id.q2radioGroupID);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            q1marks = bundle.getInt("Marks_of_Q1");
        }
    }
    public void toPrePage(View view) {
        Intent myIntent = new Intent(this, MainActivity.class);
        startActivity(myIntent);
    }
    public void toResultPage(View view) {
        int selectedId= radioGroup.getCheckedRadioButtonId();
        if (selectedId == R.id.q2radioBtn4ID){
            q2marks = 5;
        }
        Intent myIntent = new Intent(this, ShowResult.class);
        myIntent.putExtra("totalMarks", q1marks+q2marks);
        startActivity(myIntent);

    }
}