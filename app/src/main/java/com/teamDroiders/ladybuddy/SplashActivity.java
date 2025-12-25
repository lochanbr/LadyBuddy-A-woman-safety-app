package com.teamDroiders.ladybuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_splash);

        // Wait for 2 seconds then start MainActivity
        new Handler().postDelayed(() -> {
            startActivity (new Intent (SplashActivity.this,MainActivity.class));
            finish ();
        }, 2000);
    }
}