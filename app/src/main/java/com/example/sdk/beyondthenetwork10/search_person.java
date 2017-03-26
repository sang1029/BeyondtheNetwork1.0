package com.example.sdk.beyondthenetwork10;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class search_person extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_person);
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
}
