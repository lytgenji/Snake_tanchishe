package com.example.dell.xmldesign03;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

/**
 * Created by dell on 2017/5/9.
 */

public class otherActivity extends AppCompatActivity {
    private Intent intent;
    private Bundle bunde;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.other);
        /* 取得Intent 中的Bundle 对象 */
        Bundle bunde = this.getIntent().getExtras();
        /* 取得Bundle 对象中的数据 */
        String ans = bunde.getString("ans");
        /* 判断所选答案*/
        String sexText = "";
        if (ans.equals("in")) {
            sexText = "正确";
        } else {
            sexText = "错误";
        }
        TextView tv1 = (TextView) findViewById(R.id.text1);
        tv1.setText("您选择的答案是：" + sexText);

		/* 以findViewById()取得Button 对象，并添加onClickListener */
        Button btn3_back = (Button) findViewById(R.id.button_back);
        btn3_back.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
            /* 返回result 回上一个activity */
                otherActivity.this.setResult(RESULT_OK, intent);
            /* 结束这个activity */
                otherActivity.this.finish();
            }
        });

        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("other Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();


        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
