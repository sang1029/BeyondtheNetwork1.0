package com.example.sdk.beyondthenetwork10;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by SDK on 11/25/2016.
 */
public class Person implements Serializable {

    String name;
    List<String> message = new ArrayList<>();
    //List<String>();
    public Person(String name){
        this.name=name;
    }

    public void addmessage(String msg){
        //message.size();

        message.add(msg);
    }

}
