package com.example.quiz_app_task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

import com.example.quiz_app_task.MainActivity;
import com.example.quiz_app_task.R;

public class ThirdActivity extends AppCompatActivity {
    int totalmarks=0;
    TextView outputView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Intent myGetIntent= getIntent();
        totalmarks= myGetIntent.getIntExtra("Total_marks",0);
        outputView=findViewById(R.id.outputTextviewID);
        outputView.setText("Your marks= "+totalmarks+" out of 10");
    }
    public void tryAgainFunction(View view) {
        Intent myIntent=new Intent(this, MainActivity.class);
        startActivity(myIntent);
    }
}