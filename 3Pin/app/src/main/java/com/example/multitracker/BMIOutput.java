package com.example.multitracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BMIOutput extends AppCompatActivity {
    String BMIMsg = "";
    TextView Bmi,BMIStatus;
    String BmiOutput;
    LinearLayout BMIOutPutsss;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmioutput);

        Bmi = findViewById(R.id.BMIID);
        BMIStatus = findViewById(R.id.BMIStatusID);

        Intent bmioutput = getIntent();
        BmiOutput = bmioutput.getStringExtra(BMI.bmiOutPut);
        BMIMsg = bmioutput.getStringExtra(BMI.bmiStatus);


        BmiOutput = String.format("%.2f", Double.parseDouble(BmiOutput));
        Bmi.setText(""+BmiOutput);
        BMIStatus.setText("BMI Status : " + BMIMsg);

        BMIOutPutsss = findViewById(R.id.BMIOutputID);
        BMIOutPutsss.setBackgroundResource(R.drawable.background_img);
        Window window = BMIOutput.this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(ContextCompat.getColor(BMIOutput.this,R.color.black));

    }


    public void backToBMI(View view) {
        Intent BackToBMI = new Intent(this,BMI.class);
        startActivity(BackToBMI);
    }


    public void backToHome(View view) {
        Intent BackToHome = new Intent(this,Choose.class);
        startActivity(BackToHome);
    }
}