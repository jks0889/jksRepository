package kr.jks.test;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.melnykov.fab.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv = (ListView) findViewById(android.R.id.list);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.attachToListView(lv);

        ArrayList<MyItem> arItems  = new ArrayList<>();
        MyItem item;
        item = new MyItem(R.drawable.fab_bg_mini,"1번");
        arItems.add(item);
        item = new MyItem(R.drawable.fab_shadow,"1번");
        arItems.add(item);
        item = new MyItem(R.drawable.fab_bg_normal,"1번");
        arItems.add(item);

        MyListAdapter mAdapter = new MyListAdapter(this,arItems,R.layout.icontext);
        lv.setAdapter(mAdapter);


    }

}
