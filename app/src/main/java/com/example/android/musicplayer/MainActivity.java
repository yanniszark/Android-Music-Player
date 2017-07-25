package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import static android.R.attr.onClick;


public class MainActivity extends AppCompatActivity {

    FrameLayout music;
    FrameLayout radio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Setup onClickListener for music button */
        music = (FrameLayout) findViewById(R.id.music);
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MusicActivity.class);
                startActivity(i);
            }
        });

        /* Setup onClickListener for radio button */
        radio = (FrameLayout) findViewById(R.id.radio);
        radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, RadioActivity.class);
                startActivity(i);
            }
        });

        /* Setup onClickListener for payment button */
        radio = (FrameLayout) findViewById(R.id.payment);
        radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, PaymentActivity.class);
                startActivity(i);
            }
        });
    }
}


