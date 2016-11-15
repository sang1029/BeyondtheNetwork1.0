package com.example.sdk.beyondthenetwork10;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class View_info extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_info);
    }
    public void view_news(View view){
        Intent intent = new Intent(this, view_news.class);
        startActivity(intent);
    }
}
