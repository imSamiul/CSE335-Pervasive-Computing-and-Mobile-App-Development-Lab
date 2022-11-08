package com.example.multitracker;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    Button getStarted;
    LinearLayout mainInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getStarted = findViewById(R.id.tap_to_playID);
        mainInterface = findViewById(R.id.mainUI);
        mainInterface.setBackgroundResource(R.drawable.background_img);
        Window window = MainActivity.this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(ContextCompat.getColor(MainActivity.this,R.color.black));
    }

    public void tap_to_play(View view) {
        Intent chooseActivity = new Intent(this, Choose.class);
        startActivity(chooseActivity);
    }
}