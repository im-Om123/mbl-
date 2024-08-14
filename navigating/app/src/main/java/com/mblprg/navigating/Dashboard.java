package com.mblprg.navigating;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Button lbtn = findViewById(R.id.navigateBtn);
        TextView emlview = findViewById(R.id.emailTv);
        TextView passview = findViewById(R.id.passwordTv);

        emlview.setText(getIntent().getStringExtra("email"));
        passview.setText(getIntent().getStringExtra("pass"));

        lbtn.setOnClickListener(new View.OnClickListener() {
            String data = "Navigate Back";
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.putExtra("data",data);
                setResult(4,i);
                finish();
            }
        });
    }
}