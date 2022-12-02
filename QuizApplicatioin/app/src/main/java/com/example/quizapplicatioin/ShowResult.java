package com.example.quizapplicatioin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ShowResult extends AppCompatActivity {
    TextView showResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_result);
        showResult = findViewById(R.id.showResultID);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int totalMarks = bundle.getInt("totalMarks");
            showResult.setText("You get " + totalMarks + " out of 10");
        }
    }

    public void tryAgainFunction(View view) {
        Intent myIntent = new Intent(this, MainActivity.class);
        startActivity(myIntent);
    }
}