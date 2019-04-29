package com.example.baner.theia2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Activity2NavSet extends AppCompatActivity {

    EditText etDestination;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2_nav_set);

        etDestination = findViewById(R.id.etDestination);


    }
}
