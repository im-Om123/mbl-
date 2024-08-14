package com.mblprg.unit_6_listview;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class custom_list_layout extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView=findViewById(R.id.listview);
        String[] title ={"kathmandu","Pokhara","Lalitpur","Dharan","kathmandu","Pokhara","Lalitpur","Dharan",
                "kathmandu","Pokhara","Lalitpur","Dharan",
                "kathmandu","Pokhara","Lalitpur","Dharan"};

        String[] desc={"kathmandu discription","Pokhara discription","Lalitpur discription","Dharan discription",
                "kathmandu discription","Pokhara discription","Lalitpur discription","Dharan discription"};
        int image[]={R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background
        };
        MyListAdapter adapter=new MyListAdapter(this,title,desc,image);
        listView.setAdapter(adapter);
    }
}
