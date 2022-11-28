package com.example.firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.common.data.DataHolder;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    EditText name, id, department, residence;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        id = findViewById(R.id.id);
        department = findViewById(R.id.department);
        residence = findViewById(R.id.residence);
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

    }
}