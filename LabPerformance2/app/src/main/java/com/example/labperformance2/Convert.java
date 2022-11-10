package com.example.labperformance2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Convert extends AppCompatActivity {
    RadioGroup radioGroup;
    EditText amount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert);
        amount = findViewById(R.id.amountId);
        radioGroup = findViewById(R.id.radioGroupId);
    }
    public void convertC(View view){
        int selectedId= radioGroup.getCheckedRadioButtonId();
        if (selectedId == R.id.usd){
            double usd = Double.parseDouble(amount.getText().toString());
            double bdt = usd * 84.5;
            Toast.makeText(this, "BDT: "+bdt, Toast.LENGTH_SHORT).show();
        }
        else if (selectedId == R.id.euro){
            double euro = Double.parseDouble(amount.getText().toString());
            double bdt = euro * 100.5;
            Toast.makeText(this, "BDT: "+bdt, Toast.LENGTH_SHORT).show();
        }

    }
}