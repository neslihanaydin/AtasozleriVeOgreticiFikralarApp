package com.example.neslihan.atasozlerivedeyimler;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class FeedActivity extends AppCompatActivity {

    ListView listView;
    MediaPlayer ply;
    final List<Atasozu> atasozleri = new ArrayList<Atasozu>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);
        listView = findViewById(R.id.listview);

        atasozleri.add(new Atasozu("Etekleri zil çalmak",R.drawable.atasozu1,0));
        atasozleri.add(new Atasozu("Dereyi görmeden paçaları sıvamak",R.drawable.atasozu2,1));
        atasozleri.add(new Atasozu("Abayı yakmak",R.drawable.atasozu3,2));
        atasozleri.add(new Atasozu("Damlaya damlaya göl olur",R.drawable.atasozu4,3));
        atasozleri.add(new Atasozu("Ev alma komşu al",R.drawable.atasozu5,4));
        atasozleri.add(new Atasozu("Gelen gideni aratır",R.drawable.atasozu6,5));
        atasozleri.add(new Atasozu("Görünen köy kılavuz istemez",R.drawable.atasozu7,6));
        atasozleri.add(new Atasozu("İşleyen demir pas tutmaz",R.drawable.atasozu8,7));
        atasozleri.add(new Atasozu("Gülme komşuna gelir başına",R.drawable.atasozu9,8));
        atasozleri.add(new Atasozu("Hamama giren terler",R.drawable.atasozu10,9));
        atasozleri.add(new Atasozu("Kendi düşen ağlamaz",R.drawable.atasozu11,10));
        atasozleri.add(new Atasozu("Terzi kendi söküğünü dikemez",R.drawable.atasozu12,11));
        atasozleri.add(new Atasozu("Yerin kulağı vardır",R.drawable.atasozu13,12));
        atasozleri.add(new Atasozu("Komşuda pişer, bize de düşer",R.drawable.atasozu14,13));
        atasozleri.add(new Atasozu("Güneş girmeyen eve doktor girer",R.drawable.atasozu15,14));
        atasozleri.add(new Atasozu("Mart kapıdan baktırır kazma kürek yaktırır",R.drawable.atasozu16,15));

        // final ListView listView = (ListView) findViewById(R.id.listview);
        CustomAdapter adapter = new CustomAdapter(this, atasozleri);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                intent.putExtra("index",atasozleri.get(i).getAtasozuIndex());
                startActivity(intent);
                finish();

            }
        });

    }
    void backToMain(View view){
        MainActivity.ply.stop();
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
        finish();
    }
}
