package com.example.codetribe.abcquiz;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
public String Questions;

    //Audio sound when you click the buttons

    MediaPlayer MainActivity;


    @Override
    protected void onPause() {
        super.onPause();
        MainActivity.release();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainActivity =MediaPlayer.create(this,R.raw.dancing);
        MainActivity.start();
        getSupportActionBar().setTitle("Brain Picker");

    }
        @Override
        public boolean onOptionsItemSelected(MenuItem item){
            int id = item.getItemId();

            if (id==android.R.id.home){

                //ends the activity
                this.finish();
            }

            return super.onOptionsItemSelected(item);
        }

    public void education(View v){
        Questions ="education";
        Intent intent = new Intent(MainActivity.this,QustionActivity.class);
        intent.putExtra("question",Questions);
        startActivity(intent);
        Toast.makeText(this,"Education",Toast.LENGTH_SHORT).show();
    }
    public void technology(View v){
        Questions="technology";
        Intent intent = new Intent(MainActivity.this,QustionActivity.class);
        intent.putExtra("question",Questions);
        startActivity(intent);
        Toast.makeText(this,"Technology",Toast.LENGTH_SHORT).show();
    }
    public void politics(View v){
        Questions="politics";
        Intent intent = new Intent(MainActivity.this,QustionActivity.class);
        intent.putExtra("question",Questions);
        startActivity(intent);
        Toast.makeText(this,"Politics",Toast.LENGTH_SHORT).show();
    }



    }




