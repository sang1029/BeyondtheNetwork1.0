package com.example.sdk.beyondthenetwork10;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class message_person extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_person);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //TextView showmsg = (TextView)findViewById(R.id.message1);
        EditText editmsg = (EditText)findViewById(R.id.type_msg);
        //RelativeLayout ll_msg = (RelativeLayout)findViewById(R.id.ll_msgperson);
        LinearLayout ll_msg = (LinearLayout)findViewById(R.id.ll_msgperson);
        //Intent intent = new Intent(this, message_person.class);
        //startActivity(intent);
        Intent i = getIntent();
        Person p1 = (Person)i.getSerializableExtra("person");
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        //getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        //getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN)‌​;
        ///showmsg.append("\n");
        if (p1.message.size() > 0) {
            for (int x = 0; x < p1.message.size(); x++) {
                //showmsg.append(p1.message.get(x));
                //showmsg.append("\n");
                TextView tv = new TextView(this);
                //tv.setBackground(R);
                //tv.setBackgroundResource(R.drawable.);
                //tv.setWidth(100%);
                //tv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT, 1f));
                //tv.setBackgroundResource(R.drawable.message_person);
                LinearLayout.LayoutParams lparam = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
                //tv.setBackground(R.drawable.message_person);
                lparam.gravity=Gravity.RIGHT;
                lparam.setMargins(0,0,0,20);


                //tv.setBackgroundColor(getResources().getColor(R.color.white));
                //tv.setBackgroundColor(Color.parseColor("#04cee3"));
                tv.setTextColor(Color.parseColor("#000000"));
                tv.setPadding(20,20,20,20);
                tv.setTextSize(17);
                GradientDrawable gd = new GradientDrawable();

                gd.setShape(GradientDrawable.RECTANGLE);

                gd.setStroke(5,Color.parseColor("#04cee3"));
                gd.setColor(Color.parseColor("#04cee3"));

                gd.setCornerRadius(15.0f);

                tv.setBackground(gd);
                //tv.setGravity(Gravity.RIGHT);
                tv.setLayoutParams(lparam);
                //LinearLayout.TEXT_ALIGNMENT_GRAVITY=0;
                //RelativeLayout.LayoutParams lparam = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
                //lparam.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
                //lparam.addRule(RelativeLayout.ALIGN_PARENT_END);
                //lparam.addRule(RelativeLayout.TEXT)
                //tv.setLayoutParams(lparam);
                //tv.setGravity(Gravity.RIGHT);
                tv.setText(p1.message.get(x));
                ll_msg.addView(tv);
            }
        }
        //TextView tv = new TextView(this);
        //tv.setGravity(Gravity.RIGHT);
        //tv.setText("ASDFASDFASDFASDF".toString());
        //ll_msg.addView(tv);

        //editmsg.clearFocus();
        final ScrollView scrollview = ((ScrollView) findViewById(R.id.scrollview1));
        scrollview.post(new Runnable() {
            @Override
            public void run() {
                scrollview.fullScroll(ScrollView.FOCUS_DOWN);
            }
        });

    }

    public void send_msg(View view){
        //TextView showmsg = (TextView)findViewById(R.id.message1);
        EditText editmsg = (EditText)findViewById(R.id.type_msg);
        //RelativeLayout ll_msg = (RelativeLayout)findViewById(R.id.ll_msgperson);
        LinearLayout ll_msg = (LinearLayout)findViewById(R.id.ll_msgperson);
        //Intent intent = new Intent(this, message_person.class);
        //startActivity(intent);
        Intent i = getIntent();
        Person p1 = (Person)i.getSerializableExtra("person");
        //for (int ii=0; ii < 1; ii++){
        //    showmsg.append(p1.message.get(ii));
        //}
        TextView tv = new TextView(this);
        //tv.setGravity(Gravity.END);
        LinearLayout.LayoutParams lparam = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        //tv.setBackground(R.drawable.message_person);
        lparam.gravity=Gravity.RIGHT;
        lparam.setMargins(0, 0, 0, 20);


        //tv.setBackgroundColor(getResources().getColor(R.color.white));
        //tv.setBackgroundColor(Color.parseColor("#04cee3"));
        tv.setTextColor(Color.parseColor("#000000"));
        tv.setPadding(20, 20, 20, 20);
        //tv.setGravity(Gravity.RIGHT);
        tv.setLayoutParams(lparam);
        tv.setText(editmsg.getText().toString());
        tv.setTextSize(17);
        GradientDrawable gd = new GradientDrawable();

        gd.setShape(GradientDrawable.RECTANGLE);

        gd.setStroke(5, Color.parseColor("#04cee3"));
        gd.setColor(Color.parseColor("#04cee3"));

        gd.setCornerRadius(15.0f);

        tv.setBackground(gd);

        ll_msg.addView(tv);
        //showmsg.append();

        //showmsg.append(((Person) i.getSerializableExtra("person")).message.get(0));

        //FileOutputStream fileout = null;
        try {
            OutputStreamWriter osw = new OutputStreamWriter(this.openFileOutput("test.txt", Context.MODE_APPEND));
            ///fileout = openFileOutput("text.txt", MODE_PRIVATE);
            //OutputStreamWriter outputWriter = new OutputStreamWriter(fileout);
            osw.write(editmsg.getText().toString() + "\n");
            final ScrollView scrollview = ((ScrollView) findViewById(R.id.scrollview1));
            scrollview.post(new Runnable() {
                @Override
                public void run() {
                    scrollview.fullScroll(ScrollView.FOCUS_DOWN);
                }
            });
            osw.close();
        }catch (IOException e) {
            e.printStackTrace();
        }

        editmsg.setText("");
        //showmsg = (TextView)findViewById(R.id.message1);
        //p1.addmessage("AAAA");

    }
}
