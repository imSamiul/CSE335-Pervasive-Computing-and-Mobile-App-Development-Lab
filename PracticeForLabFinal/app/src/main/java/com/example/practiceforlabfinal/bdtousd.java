package com.example.practiceforlabfinal;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class bdtousd extends Fragment {
    EditText bdtamount;
    TextView displaybdt;
    Button bdtconvert;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bdtousd, container, false);
        bdtamount = view.findViewById(R.id.bdtamount);
        displaybdt = view.findViewById(R.id.displaybdt);
        bdtconvert = view.findViewById(R.id.bdtconvert);

        bdtconvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bdt = Double.parseDouble(bdtamount.getText().toString());
        double result = bdt * 100;
        displaybdt.setText(""+result);
            }
        });

        return view;
    }

}