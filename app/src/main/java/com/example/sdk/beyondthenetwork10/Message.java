package com.example.sdk.beyondthenetwork10;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

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
        Person p = new Person("a");
        try {
            //InputStream is = getAssets().open("test1.txt");

            //BufferedReader reader = new BufferedReader(new InputStreamReader(is));

            //String fis = this.getFilesDir() + "/test.txt";
            InputStream inputstr = this.openFileInput("test.txt");
            if (inputstr != null) {
                InputStreamReader isreader = new InputStreamReader(inputstr);
                BufferedReader br = new BufferedReader(isreader);


                String line;

                while ((line = br.readLine()) != null) {
                    p.addmessage(line);
                }
            }
            //is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*AssetManager am = Asset
        try {
            InputStream is = getAssets().open("test1.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line;

            while ((line = reader.readLine()) != null){
                p.addmessage(line);
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }*/

        //Context.getResources().getAssets().open("QuotesMonkeyBusiness.txt")
        ///File file  = new File("src/main/assets/test1.txt");
        /*File file = new File(("test1.txt"));
        //File file = new File("C:/Users/SDK/AndroidStudioProjects/BeyondtheNetwork1.0/app/src/main/assets/test1.txt");
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(file));
            String text = null;

            while ((text = reader.readLine()) != null) {
                p.addmessage(text);
                //list.add(Integer.parseInt(text));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        intent.putExtra("person", p);
        startActivity(intent);
    }

    public void message_nearby(View view){
        Intent intent = new Intent(this, message_nearby.class);
        startActivity(intent);
    }

}
