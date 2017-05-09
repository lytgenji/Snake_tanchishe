package com.example.dell.lisview;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.AdapterView.OnItemSelectedListener;

public class MainActivity extends ListActivity {

    String[] weekString = new String[]{"星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,weekString);
        this.setListAdapter(adapter);
        this.getListView().setOnItemSelectedListener(
                new OnItemSelectedListener(){
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        MainActivity.this.setTitle(((TextView)view).getText());
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                        MainActivity.this.setTitle("NothingSelected");
                    }
                }
        );
    }


}
