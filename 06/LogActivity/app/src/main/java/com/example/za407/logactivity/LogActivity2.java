package com.example.za407.logactivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by za407 on 2017/3/30.
 */
public class LogActivity2 extends Activity {
    static final String LIFT_TAG="LogActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v(MainActivity.LIFT_TAG,"SecondActivity --->onCreate");
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onDestroy() {
        Log.v(MainActivity.LIFT_TAG,"SecondActivity --->onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Log.v(MainActivity.LIFT_TAG,"SecondActivity --->onPause");
        super.onPause();
    }

    @Override
    protected void onRestart() {
        Log.v(MainActivity.LIFT_TAG,"SecondActivity --->onRestart");
        super.onRestart();
    }

    @Override
    protected void onStart() {
        Log.v(MainActivity.LIFT_TAG,"SecondActivity --->onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.v(MainActivity.LIFT_TAG,"SecondActivity --->onResume");
        super.onResume();
    }

    @Override
    protected void onStop() {
        Log.v(MainActivity.LIFT_TAG,"SecondActivity --->onStop");
        super.onStop();
    }
}
