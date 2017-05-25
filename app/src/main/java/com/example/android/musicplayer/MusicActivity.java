package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MusicActivity extends AppCompatActivity {

    FrameLayout albums;
    FrameLayout artists;
    FrameLayout songs;
    FrameLayout playingNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        /* Setup Albums button */
        albums = (FrameLayout) findViewById(R.id.albums);
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MusicActivity.this, AlbumMusicActivity.class);
                startActivity(i);
            }
        });

        /* Setup Artists button */
        artists = (FrameLayout) findViewById(R.id.artists);
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MusicActivity.this, ArtistMusicActivity.class);
                startActivity(i);
            }
        });

        /* Setup Songs button */
        songs = (FrameLayout) findViewById(R.id.songs);
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MusicActivity.this, SongMusicActivity.class);
                startActivity(i);
            }
        });

        /* Setup PlayingNow button */
        playingNow = (FrameLayout) findViewById(R.id.playing_now);
        playingNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MusicActivity.this, PlayingNowMusicActivity.class);
                startActivity(i);
            }
        });
    }


}