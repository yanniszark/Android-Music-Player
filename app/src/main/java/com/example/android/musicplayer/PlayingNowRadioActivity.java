package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlayingNowRadioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_now_radio);

        Button trendingRadioButton = (Button) findViewById(R.id.button_trending);
        trendingRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayingNowRadioActivity.this, TrendingRadioActivity.class);
                startActivity(intent);
            }
        });

        Button localRadioButton = (Button) findViewById(R.id.button_local);
        localRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayingNowRadioActivity.this, LocalRadioActivity.class);
                startActivity(intent);
            }
        });

        Button globalRadioButton = (Button) findViewById(R.id.button_global);
        globalRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayingNowRadioActivity.this, GlobalRadioActivity.class);
                startActivity(intent);
            }
        });
    }
}
