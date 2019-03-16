package com.example.neslihan.atasozlerivedeyimler;

public class TestAtasozu {

    private String atasozuMetni;
    private int atasozuimage;
    private int atasozuIndex;
    private String SecenekBir;
    private String SecenekIki;
    private String SecenekUc;
    private String dogruSecenek;

    public TestAtasozu(String atasozuMetni, int atasozuimage, int atasozuIndex, String SecenekBir, String SecenekIki, String SecenekUc, String dogruSecenek){

        this.atasozuimage = atasozuimage;
        this.atasozuMetni = atasozuMetni;
        this.atasozuIndex = atasozuIndex;
        this.SecenekBir = SecenekBir;
        this.SecenekIki = SecenekIki;
        this.SecenekUc = SecenekUc;
        this.dogruSecenek = dogruSecenek;
    }

    public String getDogruSecenek() {
        return dogruSecenek;
    }

    public void setDogruSecenek(String dogruSecenek) {
        this.dogruSecenek = dogruSecenek;
    }

    public String getSecenekBir() {
        return SecenekBir;
    }

    public void setSecenekBir(String SecenekBir) {
        this.SecenekBir = SecenekBir;
    }

    public String getSecenekIki() {
        return SecenekIki;
    }

    public void setSecenekIki(String SecenekIki) {
        this.SecenekIki = SecenekIki;
    }

    public String getSecenekUc() {
        return SecenekUc;
    }

    public void setSecenekUc(String secenekUc) {
        SecenekUc = secenekUc;
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
