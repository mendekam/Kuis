package com;

import com.lomba.MenulisSurat;

public class LogicSurat implements MenulisSurat {
    double struktur, isi, kreativitasSurat, penerapanKaidah;
    double hasil;

    public LogicSurat(double struktur, double isi, double kreativitas, double penerapanKaidah) {
        this.struktur = struktur;
        this.isi = isi;
        this.kreativitasSurat = kreativitasSurat;
        this.penerapanKaidah = penerapanKaidah;
    }

    @Override
    public double struktur() {
        return (struktur = struktur * 0.10);
    }

    @Override
    public double isi() {
        return (isi = isi * 0.40);
    }

    @Override
    public double kreativitasSurat() {
        return (kreativitasSurat = kreativitasSurat * 0.30);
    }

    @Override
    public double penerapanKaidah() {
        return (penerapanKaidah = penerapanKaidah * 0.20);
    }

    public double hasil(){
        return (hasil = struktur + isi + kreativitasSurat + penerapanKaidah);
    }
}
