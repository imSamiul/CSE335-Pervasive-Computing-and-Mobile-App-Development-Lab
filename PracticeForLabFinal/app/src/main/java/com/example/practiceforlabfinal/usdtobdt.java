package com.example.practiceforlabfinal;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class usdtobdt extends Fragment {
    EditText usd;
    TextView displaybdt;
    Button convert;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_usdtobdt, container, false);
        usd = view.findViewById(R.id.usdamount);
        displaybdt = view.findViewById(R.id.displayusd);
        convert = view.findViewById(R.id.usdconvert);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double us = Double.parseDouble(usd.getText().toString());
                double result = us * 86.5;
                displaybdt.setText("BDT: "+result);
            }
        });
        return view;
    }
}