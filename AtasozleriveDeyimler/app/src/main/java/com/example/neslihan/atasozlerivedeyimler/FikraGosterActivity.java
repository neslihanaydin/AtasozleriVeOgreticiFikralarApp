package com.example.neslihan.atasozlerivedeyimler;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.BufferedReader;

public class FikraGosterActivity extends AppCompatActivity {

    ImageView imageView;
    EditText editText;
    Button geributon;
    Button ileributon;
    Button listeyedonbuton;
    int indexFikra ;
    static  int sayac = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fikra_goster);

        imageView = findViewById(R.id.fikraview);
        editText = findViewById(R.id.fikratext);
        geributon = findViewById(R.id.geributon);
        ileributon = findViewById(R.id.ileributon);
        listeyedonbuton = findViewById(R.id.listeyedonbuton);
        Intent intent = getIntent();
        indexFikra = intent.getIntExtra("index",-1);
        goster(indexFikra);
    }
    public void goster(int index){
        if(index == 0){
            sayac = 0;
            imageView.setImageResource(R.drawable.fikra1);
            editText.setText("Bir gün Nasrettin Hoca pazara giderken çocuklar etrafını sarmışlar. Hepsi birer düdük ısmarlamış, ama para veren olmamış.\n" +
                    "Hoca çocukların tümüne olumlu cevap vermiş:\n" +
                    "– Peki, olur demiş…\n" +
                    "Çocuklardan yalnız biri, elinde para olduğu halde, Hoca’ya şunları söylemiş:\n" +
                    "– Şu parayla bana bir düdük getirir misin ?\n" +
                    "Hoca akşama doğru pazardan dönmüş. Yolunu bekleyen çocuklar hemen Nasrettin Hoca’nın etrafını sararak düdüklerini istemişler.\n" +
                    "Nasrettin Hoca, cebinden bir düdük çıkarıp kendisine para veren çocuğa uzatmış.\n" +
                    "Ötekiler bağırmaya başlamışlar:\n" +
                    "– Ya bizim düdükler nerede?\n" +
                    "Nasrettin Hoca’nın cevabı kısa ve anlamlı olmuş:\n" +
                    "– Parayı veren düdüğü çalar.");
        }
        else if(index == 1){
            sayac = 1;
            imageView.setImageResource(R.drawable.fikra2);
            editText.setText("Günlerden bir gün Nasrettin Hoca eline yoğurt mayası bakraçını alıp göle doğru yola koyulmuş.\n" +
                    "Gölün etrafında piknik yapan köylüler Hoca’ya dikkat kesilmişler.\n" +
                    "Hoca Nasrettin başlamış yoğurt mayasını göle kaşık, kaşık dökmeye:\n" +
                    "Köyüler şaşkınlıkla izlerken, içlerinden biri Hoca’nın yanına varmış.\n" +
                    "– Hayırdır Hocam? Ne yapıyorsun böyle? diye sormuş.\n" +
                    "– Göle yoğurt mayası çalıyorum, demiş.\n" +
                    "– İlahi hocam, hiç göle maya çalmakla göl maya tutar mı?\n" +
                    "– Hoca Nasrettin O cevaplarından birini daha vermiş;\n" +
                    "– Ya tutarsa…\n" +
                    "\n" +
                    "Hoca Nasrettin bu davranışıyla, yaşadığı toplumda olmadık işlerle uğraşan, boş hevesler peşinde koşan kişilere ders vermek istemiştir.");
        }
        else if(index == 2){
            sayac = 2;
            imageView.setImageResource(R.drawable.fikra3);
            editText.setText("Nasreddin Hoca, bir gün pazarda bir adamın başına toplanmış olan kalabalığa yaklaşır. Satıcı elindeki kuşu satmaya çalışmakta ve fiyatı ise 50 Akçedir, yan taraftaki tavuklar ise 5 Akçe. Hoca bir türlü fiyattaki farkı anlayamaz ve sorar:\n" +
                    "\n" +
                    "– Hemşerim bu nasıl kuş, 50 Akçe istersin?\n" +
                    "– Hoca efendi bu bildiğin kuş değildir, bunun özelliği var.\n" +
                    "– Neymiş özelliği?\n" +
                    "– Hocam bu kuşa papağan derler ve konuşur.\n" +
                    "Hoca hemen eve koşar, kümesten horozunu kaptığı gibi pazara döner. Papağan satmakta olan adamın yanında durur ve yüksek sesle;\n" +
                    "\n" +
                    "– Bu gördüğünüz kuş sadece 100 Akçeye, gel, gel!\n" +
                    "Papağan satan kişi bu işe çok şaşırır ve sorar.\n" +
                    "\n" +
                    "– Hocam 100 Akçe çok değil mi bir horoz için?\n" +
                    "– Sen 50 ye satıyorsun ama?\n" +
                    "– Dedim ya hocam benim kuş konuşur ama.\n" +
                    "– O konuşursa, benimki de düşünür!");
        }
        else if( index == -1){
            sayac = -1;
            imageView.setImageResource(R.drawable.internetyok);
        }
    }
    public void ileriGit(View view){
        sayac = sayac+1;
        ilerigerigoster(sayac);

    }
    public void geriDon(View view){
        sayac = sayac - 1;
        ilerigerigoster(sayac);

    }
    public void listeyeDon(View view){
        Intent intent = new Intent(getApplicationContext(),FikraActivity.class);
        startActivity(intent);
        finish();
    }
    public void ilerigerigoster(int sayac){
        if(sayac < 0){
            FikraGosterActivity.sayac = 0;
            Toast.makeText(getApplicationContext(),"Bu ilk fikradir.",Toast.LENGTH_SHORT).show();
        }
        if(sayac == 0){
            goster(sayac);
        }
        if(sayac == 1){
            goster(sayac);
        }
        if(sayac == 2){
            goster(sayac);
        }
        if(sayac > 3) {
            FikraGosterActivity.sayac = 3;
            Toast.makeText(getApplicationContext(),"Son fikraya geldin!",Toast.LENGTH_SHORT).show();
        }
    }
}
