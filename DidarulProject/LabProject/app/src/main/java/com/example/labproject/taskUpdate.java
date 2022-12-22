package com.example.labproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class taskUpdate extends AppCompatActivity {
    EditText editTask;
    int position;
    ArrayList<String> todoListArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_update);
        editTask = findViewById(R.id.edit_task);
       todoListArray = getIntent().getStringArrayListExtra("taskList");
       position = getIntent().getIntExtra("position", 0);
        editTask.setText(todoListArray.get(position));
    }

    public void updateTask(View view) {
        String newTask = editTask.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        todoListArray.set(position, newTask);
        intent.putExtra("updatedArray", todoListArray);
        startActivity(intent);

    }
}