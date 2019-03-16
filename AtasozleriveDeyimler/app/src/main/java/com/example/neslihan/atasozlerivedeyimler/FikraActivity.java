package com.example.neslihan.atasozlerivedeyimler;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FikraActivity extends AppCompatActivity {

    ListView listView;
    Button buton;
    final List<Fikra> fikralar = new ArrayList<Fikra>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fikra);
        listView = findViewById(R.id.fikralistview);
        buton = findViewById(R.id.butonfikra);
        fikralar.add(new Fikra("Parayı veren düdüğü çalar",R.drawable.fikra1,0));
        fikralar.add(new Fikra("Ya tutarsa !",R.drawable.fikra2,1));
        fikralar.add(new Fikra("O konuşursa, bu da düşünür",R.drawable.fikra3,2));


        CustomFikraAdapter adapter = new CustomFikraAdapter(this, fikralar);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(),FikraGosterActivity.class);
                intent.putExtra("index",fikralar.get(i).getFikraIndex());
                startActivity(intent);
                finish();

            }
        });
    }
    void backtomain(View view){
        MainActivity.ply.stop();
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
        finish();
    }
}
