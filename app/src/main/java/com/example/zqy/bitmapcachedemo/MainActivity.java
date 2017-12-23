package com.example.zqy.bitmapcachedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    private GridView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = findViewById(R.id.grid_view);
        ImageAdapter adapter = new ImageAdapter(this);
        view.setAdapter(adapter);
    }
}
