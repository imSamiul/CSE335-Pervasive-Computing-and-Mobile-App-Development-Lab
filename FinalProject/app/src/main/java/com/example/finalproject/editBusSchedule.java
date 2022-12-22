package com.example.finalproject;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class editBusSchedule extends Fragment {
    EditText busfromdscET, bustodscET, busnumberET;
    TextView busRouteET, busIdET;
    String busId;
    Button editSchedule;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        if (getArguments()!=null){
            busId = getArguments().getString("busId");
            Log.d("BUSID", "Bus id is " + busId);
        }

        View view =  inflater.inflate(R.layout.fragment_edit_bus_schedule, container, false);
        busRouteET = view.findViewById(R.id.editBusRoute);
        busIdET = view.findViewById(R.id.editBusId);
        busfromdscET = view.findViewById(R.id.editbusfromdsc);
        bustodscET = view.findViewById(R.id.editbustodsc);
        busnumberET = view.findViewById(R.id.editbusnumber);
        editSchedule = view.findViewById(R.id.editBusSchedulebtn);


        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("buses").child(busId);
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                dataholder data = snapshot.getValue(dataholder.class);
                busIdET.setText(data.getBusId());
               busRouteET.setText(data.getRoute());
                busfromdscET.setText(data.getTimefromdsc());
                bustodscET.setText(data.getTimetodsc());
                busnumberET.setText(data.getBusNo());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        editSchedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String busfromdsc = busfromdscET.getText().toString();
                String bustodsc = bustodscET.getText().toString();
                String busnuber = busnumberET.getText().toString();
                String busroute = busRouteET.getText().toString();

                dataholder obj = new dataholder(busId, busroute,  busfromdsc, bustodsc, busnuber);
                FirebaseDatabase fbdb = FirebaseDatabase.getInstance();
                DatabaseReference node = fbdb.getReference("buses");
                node.child(busId).setValue(obj);

                Toast.makeText(getActivity(), "Updated", Toast.LENGTH_SHORT).show();

            }
        });

        return view;
    }


}