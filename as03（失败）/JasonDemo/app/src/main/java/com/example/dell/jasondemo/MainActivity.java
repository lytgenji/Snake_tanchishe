package com.example.dell.jasondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private DateBean myData;
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tw);
        //初始化数据
        initData();

    }

    private void initData() {praseJson();}
    private void praseJson() {
        String json = getResources().getString(R.string.myjson);
        Gson gson = new Gson();
        myData = gson.fromJson(json , DateBean.class);
        Log.i("zhouweizhi",":" + myData.toString());
        tv.setText("Course_address=" + myData.getCourse_address() + ";"+ "Course_name=" + myData.getCourse_name());
    }
}
