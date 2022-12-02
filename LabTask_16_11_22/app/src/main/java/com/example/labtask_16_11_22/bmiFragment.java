package com.example.labtask_16_11_22;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


public class bmiFragment extends Fragment {
    EditText height, weight;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bmi, container, false);
//        TextView height= view.findViewById(R.id.height);
//        TextView weight= view.findViewById(R.id.weight);
//        EditText result = view.findViewById(R.id.result);
        // your set of instructions here

        return view;

    }


}