package com.example.classwork1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText myEditText;
    EditText myID;
    TextView myInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myEditText = findViewById(R.id.myEditText);
        myID = findViewById(R.id.myID);
        myInfo = findViewById(R.id.displayInfo);
    }

    public void displayName(View view) {
        String name = myEditText.getText().toString();
        String id = myID.getText().toString();
        myInfo.setText("Hello " + name + " and ID: "+ id);
//        Toast.makeText(this, "Hello " + name + " and my id: "+ id, Toast.LENGTH_SHORT).show();

    }
}