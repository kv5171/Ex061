package com.example.ex061;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton tb;
    Switch switchButton;
    LinearLayout activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tb = (ToggleButton) findViewById(R.id.tb);
        switchButton = (Switch) findViewById(R.id.switchButton);
        activity = (LinearLayout) findViewById(R.id.activity);
    }

    public void generateBackground(View view) {
        if (tb.isChecked() && switchButton.isChecked()){
            activity.setBackgroundColor(Color.parseColor("#FF33E6"));
        }
        else if (tb.isChecked() && !switchButton.isChecked()){
            activity.setBackgroundColor(Color.parseColor("#BB33FF"));
        }
        else if (!tb.isChecked() && !switchButton.isChecked()){
            activity.setBackgroundColor(Color.parseColor("#3399FF"));
        }
        else {
            activity.setBackgroundColor(Color.parseColor("#FF4233"));
        }
    }
}