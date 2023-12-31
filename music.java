package com.example.myapplication10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class music extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
    }
    public void onButton5(View view) {
        int selectedSoundResourceId = R.raw.alarm1;
        SharedPreferences sharedPreferences = getSharedPreferences("AlarmSound", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("selectedSoundResourceId", selectedSoundResourceId);
        editor.apply();
    }
    public void onButton6(View view) {
        int selectedSoundResourceId = R.raw.alarm2;
        SharedPreferences sharedPreferences = getSharedPreferences("AlarmSound", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("selectedSoundResourceId", selectedSoundResourceId);
        editor.apply();
    }

    public void onButton8(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.alarm1);
        mediaPlayer.start(); // no need to call prepare(); create() does that for you
    }

    public void onButton10(View v){
        super.onDestroy();
        Log.v("MediaPlayer", "onButton11");
        MediaPlayer player = null;
        if (player.isPlaying()) {
            player.stop();
        }
        player.release();
    }

    public void onButton9(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.alarm2);
        mediaPlayer.start(); // no need to call prepare(); create() does that for you

    }
    public void onButton11(View v){
        super.onDestroy();
        Log.v("MediaPlayer", "onButton11");
        MediaPlayer player = null;
        if (player.isPlaying()) {
            player.stop();
        }
        player.release();
    }

    public void onButton7(View view) {
        Intent intent = new Intent(this,settei.class);
        startActivity(intent);
        mediaPlayer.release();
        mediaPlayer = null;
    }
}
