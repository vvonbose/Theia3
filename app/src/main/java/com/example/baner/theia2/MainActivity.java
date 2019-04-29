package com.example.baner.theia2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.speech.RecognizerIntent;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button btnNAV;
    Button btnContact;
    Button btnSet;

    //checking update

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNAV = findViewById(R.id.btNAV);
        btnContact = findViewById(R.id.btnContact);
        btnSet = findViewById(R.id.btnSet);

        btnNAV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, com.example.baner.theia2.Activity2NavSet.class);
                startActivity(intent);
            }
        });

        btnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        displaySpeechRecognizer();

    }

    private static final int SPEECH_REQUEST_CODE = 0;

    // Create an intent that can start the Speech Recognizer activity
    private void displaySpeechRecognizer() {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
// Start the activity, the intent will be populated with the speech text
        startActivityForResult(intent, SPEECH_REQUEST_CODE);
    }

    // This callback is invoked when the Speech Recognizer returns.
// This is where you process the intent and extract the speech text from the intent.
    @Override
    protected void onActivityResult(int requestCode, int resultCode,
                                    Intent data) {
        if (requestCode == SPEECH_REQUEST_CODE && resultCode == RESULT_OK) {
            List<String> results = data.getStringArrayListExtra(
                    RecognizerIntent.EXTRA_RESULTS);
            String spokenText = results.get(0);
            if(spokenText.equalsIgnoreCase("navigate")) {
                Intent intent = new Intent(MainActivity.this, com.example.baner.theia2.Activity2NavSet.class);
                startActivity(intent);
            } else if(spokenText.equalsIgnoreCase("settings")) {

            } else if(spokenText.equalsIgnoreCase("contacts")) {

            } else {
                displaySpeechRecognizer();
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}
