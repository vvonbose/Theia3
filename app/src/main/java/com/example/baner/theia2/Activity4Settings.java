package com.example.baner.theia2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

public class Activity4Settings extends AppCompatActivity {

    TextView tvOutput;
    CheckBox cbVoiceOnly;
    CheckBox cbVoiceText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity4_settings);

        tvOutput = findViewById(R.id.tvOutput);
        cbVoiceOnly = findViewById(R.id.cbVoiceOnly);
        cbVoiceText = findViewById(R.id.cbVoiceText);


    }
}
