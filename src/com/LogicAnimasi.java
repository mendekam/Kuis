package com;

import com.lomba.Animasi;

public class LogicAnimasi implements Animasi {
    double alur, konten, kreativitasAnimasi, sinematografi;
    double hasil;
    String keterangan = "Tidak Lulus";

    public LogicAnimasi(double alur, double konten, double kreativitasAnimasi, double sinematografi) {
        this.alur = alur;
        this.konten = konten;
        this.kreativitasAnimasi = kreativitasAnimasi;
        this.sinematografi = sinematografi;
    }

    public void setAlur(double alur) {
        this.alur = alur;
    }

    public void setKonten(double konten) {
        this.konten = konten;
    }

    public void setKreativitasAnimasi(double kreativitasAnimasi) {
        this.kreativitasAnimasi = kreativitasAnimasi;
    }

    public void setSinematografi(double sinematografi) {
        this.sinematografi = sinematografi;
    }

    @Override
    public double alurCerita() {
        alur = alur * 0.15;
        return alur;
    }

    @Override
    public double konten() {
        konten = konten * 0.35;
        return konten;
    }

    @Override
    public double kreativitas() {
        kreativitasAnimasi = kreativitasAnimasi * 0.35;
        return kreativitasAnimasi;
    }

    @Override
    public double sinematografi() {
        sinematografi = sinematografi * 0.15;
        return sinematografi;
    }

    public double hasil(){
        hasil = alurCerita() + konten() + kreativitas() + sinematografi();
        return hasil;
    }

    public String keterangan(){
        if (hasil >=85){
            keterangan = "Lulus";
        }
        return keterangan;
    }
}
