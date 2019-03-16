package com.example.neslihan.atasozlerivedeyimler;

import android.content.Intent;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SonucActivity extends AppCompatActivity {

    ImageView imageView;
    int dogruSayisi;
    int yanlisSayisi;
    TextView textViewDogru;
    TextView textViewYanlis;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonuc);
        imageView = findViewById(R.id.imageView5);
        textViewYanlis = findViewById(R.id.textView);
        textViewDogru = findViewById(R.id.textView2);
        button = findViewById(R.id.button7);
        Intent intent = getIntent();
        dogruSayisi = intent.getIntExtra("dogru",0);
        yanlisSayisi = intent.getIntExtra("yanlis",0);
        textViewYanlis.setText("Yanlış Sayısı : "+yanlisSayisi);
        textViewDogru.setText("Doğru Sayısı : "+dogruSayisi);
        timer();

}
    void anaMenuDon(View view){

        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
        finish();
    }
    void timer(){

        new CountDownTimer(3200,800){
            @Override
            public void onTick(long l) {
                timer2();
            }

            @Override
            public void onFinish() {


            }
        }.start();
    }
    void timer2(){
        new CountDownTimer(400,200){

            @Override
            public void onTick(long l) {
                imageView.setVisibility(View.VISIBLE);
            }

            @Override
            public void onFinish() {
                imageView.setVisibility(View.INVISIBLE);

            }
        }.start();
    }
}
