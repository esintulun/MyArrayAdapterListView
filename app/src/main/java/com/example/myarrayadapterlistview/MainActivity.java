package com.example.myarrayadapterlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<MyItem> items = new ArrayList<>();
        items.add(new MyItem("esin", "aus Hamburg",  R.mipmap.ic_launcher, true));
        items.add(new MyItem("frank", "aus Berlin",  R.mipmap.ic_launcher_round, false));

        ListView listView = findViewById(R.id.lv_mylist);
        // Für die HEADER separeta View, um an die Listview nazuhängen
        View header = getLayoutInflater().inflate(R.layout.liestview_header, null);


        MyAdapter adapter = new MyAdapter(this, R.layout.listview_item, items);
        listView.addHeaderView(header);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

    }
}
