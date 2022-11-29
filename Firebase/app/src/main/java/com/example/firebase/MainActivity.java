package com.example.firebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.common.data.DataHolder;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText name, id, department, residence;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        id = findViewById(R.id.id);
        department = findViewById(R.id.department);
        residence = findViewById(R.id.residence);
        listView = findViewById(R.id.listView);


    }

    public void add(View view) {
        String name = this.name.getText().toString();
        String id = this.id.getText().toString();
        String department = this.department.getText().toString();
        String residence = this.residence.getText().toString();
        dataholder obj = new dataholder(name, department, residence);

        FirebaseDatabase db = FirebaseDatabase.getInstance();
        DatabaseReference node = db.getReference("Students");

        node.child(id).setValue(obj);

        this.name.setText("");
        this.id.setText("");
        this.department.setText("");
        this.residence.setText("");

        Toast.makeText(this, "Value Added", Toast.LENGTH_SHORT).show();

        ArrayList<String> list = new ArrayList<>();
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this,R.layout.mycustomview, R.id.myTextViewID, list);
        listView.setAdapter(myAdapter);
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Students").child(id).child("department");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                list.clear();

                 list.add(snapshot.getValue().toString());

                myAdapter.notifyDataSetChanged();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


    }
}