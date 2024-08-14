package com.mblprg.navigating;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login = findViewById(R.id.loginBtn);
        EditText email = findViewById(R.id.emailEt);
        EditText pass = findViewById(R.id.passwordEt);


        login.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, Dashboard.class);
            String emailEt = email.getText().toString();
            String passwordEt = pass.getText().toString();

            i.putExtra("email", emailEt);
            i.putExtra("password",passwordEt);
            startActivityForResult(i, 4);
        });

    }


    @Override
    protected  void onActivityResult(int requestCode, int resultCode, @Nullable Intent data){
        super.onActivityResult(requestCode,resultCode, data);
        if(requestCode==4){
            String dataExtract = data.getStringExtra("data");
            TextView loginTv = findViewById(R.id.loginTv);
            loginTv.setText(dataExtract);
        }
    }
}