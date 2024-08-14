package com.mblprg.recycler_view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

import Model.MyData;

public class RecyclerViewActivity extends AppCompatActivity {
    private  RecyclerView.Adapter adapter;
     RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        recyclerView =findViewById(R.id.recyclerView);

        ArrayList<MyData> data=new ArrayList<>();
        data.add(new MyData("kathmandu","this is kathmandu",R.drawable.ic_launcher_background));
        data.add(new MyData("Pokhara","this is pokhara",R.drawable.ic_launcher_background));
        data.add(new MyData("Dhangadhi","this is dhangadhi",R.drawable.ic_launcher_background));
        data.add(new MyData("Baglung","this is baglung",R.drawable.ic_launcher_background));
        data.add(new MyData("Parbat","this is parbat",R.drawable.ic_launcher_background));
        data.add(new MyData("Lalitpur","this is lalitput",R.drawable.ic_launcher_background));

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new RecyclerViewAdapter(this,data);
        recyclerView.setAdapter(adapter);

    }
}