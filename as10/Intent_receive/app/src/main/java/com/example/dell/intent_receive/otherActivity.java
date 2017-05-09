package com.example.dell.intent_receive;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by dell on 2017/4/27.
 */

public class otherActivity extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String value = intent.getStringExtra("textIntent");
        Log.e("IntentReceiver-->Text",value);
    }
}
