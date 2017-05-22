package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RadioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
    }

    /**
     * Navigate to trending stations activity.
     * @param view
     */
    public void showTrendingStations(View view){
        Intent i = new Intent(this, TrendingRadioActivity.class);
        startActivity(i);
    }

    /**
     * Navigate to favorite stations activity.
     * @param view
     */
    public void showFavoriteStations(View view){
        Intent i = new Intent(this, FavoriteRadioActivity.class);
        startActivity(i);
    }

    /**
     * Navigate to local stations activity.
     * @param view
     */
    public void showLocalStations(View view){
        Intent i = new Intent(this, LocalRadioActivity.class);
        startActivity(i);
    }

    /**
     * Navigate to global stations activity.
     * @param view
     */
    public void showGlobalStations(View view){
        Intent i = new Intent(this, GlobalRadioActivity.class);
        startActivity(i);
    }
}
