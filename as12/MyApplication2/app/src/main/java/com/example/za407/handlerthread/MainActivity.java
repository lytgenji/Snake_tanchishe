package com.example.za407.handlerthread;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button starButton = null;
    private Button endButton =null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        starButton = (Button)findViewById(R.id.startButton);
        starButton.setOnClickListener(new StarButtonListener());
        endButton =(Button)findViewById(R.id.endButton);
        endButton.setOnClickListener(new EndButtonListener());
    }
    //1,创建一个handle对象
    Handler handler =new Handler();
    class StarButtonListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            handler.post(updateThread);
        }
    }
    class EndButtonListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            handler.removeCallbacks(updateThread);
        }
    }

    //将要执行的操作写在线程对象的run方法中
    Runnable updateThread =new Runnable() {
        @Override
        public void run() {
            System.out.println("UpdateThread");
            Log.v("tag","UpdateThread");
            handler.postDelayed(updateThread,2000);
        }
    };
}
