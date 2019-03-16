package com.example.neslihan.atasozlerivedeyimler;

import android.graphics.Bitmap;

import java.util.ArrayList;

public class Atasozu  {

    private String atasozuMetni;
    private int atasozuimage;
    private int atasozuIndex;

    public Atasozu(String atasozuMetni, int atasozuimage, int atasozuIndex ){

        this.atasozuimage = atasozuimage;
        this.atasozuMetni = atasozuMetni;
        this.atasozuIndex = atasozuIndex;
    }

    public String getAtasozuMetni() {
        return atasozuMetni;
    }

    public void setAtasozuMetni(String atasozuMetni) {
        this.atasozuMetni = atasozuMetni;
    }

    public int getAtasozuimage() {
        return atasozuimage;
    }

    public void setAtasozuimage(int atasozuimage) {
        this.atasozuimage = atasozuimage;
    }

    public int getAtasozuIndex() {
        return atasozuIndex;
    }

    public void setAtasozuIndex(int atasozuIndex) {
        this.atasozuIndex = atasozuIndex;
    }
}
