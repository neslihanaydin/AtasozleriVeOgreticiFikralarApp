package com.example.neslihan.atasozlerivedeyimler;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    ImageView imageView;
    Button button;
    static int sayac = -1;
    MediaPlayer plyetek;
    MediaPlayer plydere;
    int indexyerel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imageView = (ImageView)(findViewById(R.id.imageView));
        button = findViewById(R.id.button);
        imageView.setImageResource(R.drawable.genelback);
        Intent intent = getIntent();
        indexyerel = intent.getIntExtra("index",-1);
        goster(indexyerel);
    }
    void gerile(View view){
        sayac = sayac - 1;
        ilerigerigoster(sayac);
    }
    void ilerle(View view){
        sayac = sayac+1;
        ilerigerigoster(sayac);
    }
    void ilerigerigoster(int sayac){
        if(sayac < 0){
            Main2Activity.sayac = 0;
            Toast.makeText(getApplicationContext(),"Bu ilk atasözüdür",Toast.LENGTH_SHORT).show();
        }
        if(sayac == 0){
            imageView.setImageResource(R.drawable.d1);
        }

        if(sayac == 1){
            imageView.setImageResource(R.drawable.d2);
        }
        if(sayac == 2) {
            imageView.setImageResource(R.drawable.d3);
        }
        if(sayac == 3) imageView.setImageResource(R.drawable.d4);
        if(sayac == 4) imageView.setImageResource(R.drawable.d5);
        if(sayac == 5) imageView.setImageResource(R.drawable.d6);
        if(sayac == 6) imageView.setImageResource(R.drawable.d7);
        if(sayac == 7) imageView.setImageResource(R.drawable.d8);
        if(sayac == 8) imageView.setImageResource(R.drawable.d9);
        if(sayac == 9) imageView.setImageResource(R.drawable.d10);
        if(sayac == 10) imageView.setImageResource(R.drawable.d11);
        if(sayac == 11) imageView.setImageResource(R.drawable.d12);
        if(sayac == 12) imageView.setImageResource(R.drawable.d13);
        if(sayac == 13) imageView.setImageResource(R.drawable.d14);
        if(sayac == 14) imageView.setImageResource(R.drawable.d15);
        if(sayac == 15) imageView.setImageResource(R.drawable.d16);

        if(sayac > 15) {
            Main2Activity.sayac = 15;
            Toast.makeText(getApplicationContext(),"Son atasözüne geldin. Şimdi test zamanı !",Toast.LENGTH_LONG).show();

        }
    }

    void listeyeDon(View view){

        Intent intent = new Intent(getApplicationContext(),FeedActivity.class);
        startActivity(intent);
        finish();
    }
    void goster(int index){
        if(index == 0){
            sayac = 0;
            imageView.setImageResource(R.drawable.d1);
         //   plyetek = MediaPlayer.create(Main2Activity.this,R.raw.etek);
         //   plyetek.start();
        }
        else if(index == 1){
            sayac = 1;
            imageView.setImageResource(R.drawable.d2);
         //   plydere = MediaPlayer.create(Main2Activity.this,R.raw.dere);
         //   plydere.start();
        }
        else if(index == 2){
            sayac = 2;
            imageView.setImageResource(R.drawable.d3);
        }
        else if(index == 3){
            sayac = 3;
            imageView.setImageResource(R.drawable.d4);
        }
        else if (index == 4){
            sayac = 4;
            imageView.setImageResource(R.drawable.d5);
        }
        else if (index == 5){
            sayac = 5;
            imageView.setImageResource(R.drawable.d6);
        }
        else if (index == 6){
            sayac = 6;
            imageView.setImageResource(R.drawable.d7);
        }
        else if (index == 7){
            sayac = 7;
            imageView.setImageResource(R.drawable.d8);
        }
        else if (index == 8){
            sayac = 8;
            imageView.setImageResource(R.drawable.d9);
        }
        else if (index == 9){
            sayac = 9;
            imageView.setImageResource(R.drawable.d10);
        }
        else if (index == 10){
            sayac = 10;
            imageView.setImageResource(R.drawable.d11);
        }
        else if (index == 11){
            sayac = 11;
            imageView.setImageResource(R.drawable.d12);
        }
        else if (index == 12){
            sayac = 12;
            imageView.setImageResource(R.drawable.d13);
        }
        else if (index == 13){
            sayac = 13;
            imageView.setImageResource(R.drawable.d14);
        }
        else if (index == 14){
            sayac = 14;
            imageView.setImageResource(R.drawable.d15);
        }
        else if (index == 15){
            sayac = 15;
            imageView.setImageResource(R.drawable.d16);
        }


        else if( index == -1){
            sayac = -1;
            imageView.setImageResource(R.drawable.internetyok);
        }
    }
}
