package com.example.sdk.beyondthenetwork10;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Message extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void message_person(View view){
        Intent intent = new Intent(this, message_person.class);
        startActivity(intent);
    }

    public void message_nearby(View view){
        Intent intent = new Intent(this, message_nearby.class);
        startActivity(intent);
    }

}
