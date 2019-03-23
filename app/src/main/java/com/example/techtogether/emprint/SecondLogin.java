package com.example.techtogether.emprint;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SecondLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final ImageButton healthcareprovider = findViewById(R.id.provider);
        healthcareprovider.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(this, HealthCareProvider.class);
                startActivity(intent);
            }
        });

        final ImageButton patient = findViewById(R.id.patient);
        patient.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(this, Patient.class);
                startActivity(intent);
            }
        });

    }
}