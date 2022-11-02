package com.example.labwork14092022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 EditText userNameEditText, passwordEditText;
 String userName, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userNameEditText = findViewById(R.id.userNameEditTextId);
        passwordEditText = findViewById(R.id.passwordEditTextId);
    }

    public void nextFunction(View view) {
        userName = userNameEditText.getText().toString();
        password = passwordEditText.getText().toString();
        if(userName.equals("Rakib") && password.equals("123")){
            Intent myIntent = new Intent(this, SecondMainActivity.class);
            myIntent.putExtra("userdata",userName);
            startActivity(myIntent);
        }
        else{
            Toast.makeText(this, "Wrong username/password", Toast.LENGTH_SHORT).show();
        }
    }
}