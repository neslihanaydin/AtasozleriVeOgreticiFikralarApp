package com.example.neslihan.atasozlerivedeyimler;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.VideoView;

public class BaslangicActivity extends AppCompatActivity {

    VideoView videoView;
    public static MediaPlayer ply;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baslangic2);

        ply = MediaPlayer.create(BaslangicActivity.this,R.raw.march);
        ply.start();
        videoView = findViewById(R.id.videoView);
        Uri yol = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.jenerik);
        videoView.setVideoURI(yol);
        videoView.start();
        timer();

    }
    void timer(){
        new CountDownTimer(5000,1000){
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                ply.seekTo(7000);
                videoView.stopPlayback();
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();

            }
        }.start();
    }
}
