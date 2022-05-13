package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView mymedia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mymedia = (VideoView)findViewById(R.id.videoView);
        Uri myVideoUri= Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.videopad);
        mymedia.setVideoURI(myVideoUri);
        MediaController mediaController = new MediaController(this);
        mymedia.setMediaController(mediaController);
        mediaController.setMediaPlayer(mymedia);
    }
    public void pauseclick(View view) {
        mymedia.pause();

    }

    public void playclick(View view) {
        mymedia.start();
    }

    public void stopclick(View view) {
        mymedia.stopPlayback();
        mymedia.resume();
    }
}