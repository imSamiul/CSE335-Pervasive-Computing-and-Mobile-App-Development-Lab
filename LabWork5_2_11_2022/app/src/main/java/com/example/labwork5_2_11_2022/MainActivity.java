package com.example.labwork5_2_11_2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String[] gender ={"Male", "Female"};
    EditText nameId,insertId;
    Spinner mySpinner;
    String name, id, selectedGender;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mySpinner = findViewById(R.id.spinnerId);
        nameId = findViewById(R.id.nameId);
        insertId = findViewById(R.id.insertId);
        // Create an ArrayAdapter using the string array and a default spinner layout
//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.planets_array, android.R.layout.simple_spinner_item);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, gender); //Object.....? createFromResource...?
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); //Sets the layout resource to create the drop down views.
        // Apply the adapter to the spinner
        mySpinner.setAdapter(adapter);
//        Then you need to specify the interface implementation by calling setOnItemSelectedListener():
//        Register a callback to be invoked when an item in this AdapterView has been selected.
        mySpinner.setOnItemSelectedListener(this);
    }



    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        selectedGender= gender[i];
    }
    public void ClickFunction(View view) {
        name = nameId.getText().toString();
        id = insertId.getText().toString();
        Toast.makeText(this, "Your name is "+ name+ " Id is: "+ id+ " Gender: "+ selectedGender, Toast.LENGTH_LONG).show();

    }



    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}