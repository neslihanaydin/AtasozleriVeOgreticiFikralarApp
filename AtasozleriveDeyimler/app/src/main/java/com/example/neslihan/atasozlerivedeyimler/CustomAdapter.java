package com.example.neslihan.atasozlerivedeyimler;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.security.acl.LastOwnerException;
import java.util.List;

public class CustomAdapter extends BaseAdapter{

    private LayoutInflater atasozuInflater;
    private List<Atasozu> atasozuList;

    public CustomAdapter(Activity activity, List<Atasozu> atasozuList){
        atasozuInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.atasozuList = atasozuList;
    }
    @Override
    public int getCount() {
        return  atasozuList.size();
    }

    @Override
    public Object getItem(int i){
        return atasozuList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View lineView;
        lineView = atasozuInflater.inflate(R.layout.custom_view, null);
        TextView textViewAtasozu = (TextView) lineView.findViewById(R.id.textViewAtasozu);
        ImageView imageViewAtasozu = (ImageView) lineView.findViewById(R.id.imageViewAtasozu);

        Atasozu atasozu = atasozuList.get(i);
        textViewAtasozu.setText(atasozu.getAtasozuMetni());
        imageViewAtasozu.setImageResource(atasozu.getAtasozuimage());

        return lineView;
    }
}
