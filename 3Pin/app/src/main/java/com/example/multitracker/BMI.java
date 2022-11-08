package com.example.multitracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class BMI extends AppCompatActivity {
    Button maleBtn;
    Button femaleBtn;
    EditText ageEditTxt , weightEditTxt , heightEditTxt;
    static String bmiOutPut = "BMIOutPut";
    static String bmiStatus = "BMIStatus";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        maleBtn = findViewById(R.id.maleBtn);
        femaleBtn = findViewById(R.id.femaleBtn);
        ageEditTxt = findViewById(R.id.ageID);
        weightEditTxt = findViewById(R.id.weightID);
        heightEditTxt = findViewById(R.id.heightID);
        Window window = BMI.this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(ContextCompat.getColor(BMI.this,R.color.black));
    }





    /// Gender : Male selection
    public void maleCicked(View view) {

        if(maleBtn.isSelected())
        {
            maleBtn.setSelected(!maleBtn.isSelected());
            femaleBtn.setSelected(!maleBtn.isSelected());


            System.out.println("isFemale selected : " + femaleBtn.isSelected());
            System.out.println("isMale selected : " + maleBtn.isSelected());
        }
        else if (!maleBtn.isSelected()) {
             maleBtn.setSelected(!maleBtn.isSelected());
             femaleBtn.setSelected(!maleBtn.isSelected());


            System.out.println("isFemale selected : " + femaleBtn.isSelected());
            System.out.println("isMale selected : " + maleBtn.isSelected());
        }
    }





    /// Gender : Female selection
    public void femaleClicked(View view) {
        if(femaleBtn.isSelected())
        {
            femaleBtn.setSelected(!femaleBtn.isSelected());
            maleBtn.setSelected(!femaleBtn.isSelected());

            System.out.println("isFemale selected : " + femaleBtn.isSelected());
            System.out.println("isMale selected : " + maleBtn.isSelected());
        }
        else if (!femaleBtn.isSelected()) {
            femaleBtn.setSelected(!femaleBtn.isSelected());
            maleBtn.setSelected(!femaleBtn.isSelected());

            System.out.println("isFemale selected : " + femaleBtn.isSelected());
            System.out.println("isMale selected : " + maleBtn.isSelected());
        }
    }


    public void calculateBMI(View view) {
        double height = Double.parseDouble(heightEditTxt.getText().toString());
        double weight = Double.parseDouble(weightEditTxt.getText().toString());
        int age = Integer.parseInt(ageEditTxt.getText().toString());
        String status = "";




        // Formulae
        height = height / 100;
        double BMI = weight / (height * height);




        // Status
        if (BMI < 18.50 ){
            status = "UnderWeight";
        } else if(BMI > 18.50 && BMI < 24.99){
            status = "Healthy Weight";
        } else if(BMI > 25.00 && BMI < 29.99){
            status = "Overweight";
        } else if(BMI > 30.00){
            status = "Obese";
        }


        Intent bmiOutput = new Intent(this,BMIOutput.class);
        bmiOutput.putExtra(bmiOutPut,Double.toString(BMI));
        bmiOutput.putExtra(bmiStatus,status);
        startActivity(bmiOutput);
    }
}