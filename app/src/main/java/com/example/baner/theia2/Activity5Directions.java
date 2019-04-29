package com.example.baner.theia2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import java.util.Locale;

public class Activity5Directions extends AppCompatActivity {

    private int onDirection = 0;
    Button btnNext;
    TextToSpeech ttobj;
    String[] directions = {"Walk 30 steps forward",
                                "Turn left",
                                "Walk 50 steps forward",
                                "Your destination is on the right"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity5_directions);

        btnNext = findViewById(R.id.btnNext);
        ttobj=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    ttobj.setLanguage(Locale.US);
                }
            }
        });


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(onDirection < directions.length) {
                    ttobj.speak(directions[onDirection], TextToSpeech.QUEUE_FLUSH, null);
                    onDirection++;
                } else {
                    Intent intent = new Intent(Activity5Directions.this, com.example.baner.theia2.MainActivity.class);
                    startActivity(intent);
                }

            }
        });
    }
}
