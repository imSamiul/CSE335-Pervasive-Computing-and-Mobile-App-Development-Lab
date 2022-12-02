package com.example.labfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    String[] students;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        students = getResources().getStringArray(R.array.students);
        listView = findViewById(R.id.listView);



//
    public void showAllStudents(View view) {
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.mycustomviewid, R.id.mytexviewid, students);
        listView.setAdapter(adapter);

    }
}