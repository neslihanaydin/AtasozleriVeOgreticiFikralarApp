package com.example.neslihan.atasozlerivedeyimler;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class CustomFikraAdapter extends BaseAdapter {
    private LayoutInflater fikraInflater;
    private List<Fikra> fikraList;

    public CustomFikraAdapter(Activity activity, List<Fikra> fikraList){
        fikraInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.fikraList = fikraList;
    }
    @Override
    public int getCount() {
        return  fikraList.size();
    }

    @Override
    public Object getItem(int i){
        return fikraList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View lineView;
        lineView = fikraInflater.inflate(R.layout.custom_fikra_view, null);
        TextView textViewFikra = (TextView) lineView.findViewById(R.id.textViewFikra);
        ImageView imageViewFikra = (ImageView) lineView.findViewById(R.id.imageViewFikra);

        Fikra fikra = fikraList.get(i);
        textViewFikra.setText(fikra.getFikraMetni());
        imageViewFikra.setImageResource(fikra.getFikraimage());

        return lineView;
    }
}
