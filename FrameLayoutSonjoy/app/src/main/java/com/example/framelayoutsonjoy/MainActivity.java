package com.example.framelayoutsonjoy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void changeFragment(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        if (view.getId()==R.id.fragment1btn)
        {
         fragmentTransaction.add(R.id.frameLayout, new Fragment1());
        }
        else if (view.getId() == R.id.fragment2btn){
            fragmentTransaction.replace(R.id.frameLayout, new Fragment2());
        }
        fragmentTransaction.commit();
    }
}