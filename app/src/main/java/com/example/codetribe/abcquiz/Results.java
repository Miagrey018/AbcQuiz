package com.example.codetribe.abcquiz;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.codetribe.abcquiz.R.id.Number;


public class Results extends AppCompatActivity {

    private int Score;
    MediaPlayer results;

    @Override
    protected void onPause() {
        super.onPause();
        results.release();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        results = MediaPlayer.create(this,R.raw.results);



        getSupportActionBar().setTitle("Results");
        Toast.makeText(this, "Results", Toast.LENGTH_SHORT).show();
        results.start();


        Intent intent = getIntent();
        int result = intent.getIntExtra("count", 0);


        String i = String.format("%d", result);

        TextView textView = (TextView) findViewById(Number);
        textView.setText(i + "/8");


    }

    public void Retake(View v) {
        Intent i = new Intent(Results.this, MainActivity.class);
        startActivity(i);

    }


}



