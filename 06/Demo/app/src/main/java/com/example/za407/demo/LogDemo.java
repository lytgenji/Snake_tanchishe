package com.example.za407.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class LogDemo extends AppCompatActivity {
    private static final String ACTIVITY_TAG = "LogDemo";
    private Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_demo);

        bt = (Button)findViewById(R.id.button);
        bt.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.v(LogDemo.ACTIVITY_TAG,"This is Verbose" );
                Log.d(LogDemo.ACTIVITY_TAG,"This is Debug" );
                Log.i(LogDemo.ACTIVITY_TAG,"This is Information" );
                Log.w(LogDemo.ACTIVITY_TAG,"This is Warnning" );
                Log.e(LogDemo.ACTIVITY_TAG,"This is Error" );
            }
        });
    }
}
