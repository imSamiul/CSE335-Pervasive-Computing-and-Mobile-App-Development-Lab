package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEditText = findViewById(R.id.nameEditTextId);
    }


//    public void clickFunction(View view) {
//        Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show();
//    }

    public void submitFunction(View view) {
        String name = nameEditText.getText().toString();
        Toast.makeText(this, "Welcome " + name, Toast.LENGTH_SHORT).show();

    }
}