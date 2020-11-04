package com.example.coffeshop;

import android.view.View;
import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.ListView;
import android.widget.AdapterView;

public class TopLevelActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
                if(position == 0){
                    Intent intent = new Intent(TopLevelActivity.this, DrinkCategoryActivity.class);
                    startActivity(intent);
                }
            }
        };
        ListView listView = findViewById(R.id.listview1);
        listView.setOnItemClickListener(itemClickListener);
    }
}
