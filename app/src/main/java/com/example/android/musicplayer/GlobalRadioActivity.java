package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GlobalRadioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_global_radio);

        Button playingNowButton = (Button) findViewById(R.id.button_playing_now);
        playingNowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(GlobalRadioActivity.this, PlayingNowRadioActivity.class);
                startActivity(i);
            }
        });
    }
}
