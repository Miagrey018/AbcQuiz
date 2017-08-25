package com.example.codetribe.abcquiz;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by codetribe on 6/22/2017.
 */

public class SplashActivity extends AppCompatActivity{
    private static int SPLASH_TIME_OUT = 700000;
    MediaPlayer SplashActivity;

    @Override
    protected void onPause() {
        super.onPause();
        SplashActivity.release();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        SplashActivity =MediaPlayer.create(this,R.raw.hello);
        SplashActivity.start();


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(homeIntent);
                finish();
            }


        }, SPLASH_TIME_OUT);

    }


    public void btnClickMe(View view){
        Intent intent = new Intent(SplashActivity.this,MainActivity.class);
        startActivity(intent);

    }





}


