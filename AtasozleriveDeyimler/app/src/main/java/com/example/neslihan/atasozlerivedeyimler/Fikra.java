package com.example.neslihan.atasozlerivedeyimler;

public class Fikra {
    private String fikraMetni;
    private int fikraimage;
    private int fikraIndex;

    public Fikra(String fikraMetni,int fikraimage, int fikraIndex){
        this.fikraimage = fikraimage;
        this.fikraIndex = fikraIndex;
        this.fikraMetni = fikraMetni;
    }

    public void setFikraimage(int fikraimage) {
        this.fikraimage = fikraimage;
    }

    public int getFikraimage() {
        return fikraimage;
    }

    public int getFikraIndex() {
        return fikraIndex;
    }

    public void setFikraIndex(int fikraIndex) {
        this.fikraIndex = fikraIndex;
    }

    public void setFikraMetni(String fikraMetni) {
        this.fikraMetni = fikraMetni;
    }

    public String getFikraMetni() {
        return fikraMetni;
    }
}
