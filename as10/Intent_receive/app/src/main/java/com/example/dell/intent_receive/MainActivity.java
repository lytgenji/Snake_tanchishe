package com.example.dell.intent_receive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button myButton = null;
    private final String nobody = "Who.care.the.name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButton = (Button)findViewById(R.id.myButton);
        // 按钮对象设这监听对象
        myButton.setOnClickListener(new  MyButtonListener());
    }
    class MyButtonListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent =new Intent(nobody);
            intent.putExtra("textIntent","11111111");
            sendBroadcast(intent);
        }
    }
}
