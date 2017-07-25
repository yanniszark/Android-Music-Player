package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlayingNowMusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_now_music);

        Button albumsButton = (Button) findViewById(R.id.button_albums);
        albumsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayingNowMusicActivity.this, AlbumMusicActivity.class);
                startActivity(intent);
            }
        });

        Button artistsButton = (Button) findViewById(R.id.button_artists);
        artistsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayingNowMusicActivity.this, ArtistMusicActivity.class);
                startActivity(intent);
            }
        });

        Button songsButton = (Button) findViewById(R.id.button_songs);
        songsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayingNowMusicActivity.this, SongMusicActivity.class);
                startActivity(intent);
            }
        });
    }
}
