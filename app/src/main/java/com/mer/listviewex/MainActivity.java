package com.mer.listviewex;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create list
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 1; i <= 50; i++) {
            list.add("Item : " + i);
        }

        ListView listview = (ListView) findViewById(R.id.lvview);
        MyListAdapter adapter = new MyListAdapter(this, list);
        listview.setAdapter(adapter);
    }
}
