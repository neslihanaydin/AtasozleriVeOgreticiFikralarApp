package com.example.neslihan.atasozlerivedeyimler;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    Button secenekA;
    Button secenekB;
    Button secenekC;
    int soruno = 0;
    int dogruSayisi = 0;
    int yanlisSayisi = 0;
    final List<TestAtasozu> testAtasozuList = new ArrayList<TestAtasozu>();
    public MediaPlayer ply ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        imageView = findViewById(R.id.imageView2);
        textView = findViewById(R.id.TextView);
        secenekA = findViewById(R.id.secenekA);
        secenekB = findViewById(R.id.secenekB);
        secenekC = findViewById(R.id.secenekC);
        ply = MediaPlayer.create(TestActivity.this,R.raw.march);
        ply.start();

        testAtasozuList.add(new TestAtasozu("Dereyi görmeden paçaları sıvamak",R.drawable.atasozu2,1,"Bir şeye çok sevinmek","Birine aşık olmak","Ortada bir şey yokken hazırlanmaya kalkışmak","Ortada bir şey yokken hazırlanmaya kalkışmak"));
        testAtasozuList.add(new TestAtasozu("Damlaya damlaya göl olur",R.drawable.atasozu4,3,"Birine gönlünü kaptırmak","Küçük şeyler birikerek büyük şeyleri oluşturur","Komşular evden daha önemlidir","Küçük şeyler birikerek büyük şeyleri oluşturur"));
        testAtasozuList.add(new TestAtasozu("Abayı yakmak",R.drawable.atasozu3,2,"Bir şeye çok sevinmek","Birine aşık olmak","Ortada bir şey yokken hazırlanmaya kalkışmak","Birine aşık olmak"));
        testAtasozuList.add(new TestAtasozu("Etekleri zil çalmak",R.drawable.atasozu1,0,"Bir şeye çok sevinmek","Küçük şeyler birikerek büyük şeyleri oluşturur","Komşular evden daha önemlidir","Bir şeye çok sevinmek"));
        testAtasozuList.add(new TestAtasozu("Ev alma, komşu al",R.drawable.atasozu5,4,"Bir şeye çok sevinmek","Küçük şeyler birikerek büyük şeyleri oluşturur","Komşular evden daha önemlidir","Komşular evden daha önemlidir"));
        testAtasozuList.add(new TestAtasozu("Yerin kulağı vardır",R.drawable.atasozu13,12,"Gizli konuşulan bir konuyu herkes duyabilir","Bir şeye çok sevinmek","Çalışan kimse daha yararlı işler yapar","Gizli konuşulan bir konuyu herkes duyabilir"));
        testAtasozuList.add(new TestAtasozu("Güneş girmeyen eve doktor girer",R.drawable.atasozu15,14,"Küçük şeyler birikerek büyük şeyleri oluşturur","Ortada bir şey yokken hazırlanmaya kalkışmak","Ev güneş almalıdır","Ev güneş almalıdır"));
        soruSor(soruno);

    }
    public void soruSor(int i){
        if(i>=testAtasozuList.size())
        {
            ply.stop();
            Intent intent = new Intent(getApplicationContext(),SonucActivity.class);
            intent.putExtra("dogru",dogruSayisi);
            intent.putExtra("yanlis",yanlisSayisi);
            startActivity(intent);
            finish();

        }
        else if(i<testAtasozuList.size()){
            butonAc();
            imageView.setImageResource(testAtasozuList.get(i).getAtasozuimage());
            textView.setText(testAtasozuList.get(i).getAtasozuMetni());
            secenekA.setText(testAtasozuList.get(i).getSecenekBir());
            secenekB.setText(testAtasozuList.get(i).getSecenekIki());
            secenekC.setText(testAtasozuList.get(i).getSecenekUc());
        }
    }
    public void butonKilitle(){
        secenekA.setClickable(false);
        secenekB.setClickable(false);
        secenekC.setClickable(false);
    }
    public void butonAc(){
        secenekA.setClickable(true);
        secenekB.setClickable(true);
        secenekC.setClickable(true);
    }
    public void onClickA(View view){
        if(secenekA.getText() == testAtasozuList.get(soruno).getDogruSecenek()){
            dogruSayisi++;butonKilitle();
        }
        else if(secenekA.getText() != testAtasozuList.get(soruno).getDogruSecenek()){
            yanlisSayisi++;butonKilitle();
        }
        if(secenekA.getText() == testAtasozuList.get(soruno).getDogruSecenek()){
            timer(secenekA,1);
        }
        else
            timer(secenekA,0);


    }
    public void onClickB(View view){
        if(secenekB.getText() == testAtasozuList.get(soruno).getDogruSecenek()){
            dogruSayisi++;butonKilitle();
        }
        else if(secenekB.getText() != testAtasozuList.get(soruno).getDogruSecenek()){
            yanlisSayisi++;butonKilitle();
        }
        if(secenekB.getText() == testAtasozuList.get(soruno).getDogruSecenek()){
            timer(secenekB,1);
        }
        else
            timer(secenekB,0);

    }
    public void onClickC(View view){
        if(secenekC.getText() == testAtasozuList.get(soruno).getDogruSecenek()){
            dogruSayisi++;butonKilitle();
        }
        else if(secenekC.getText() != testAtasozuList.get(soruno).getDogruSecenek()){
            yanlisSayisi++;butonKilitle();
        }
        if(secenekC.getText() == testAtasozuList.get(soruno).getDogruSecenek()){
            timer(secenekC,1);
        }
        else{
            timer(secenekC,0);
        }


    }
    public void timer(final Button secenek, final int isTrue){
        new CountDownTimer(1000,500){
            @Override
            public void onTick(long l) {
                if(isTrue == 1){

                    secenek.setBackgroundColor(Color.argb(255,152,192,100));
                   // Toast.makeText(getApplicationContext(),"zaman"+l/1000,Toast.LENGTH_SHORT).show();
                }
                else if(isTrue == 0)
                {
                    secenek.setBackgroundColor(Color.argb(255,229,27,27));
                }

            }

            @Override
            public void onFinish() {
                secenek.setBackgroundColor(Color.argb(255,254,200,87));
                soruno++;
                soruSor(soruno);
            }
        }.start();
    }
}
