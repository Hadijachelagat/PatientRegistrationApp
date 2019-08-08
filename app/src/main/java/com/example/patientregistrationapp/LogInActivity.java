package com.example.patientregistrationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LogInActivity extends AppCompatActivity {
    private EditText EnterName;
    private EditText EnterPassword;
    private Button logInButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

       EnterName =(EditText)findViewById(R.id.et_logInUserName_id) ;
       EnterPassword=(EditText)findViewById(R.id.et_loginPassword_id);

       logInButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intentLogIn = new Intent(getApplicationContext(),DetailsActivity.class);
               startActivity(intentLogIn);
           }
       });
    }

}
