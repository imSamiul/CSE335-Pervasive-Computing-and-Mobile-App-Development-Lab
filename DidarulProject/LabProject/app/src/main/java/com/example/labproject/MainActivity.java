package com.example.labproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView toDoList;
    EditText editText;
    Button btnAdd, btnReset;
    ArrayList<String> todoListArray = new ArrayList<>();
    int position;
    ArrayAdapter adapter;
    ArrayList<String> updatedTask;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.edit_text);
        btnAdd=findViewById(R.id.bt_add);
        btnReset=findViewById(R.id.bt_reset);
        toDoList=findViewById(R.id.list_view);
        toDoList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, taskUpdate.class);
                intent.putExtra("taskList", todoListArray);
                intent.putExtra("position", i);
                startActivity(intent);
            }
        });
       updatedTask = getIntent().getStringArrayListExtra("updatedArray");
       adapter=new ArrayAdapter(this,R.layout.mycustomview,R.id.myTextViewID,todoListArray );
        if (updatedTask != null) {

            todoListArray = updatedTask;
            adapter=new ArrayAdapter(this,R.layout.mycustomview,R.id.myTextViewID,todoListArray );
            toDoList.setAdapter(adapter);
        }
    }
    public void addTodo(View view) {
        adapter= new ArrayAdapter(this,R.layout.mycustomview,R.id.myTextViewID,todoListArray );
        String todoTask = editText.getText().toString();
        todoListArray.add(todoTask);
        toDoList.setAdapter(adapter);
        editText.setText("");
    }


    public void reset(View view) {
        todoListArray.clear();
        toDoList.setAdapter(adapter);
    }
}