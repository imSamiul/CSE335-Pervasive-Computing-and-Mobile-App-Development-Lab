package com.example.practiceforlabfinal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class showstudent extends AppCompatActivity {
    String [] students;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showstudent);
        students = getResources().getStringArray(R.array.student);
        ArrayList<String> studentList = new ArrayList<>();
        for (String student : students) {
            studentList.add(student);
        }
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.mycustomview, R.id.mytexviewid, studentList);
        listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

        FirebaseDatabase fbdb = FirebaseDatabase.getInstance();
        DatabaseReference node = fbdb.getReference("Students");
        node.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot ds : snapshot.getChildren()) {
                    dataholder obj = ds.getValue(dataholder.class);
                    String info = "Name: "+obj.getName() + "\n" + "ID: "+obj.getId()+"\n"+ "Department: "+ obj.getDept() + "\n" + "Residence: "+ obj.getResidence();
                    studentList.add(info);

                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}