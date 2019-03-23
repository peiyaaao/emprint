package com.example.techtogether.emprint;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class EmergencyContact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactinfo);

    }
    EditText emergencyname = (EditText) findViewById(R.id.name);
    EditText emergencyphone = (EditText) findViewById(R.id.mobile);
    EditText emergencyaddress = (EditText) findViewById(R.id.address);
    EditText emergencycity = (EditText) findViewById(R.id.city);
    EditText emergencystate = (EditText) findViewById(R.id.state);
    EditText emergencyzip = (EditText) findViewById(R.id.zip);
    EditText emergencycountry = (EditText) findViewById(R.id.country);
    EditText emergencyid = (EditText) findViewById(R.id.id);
    EditText emergencybirthday = (EditText) findViewById(R.id.birthday);
}
