package com.mblprg.custompopup;

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
    EditText edtFirst,edtSecond;

    Button btnClick, btnCalculate;
    TextView txtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Button dialogbtn=findViewById(R.id.dialogbtn);
        dialogbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
            }
        });
    }
    public void showDialog(){
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Calculate addition");
        builder.setCancelable(true);
        LayoutInflater inflater=getLayoutInflater();
        View view=inflater.inflate(R.layout.activity_custom_layout,null);
        builder.setView(view);

        edtFirst =view.findViewById(R.id.edtFirst);
        edtSecond=view.findViewById(R.id.edtSecond);
        btnCalculate=view.findViewById(R.id.btnCalculate);
        txtResult=view.findViewById(R.id.txtResult);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int first=Integer.parseInt(edtFirst.getText().toString());
                int second=Integer.parseInt(edtSecond.getText().toString());
                int result=first+second;
                txtResult.setText(String.valueOf(result));
            }
        });
        AlertDialog alert=builder.create();
        alert.show();
        }
    }

