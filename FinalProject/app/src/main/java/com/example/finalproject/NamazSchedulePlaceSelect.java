package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Objects;

public class NamazSchedulePlaceSelect extends AppCompatActivity {
    EditText countryName, cityName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namaz_schedule_place_select);
        Objects.requireNonNull(getSupportActionBar()).hide();
        countryName = findViewById(R.id.country_name);
        cityName = findViewById(R.id.city_name);

    }

    public void select_place_button(View view) {
        String country = countryName.getText().toString();
        String city = cityName.getText().toString();

        if (view.getId()==R.id.show_time){
            if (country.equals("") || city.equals("")){
                Toast.makeText(this, "Please give the value", Toast.LENGTH_SHORT).show();
            }
            else{
            showTime(country, city);}
        }
        if (view.getId()==R.id.go_back){
            Intent myIntent = new Intent(this, MainActivity.class);
            startActivity(myIntent);

        }

    }

    public void showTime(String country, String city) {
        RequestQueue requestQueue;
        requestQueue = Volley.newRequestQueue(this);

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, "https://api.aladhan.com/v1/timingsByAddress?address="+city+"%2C"+country+"&method=8", null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    JSONObject data = response.getJSONObject("data");

                    JSONObject timings = data.getJSONObject("timings");
                    String Fajr = timings.getString("Fajr");
                    String Sunrise = timings.getString("Sunrise");
                    String Dhuhr = timings.getString("Dhuhr");
                    String Asr = timings.getString("Asr");
                    String Sunset = timings.getString("Sunset");
                    String Magrib = timings.getString("Maghrib");
                    String Isha = timings.getString("Isha");


                    JSONObject dateObj = data.getJSONObject("date");
                    JSONObject hijriObj = dateObj.getJSONObject("hijri");
                    JSONObject monthObj = hijriObj.getJSONObject("month");
                    String date = hijriObj.getString("date");
                    String month = monthObj.getString("en");

                    onIntent(date, month, Fajr, Dhuhr, Asr, Magrib, Isha, Sunrise, Sunset);


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            };
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("onErrorResponse: ", "Something went wrong");
            }
        });

        requestQueue.add(jsonObjectRequest);

    }

    public void onIntent(String date, String month, String Fajr, String Dhuhr, String Asr, String Magrib, String Isha, String Sunrise, String Sunset) {
        Intent myIntent = new Intent(this, show_namaz_time.class);
        myIntent.putExtra("Fajr", Fajr);
        myIntent.putExtra("Dhuhr", Dhuhr);
        myIntent.putExtra("Asr", Asr);
        myIntent.putExtra("Magrib", Magrib);
        myIntent.putExtra("Isha", Isha);
        myIntent.putExtra("Sunrise", Sunrise);
        myIntent.putExtra("Sunset", Sunset);
        myIntent.putExtra("date", date);
        myIntent.putExtra("month", month);
        startActivity(myIntent);
    }
}