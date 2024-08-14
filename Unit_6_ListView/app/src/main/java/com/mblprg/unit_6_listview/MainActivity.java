package com.mblprg.unit_6_listview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView=findViewById(R.id.listview);
        String[] item ={"kathmandu","Pokhara","Lalitpur","Dharan","kathmandu","Pokhara","Lalitpur","Dharan",
                "kathmandu","Pokhara","Lalitpur","Dharan",
                "kathmandu","Pokhara","Lalitpur","Dharan"};

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,R.layout.listview_item,R.id.titleText,item);
        listView.setAdapter(arrayAdapter);

    }
}