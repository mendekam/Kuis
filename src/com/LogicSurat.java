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
        return struktur;
    }

    @Override
    public double isi() {
        return isi;
    }

    @Override
    public double kreativitas() {
        return kreativitasSurat;
    }

    @Override
    public double penerapanKaidah() {
        return penerapanKaidah;
    }

    public double hasil(){
        return (hasil = struktur, isi, kreativitasSurat, penerapanKaidah);
    }
}
