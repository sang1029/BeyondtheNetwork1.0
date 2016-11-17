package com.example.sdk.beyondthenetwork10;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Information extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void view_info(View view){
        Intent intent = new Intent(this, View_info.class);
        startActivity(intent);
    }

    public void view_news(View view){
        Intent intent = new Intent(this, view_news.class);
        startActivity(intent);
    }

}
