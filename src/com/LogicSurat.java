package com;

import com.lomba.MenulisSurat;

public class LogicSurat implements MenulisSurat {
    double struktur, isi, kreativitasSurat, penerapanKaidah;
    double hasil;
    String keterangan = "Tidak Lulus";

    public LogicSurat(double struktur, double isi, double kreativitasSurat, double penerapanKaidah) {
        this.struktur = struktur;
        this.isi = isi;
        this.kreativitasSurat = kreativitasSurat;
        this.penerapanKaidah = penerapanKaidah;
    }

    public void setStruktur(double struktur) {
        this.struktur = struktur;
    }

    public void setIsi(double isi) {
        this.isi = isi;
    }

    public void setKreativitasSurat(double kreativitasSurat) {
        this.kreativitasSurat = kreativitasSurat;
    }

    public void setPenerapanKaidah(double penerapanKaidah) {
        this.penerapanKaidah = penerapanKaidah;
    }

    @Override
    public double struktur() {
        struktur = struktur * 0.10;
        return struktur;
    }

    @Override
    public double isi() {
        isi = isi * 0.40;
        return isi;
    }

    @Override
    public double kreativitasSurat() {
        kreativitasSurat = kreativitasSurat * 0.30;
        return kreativitasSurat;
    }

    @Override
    public double penerapanKaidah() {
        penerapanKaidah = penerapanKaidah * 0.20;
        return penerapanKaidah;
    }

    public double hasil(){
        hasil = struktur() + isi() + kreativitasSurat() + penerapanKaidah();
        return hasil;
    }

    public String keterangan(){
        if (hasil >=85){
            keterangan = "Lulus";
        }
        return keterangan;
    }

}
