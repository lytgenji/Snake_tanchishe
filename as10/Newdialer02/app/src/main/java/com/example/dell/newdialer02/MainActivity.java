package com.example.dell.newdialer02;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText phoneNum = (EditText) findViewById(R.id.phoneNum);
        final Button button = (Button) findViewById(R.id.Button01);
        button.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View b) {
                String call = phoneNum.getText().toString();
                if (PhoneNumberUtils.isGlobalPhoneNumber(call)) {
                    Intent I = new Intent(Intent.ACTION_CALL, Uri.parse("tel://" + call));
                    try {
                        startActivity(I);
                    } catch (SecurityException e) {
                        e.printStackTrace();
                    }
                } else {
                    Toast.makeText(MainActivity.this,R.string.notify_phnum, Toast.LENGTH_LONG).show();
                                          }
                                      }
                                  }
        );
    }
}
