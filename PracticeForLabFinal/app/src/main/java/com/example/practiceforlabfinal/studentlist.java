package com.example.practiceforlabfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class studentlist extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    EditText sName, sId, sResidence;
    Spinner dept;
    String[] deptList = {"CSE", "EEE", "BBA", "MBA", "LLB", "English", "Economics", "Mathematics", "Physics", "Chemistry"};
    String selectedDept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentlist);
        sName = findViewById(R.id.studentname);
        sId = findViewById(R.id.studentID);
        sResidence = findViewById(R.id.residence);
        dept = findViewById(R.id.department);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, deptList);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dept.setAdapter(adapter);
        dept.setOnItemSelectedListener(this);
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        selectedDept = deptList[i];

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void addStudent(View view) {
        String name = sName.getText().toString();
        String id = sId.getText().toString();
        String residence = sResidence.getText().toString();
        String dept = selectedDept;

        dataholder obj = new dataholder(name,id, dept, residence);

        FirebaseDatabase fbdb = FirebaseDatabase.getInstance();
        DatabaseReference node = fbdb.getReference("Students");

        node.child(id).setValue(obj);

        Toast.makeText(this, "Data added successfully", Toast.LENGTH_SHORT).show();

        sName.setText("");
        sId.setText("");
        sResidence.setText("");



    }

    public void showStudent(View view) {
        Intent intent = new Intent(this, showstudent.class);
        startActivity(intent);

    }
}