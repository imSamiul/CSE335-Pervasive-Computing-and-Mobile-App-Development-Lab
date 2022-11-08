package com.example.multitracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Choose extends AppCompatActivity {
    RadioGroup optionsRadioGroup;
    LinearLayout choosEUi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
        optionsRadioGroup = findViewById(R.id.chooseOptionsGroup);
        choosEUi = findViewById(R.id.chooseUI);
        choosEUi.setBackgroundResource(R.drawable.background_img);
        Window window = Choose.this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(ContextCompat.getColor(Choose.this,R.color.black));
    }

    public void backToHome(View view) {
        Intent ToHome = new Intent(this,MainActivity.class);
        startActivity(ToHome);
    }

    public void timeToPlay(View view) {
        Intent playBMI = new Intent(this,BMI.class);
        Intent playQuiz = new Intent(this,QUIZ.class);

       if(optionsRadioGroup.getCheckedRadioButtonId() == R.id.chooseOptionBMIRBtn){
           startActivity(playBMI);
       }else if (optionsRadioGroup.getCheckedRadioButtonId() == R.id.chooseOptionQuizRBtn) {
            startActivity(playQuiz);
       }else {
           Toast.makeText(this, "Choose any one \uD83D\uDE0A", Toast.LENGTH_SHORT).show();
       }
    }
}