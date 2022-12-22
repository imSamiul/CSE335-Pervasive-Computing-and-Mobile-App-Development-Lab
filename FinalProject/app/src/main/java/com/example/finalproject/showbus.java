package com.example.finalproject;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.gms.common.data.DataHolder;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class showbus extends Fragment {
    TextView busIdTextView, busRouteTextView, busfromdscTextView, bustodscTextView, busnumberTextView;
    String busId;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        if (getArguments()!=null){
           busId=  getArguments().getString("busId");
            Log.d("BUSIDSHOWBUS", "Bus id is " + busId);
        }
        View  view = inflater.inflate(R.layout.fragment_showbus, container, false);
        busIdTextView = view.findViewById(R.id.busId);
        busRouteTextView = view.findViewById(R.id.busRoute);
        busfromdscTextView = view.findViewById(R.id.busfromdsc);
        bustodscTextView = view.findViewById(R.id.bustodsc);
        busnumberTextView = view.findViewById(R.id.busnumber);

        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("buses").child(busId);
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                dataholder data = snapshot.getValue(dataholder.class);
                busIdTextView.setText(data.getBusId());
                busRouteTextView.setText(data.getRoute());
                busfromdscTextView.setText(data.getTimefromdsc());
                bustodscTextView.setText(data.getTimetodsc());
                busnumberTextView.setText(data.getBusNo());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


        return view;
    }
}