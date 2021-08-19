package com.minabeshara.example;

import android.content.Context;
import android.widget.Toast;

public class MyToast {

    public String echo(String value) {
        return value;
    }

    public void showToast(Context context){
        Toast.makeText(context,"Android",Toast.LENGTH_LONG).show();
    } 
}
