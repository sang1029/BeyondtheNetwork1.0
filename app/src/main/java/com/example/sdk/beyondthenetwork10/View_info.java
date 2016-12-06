package com.example.sdk.beyondthenetwork10;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class View_info extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_info);
        Intent i = getIntent();
        String line = (String)i.getSerializableExtra("searchquery");
        Button btn1 = (Button)findViewById(R.id.searchresult1);
        Button btn2 = (Button)findViewById(R.id.searchresult2);
        Button btn3 = (Button)findViewById(R.id.searchresult3);
        btn1.setText("this is search result for " + line);
        btn2.setText("This is news about " + line);
        btn3.setText("News: " + line + "!!");
    }
    public void view_news(View view){
        Intent intent = new Intent(this, view_news.class);
        startActivity(intent);
    }
}
