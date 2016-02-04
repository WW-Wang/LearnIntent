package com.example.zh_wang.learnintent;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by zh_wang on 16/1/7.
 */
public class MyAty extends Activity {

    public static final String ACTION = "com.example.zh_wang.learnintent.intent.action.myaty";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myaty);
    }
}
