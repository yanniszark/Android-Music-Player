package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class RadioActivity extends AppCompatActivity {

    FrameLayout trendingRadio;
    FrameLayout localRadio;
    FrameLayout globalRadio;
    FrameLayout favoritesRadio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);

        /* Setup Trending Button */
        trendingRadio = (FrameLayout) findViewById(R.id.trending);
        trendingRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RadioActivity.this, TrendingRadioActivity.class);
                startActivity(i);
            }
        });

        /* Setup Global Button */
        globalRadio = (FrameLayout) findViewById(R.id.global);
        globalRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RadioActivity.this, GlobalRadioActivity.class);
                startActivity(i);
            }
        });

        /* Setup Local Button */
        localRadio = (FrameLayout) findViewById(R.id.local);
        localRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RadioActivity.this, LocalRadioActivity.class);
                startActivity(i);
            }
        });

        /* Setup Favorites Button */
        favoritesRadio = (FrameLayout) findViewById(R.id.favorites);
        favoritesRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RadioActivity.this, PlayingNowRadioActivity.class);
                startActivity(i);
            }
        });

    }

}
