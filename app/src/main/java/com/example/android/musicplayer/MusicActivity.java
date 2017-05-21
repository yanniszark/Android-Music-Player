package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
    }

    /**
     * Show music arranged by album
     * @param view
     */
    public void showByAlbum(View view){
        Intent i = new Intent(this, AlbumMusicActivity.class);
        startActivity(i);
    }

    /**
     * Show music arranged by artist
     * @param view
     */
    public void showByArtist(View view){
        Intent i = new Intent(this, ArtistMusicActivity.class);
        startActivity(i);
    }

    /**
     * Show music arranged by song
     * @param view
     */
    public void showBySong(View view){
        Intent i = new Intent(this, SongMusicActivity.class);
        startActivity(i);
    }

    /**
     * Begin shuffle play
     * @param view
     */
    public void beginShufflePlay(View view){
        Intent i = new Intent(this, ShufflePlayActivity.class);
        startActivity(i);
    }
}
