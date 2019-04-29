package com.example.baner.theia2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Activity3Contacts extends AppCompatActivity {

    Button btnAddContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity3_contacts);

        btnAddContact = findViewById(R.id.btnAddContact);


    }
}
