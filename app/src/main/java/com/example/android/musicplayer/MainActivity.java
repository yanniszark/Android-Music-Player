package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Navigate to MusicActivity
     * @param view
     */
    public void selectMusic(View view){
        Intent i = new Intent(MainActivity.this, MusicActivity.class);
        startActivity(i);
    }

    /**
     * Navigate to RadioActivity
     * @param view
     */
    public void selectRadio(View view){
        Intent i = new Intent(MainActivity.this, RadioActivity.class);
        startActivity(i);
    }
}
