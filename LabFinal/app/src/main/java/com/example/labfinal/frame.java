package com.example.labfinal;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class frame extends Fragment {
    ListView listView;
    Button showStudents;
    String[] students;






    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_frame, container, false);
        listView = view.findViewById(R.id.listView);
        showStudents = view.findViewById(R.id.showAllStudents);
        students = getResources().getStringArray(R.array.students);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this, R.id.mytexviewid, R.id.listView, students);
        showStudents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        return view;
    }


}