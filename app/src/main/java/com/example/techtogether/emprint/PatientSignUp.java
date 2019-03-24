package com.example.techtogether.emprint;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PatientSignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_sign_up);

        this.setupButton();



    }

    void setupButton() {
        final Button button = findViewById(R.id.manualformbutton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openForm();
            }
        });
    }

    void openForm() {
        Intent intent = new Intent(this, PatientSignUpForm.class);
        startActivity(intent);
    }
}
