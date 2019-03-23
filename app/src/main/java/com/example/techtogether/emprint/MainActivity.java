package com.example.techtogether.emprint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;
import android.app.KeyguardManager;
import android.content.pm.PackageManager;
import android.hardware.fingerprint.FingerprintManager;
import android.Manifest;
import android.os.Build;
import android.os.Bundle;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import android.security.keystore.KeyProperties;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.ActivityCompat;
import android.widget.TextView;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

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
                        openSignUp();
                    }
                });


            }




    public void openSecondLogin()
    {
        Intent intent = new Intent(this, SecondLogin.class);
        startActivity(intent);
    }

    public void openSignUp()
    {
        Intent intent2 = new Intent(this, SignUp.class);
        startActivity(intent2);
    }
}




