package com.mblprg.context_menu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.pbtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            showDialog();
            }
        });
    }
    public void showDialog(){
    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
    builder.setTitle("Simple Intrest Calculator");
        builder.setCancelable(true);
        LayoutInflater inflater=getLayoutInflater();
        View view=inflater.inflate(R.layout.activity_popup_menu,null);
        builder.setView(view);

        EditText Pbtn=view.findViewById(R.id.Ptv);
        EditText Rbtn=view.findViewById(R.id.Rtv);
        EditText Tbtn=view.findViewById(R.id.Ttv);
        Button btn=view.findViewById(R.id.Cbtn);
        TextView txtresult=view.findViewById(R.id.ResultTv);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int p = Integer.parseInt(Pbtn.getText().toString());
                float r = Float.parseFloat(Rbtn.getText().toString());
                int t = Integer.parseInt(Tbtn.getText().toString());

                float si = (p * r * t) / 100;
                txtresult.setText(String.valueOf(si));
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

}