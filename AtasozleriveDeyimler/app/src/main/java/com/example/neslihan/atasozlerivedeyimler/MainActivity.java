package com.example.neslihan.atasozlerivedeyimler;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static MediaPlayer ply;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ply = MediaPlayer.create(MainActivity.this,R.raw.kids1);

    }

    public void appBegin(View view){
        BaslangicActivity.ply.stop();
        ply.start();
        Intent intent = new Intent(getApplicationContext(),FeedActivity.class);
        startActivity(intent);
        finish();


    }
    public void fikraBegin(View view){
        BaslangicActivity.ply.stop();
        Intent intent = new Intent(getApplicationContext(),FikraActivity.class);
        startActivity(intent);
        finish();
    }


    public void testEt(View view) {
        BaslangicActivity.ply.stop();
        Intent intent = new Intent(getApplicationContext(),TestActivity.class);
        startActivity(intent);
        finish();
    }
}
