package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

public class show_namaz_time extends AppCompatActivity {
    TextView date_text_view, month_text_view, Fajr_text_view,Sunrise_text_view,Dhuhr_text_view,Asr_text_view,Sunset_text_view,Maghrib_text_view,Isha_text_view;
String time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_namaz_time);
        Objects.requireNonNull(getSupportActionBar()).hide();

        date_text_view = findViewById(R.id.date_text_view);
        month_text_view = findViewById(R.id.month_text_view);
        Fajr_text_view=findViewById(R.id.Fajr);
        Sunrise_text_view=findViewById(R.id.sunrise);
        Dhuhr_text_view=findViewById(R.id.Dhuhr);
        Asr_text_view=findViewById(R.id.Asr);
        Sunset_text_view=findViewById(R.id.sunset);
        Maghrib_text_view=findViewById(R.id.Magrib);
        Isha_text_view = findViewById(R.id.Isha);

        Intent myGetIntent = getIntent();
        String date = myGetIntent.getStringExtra("date");
        String month = myGetIntent.getStringExtra("month");
        String Fajr=myGetIntent.getStringExtra("Fajr");
        String Sunrise=myGetIntent.getStringExtra("Sunrise");
        String Dhuhr=myGetIntent.getStringExtra("Dhuhr");
        String Asr=myGetIntent.getStringExtra("Asr");
        String Sunset=myGetIntent.getStringExtra("Sunset");
        String Maghrib=myGetIntent.getStringExtra("Magrib");
        String Isha = myGetIntent.getStringExtra("Isha");


        date_text_view.setText(date);
        month_text_view.setText(month);
        Fajr_text_view.setText(Fajr);
        Dhuhr_text_view.setText(Dhuhr);
        Sunrise_text_view.setText(Sunrise);
        Asr_text_view.setText(Asr);
        Maghrib_text_view.setText(Maghrib);
        Sunset_text_view.setText(Sunset);
        Isha_text_view.setText(Isha);


    }

    public void show_time_btn(View view) {

        if (view.getId()==R.id.go_back){
            Intent myIntent = new Intent(this, NamazSchedulePlaceSelect.class);
            startActivity(myIntent);
        }
        else if (view.getId()==R.id.about_me){
            Intent myIntent = new Intent(this, about_me.class);
            startActivity(myIntent);
        }
        else if (view.getId()==R.id.exit){
            this.finishAffinity();
        }
    }

//    private String convertTo12(String fajr) {
//        try {
//            final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
//            final Date dateObj = sdf.parse(fajr);
//            return new SimpleDateFormat("hh:mm aa").format(dateObj);
//        } catch (final ParseException e) {
//            e.printStackTrace();
//        }
//    }
}