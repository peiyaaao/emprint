package com.example.techtogether.emprint;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openSecondLogin();
            }
        });



        final Button signUpButton = findViewById(R.id.signUpButton);
        signUpButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openParaLogin();
            }
        });




    }
    public void openSecondLogin()
    {
        Intent intent = new Intent(this, SecondLogin.class);
        startActivity(intent);
    }

    public void openParaLogin()
    {
        Intent intent2 = new Intent(this, ParaLogin.class);
        startActivity(intent2);
    }
}
