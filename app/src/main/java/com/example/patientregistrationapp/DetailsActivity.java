package com.example.patientregistrationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DetailsActivity extends AppCompatActivity {
    private EditText HospitalName;
    private EditText HospitalAdress;
    private EditText Location;
    private Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Submit=(Button)findViewById(R.id.bt_Submit_id);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),profileActivity.class);
                startActivity(intent);
            }
        });







    }
}
