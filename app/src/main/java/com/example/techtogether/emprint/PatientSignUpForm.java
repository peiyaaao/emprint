package com.example.techtogether.emprint;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class PatientSignUpForm extends AppCompatActivity {
    private EditText fullName;
    private EditText mobile;
    private EditText address;
    private EditText city;
    private EditText state;
    private EditText zipCode;
    private EditText country;
    private EditText license1;
    private EditText license2;
    private EditText birthday;
    private DatabaseReference mDatabase;
    private Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_sign_up_form);
        mDatabase = FirebaseDatabase.getInstance().getReference();
        nextButton = findViewById(R.id.next_button);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                writeFormDetails();
            }
        });
    }

    private void writeFormDetails(){
        fullName = findViewById(R.id.form_name);
        mobile = findViewById(R.id.form_mobile);
        address = findViewById(R.id.form_address);
        city = findViewById(R.id.form_city);
        state = findViewById(R.id.form_state);
        zipCode = findViewById(R.id.form_zipcode);
        country = findViewById(R.id.form_country);
        license1 = findViewById(R.id.form_license);
        license2 = findViewById(R.id.form_license2);
        birthday = findViewById(R.id.form_birthday);

        mDatabase.child("users").child("1").child("fullName").setValue(fullName.getText().toString());
        mDatabase.child("users").child("1").child("mobile").setValue(mobile.getText().toString());
        mDatabase.child("users").child("1").child("address").setValue(address.getText().toString());
        mDatabase.child("users").child("1").child("city").setValue(city.getText().toString());
        mDatabase.child("users").child("1").child("state").setValue(state.getText().toString());
        mDatabase.child("users").child("1").child("zipCode").setValue(zipCode.getText().toString());
        mDatabase.child("users").child("1").child("country").setValue(country.getText().toString());
        mDatabase.child("users").child("1").child("license1").setValue(license1.getText().toString());
        mDatabase.child("users").child("1").child("license2").setValue(license2.getText().toString());
        mDatabase.child("users").child("1").child("birthday").setValue(birthday.getText().toString());
    }
 }
