package com;

import com.lomba.Animasi;

public class LogicAnimasi implements Animasi {
    double alur, konten, kreativitasAnimasi, sinematografi;
    double hasil;

    public LogicAnimasi(double alur, double konten, double kreativitasAnimasi, double sinematografi) {
        this.alur = alur;
        this.konten = konten;
        this.kreativitasAnimasi = kreativitasAnimasi;
        this.sinematografi = sinematografi;
    }

    @Override
    public double alurCerita() {
        return (alur = alur * 0.15);
    }

    @Override
    public double konten() {
        return (konten = konten * 0.35);
    }

    @Override
    public double kreativitas() {
        return (kreativitasAnimasi = kreativitasAnimasi * 0.35);
    }

    @Override
    public double sinematografi() {
        return (sinematografi = sinematografi * 0.15);
    }

    public double hasil(){
        return (hasil = alur + konten + kreativitasAnimasi + sinematografi);
    }
}
