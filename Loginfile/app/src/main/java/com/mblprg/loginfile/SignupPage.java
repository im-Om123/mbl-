package com.mblprg.loginfile;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignupPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_page);

        EditText firstname = findViewById(R.id.fn);
        EditText email= findViewById(R.id.email);
        EditText password = findViewById(R.id.password);
        TextView gender = findViewById(R.id.gender);
        RadioButton Male = findViewById(R.id.radio_male);
        RadioButton Female = findViewById(R.id.radio_female);
        RadioButton others = findViewById(R.id.radio_others);
        Spinner state = findViewById(R.id.spinnerTv);
        CheckBox check= findViewById(R.id.check);
        Button submit= findViewById(R.id.subbtn);
        TextView result = findViewById(R.id.result);
        submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String nameT =firstname.getText().toString();
                String emailT = email.getText().toString();
                String gender = "";
                String passwordT=password.getText().toString();
                if(Male.isChecked())
                    gender="Male";
                else if (Female.isChecked())
                    gender="Female";
                else
                    gender="others";
                String st= state.getSelectedItem().toString();
                result.setText("First_name : "+nameT+"\n"+"Email"+emailT+"\n"+"Password : "+passwordT+"\n"+"Gender :"+gender+"\n"+"State : "+st+"\n");
            }
        });
    }
    }
