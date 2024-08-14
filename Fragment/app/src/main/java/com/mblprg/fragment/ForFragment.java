package com.mblprg.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class ForFragment extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_fragment);

        Button firstbtn=findViewById(R.id.btn1);
        Button secondbtn= findViewById(R.id.btn2);
        firstbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment1= new firstone();
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction= manager.beginTransaction();
                transaction.replace(R.id.fragment, fragment1);
                transaction.commit();
            }
        });
        secondbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment2 =new SecondOne();
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction= manager.beginTransaction();
                transaction.replace(R.id.fragment, fragment2);
                transaction.commit();
            }
        });
    }
}
