package com.example.labwork_23_11_2022_list_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String [] countryName;
    ListView myListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countryName = getResources().getStringArray(R.array.countryArray);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this,R.layout.mycustomview, R.id.myTextViewID, countryName);
        myListView = findViewById(R.id.listViewID);
        myListView.setAdapter(myAdapter);
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = countryName[position];
                Toast.makeText(MainActivity.this, value, Toast.LENGTH_SHORT).show();
            }
        });
    }
}