package com.example.introapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import static android.os.SystemClock.sleep;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen_layout);

        Thread splashThread=new Thread(new Runnable() {
            @Override
            public void run() {
                     sleep(2000);
                Intent myIntent=new Intent(getApplicationContext(),MainScreen.class);
                startActivity(myIntent);
                finish();
            }
        });
        splashThread.start();
    }
}
