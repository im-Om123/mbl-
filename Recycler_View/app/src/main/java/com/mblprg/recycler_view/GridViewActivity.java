package com.mblprg.recycler_view;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class GridViewActivity extends AppCompatActivity {
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        gridView = findViewById(R.id.gridView);

        String[] title = {"Kathmandu", "Pokhara", "Lalitpur", "Dharan", "Kathmandu", "Pokhara", "Lalitpur", "Dharan",
                "Kathmandu", "Pokhara", "Lalitpur", "Dharan", "Kathmandu", "Pokhara", "Lalitpur", "Dharan"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,title);
        gridView.setAdapter(adapter);
    }
}
