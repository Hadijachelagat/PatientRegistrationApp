package com.example.patientregistrationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView Email, password,UserName;
private EditText mEmail,mPassword,mUserName;
private Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton =(Button)findViewById(R.id.bt_buttonCreateAccount_id);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCreat =new Intent(getApplicationContext(),LogInActivity.class);
                startActivity(intentCreat);
            }
        });


    }





}
