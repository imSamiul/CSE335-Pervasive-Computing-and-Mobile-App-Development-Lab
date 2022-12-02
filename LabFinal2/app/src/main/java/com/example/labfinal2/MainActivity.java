package com.example.labfinal2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String [] studentName;
    ListView studentListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        studentListView = findViewById(R.id.studentList);
        studentName = getResources().getStringArray(R.array.students);

    }

    public void showStudents(View view) {
        ArrayAdapter<String> myadapter = new ArrayAdapter<>(this, R.layout.mycustomview, R.id.mycustomtextview, studentName);
        studentListView.setAdapter(myadapter);
        studentListView.setOnItemClickListener();

    }
}