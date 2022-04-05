package com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double alur, konten, kreativitasAnimasi, sinematografi;
        double struktur, isi, kreativitasSurat, penerapanKaidah;

        Scanner input = new Scanner(System.in);

        System.out.println("LOMBA APRESIASI PAHLAWAN WANITA INDONESIA OLEH UPNVYK");
        System.out.println("Kategori : ");
        System.out.println("1. Animasi (tim)");
        System.out.println("2. Menulis (individu)");
        System.out.println("Pilih Kategori Lomba : ");
        int PilihanMenu = input.nextInt();

        switch (PilihanMenu){
            case 1 :

                int PilihanMenu1;
                System.out.println("= PENDAFTARAN =");
                System.out.print("Input Nama : ");
                String nama1 = input.next();
                System.out.print("Asal Sekolah ");
                String sekolah1 = input.next();
                System.out.println("= FORM PENILAIAN =");
                System.out.println("*Nilai 0-100");
                System.out.print("Input Nilai Alur Cerita : ");
                alur = input.nextDouble();
                System.out.print("Input Nilai Konten : ");
                konten = input.nextDouble();
                System.out.print("Input Nilai Kreativitas : ");
                kreativitasAnimasi = input.nextDouble();
                System.out.print("Input Nilai Sinematografi : ");
                sinematografi = input.nextDouble();
                LogicAnimasi logicAnimasi = new LogicAnimasi(alur, konten, kreativitasAnimasi, sinematografi);

                do{
                    System.out.println("Menu : ");
                    System.out.println("1. Tampil\n2. Edit\n3. Exit");
                    System.out.println("Pilihan : ");
                    PilihanMenu1 = input.nextInt();

                    if (PilihanMenu1 == 1){
                        System.out.println("Nilai Akhir : " + logicAnimasi.hasil());
                        System.out.println("Keterangan : " + logicAnimasi.keterangan());
                    } else if(PilihanMenu1 == 2){
                        System.out.println("= FORM PENILAIAN =");
                        System.out.println("*Nilai 0-100");
                        System.out.print("Input Nilai Alur Cerita : ");
                        alur = input.nextDouble();
                        logicAnimasi.setAlur(alur);
                        System.out.print("Input Nilai Konten : ");
                        konten = input.nextDouble();
                        logicAnimasi.setKonten(konten);
                        System.out.print("Input Nilai Kreativitas : ");
                        kreativitasAnimasi = input.nextDouble();
                        logicAnimasi.setKreativitasAnimasi(kreativitasAnimasi);
                        System.out.print("Input Nilai Sinematografi : ");
                        sinematografi = input.nextDouble();
                        logicAnimasi.setSinematografi(sinematografi);
                    }

                }while(PilihanMenu1 != 3);


                break;

            case 2 :

                int PilihanMenu2;
                System.out.println("= PENDAFTARAN =");
                System.out.print("Input Nama : ");
                String nama2 = input.next();
                System.out.print("Asal Sekolah ");
                String sekolah2 = input.next();
                System.out.println("= FORM PENILAIAN =");
                System.out.println("*Nilai 0-100");
                System.out.print("Input Nilai Struktur Surat : ");
                struktur = input.nextDouble();
                System.out.print("Input Nilai Isi Surat : ");
                isi = input.nextDouble();
                System.out.print("Input Nilai Kreativitas : ");
                kreativitasSurat = input.nextDouble();
                System.out.print("Input Nilai Penerapan Kaidah Bahasa : ");
                penerapanKaidah = input.nextDouble();
                LogicSurat logicSurat = new LogicSurat(struktur, isi, kreativitasSurat, penerapanKaidah);

                do{
                    System.out.println("Menu : ");
                    System.out.println("1. Tampil\n2. Edit\n3. Exit");
                    System.out.println("Pilihan : ");
                    PilihanMenu1 = input.nextInt();

                    if (PilihanMenu1 == 1){
                        System.out.println("Nilai Akhir : " + logicSurat.hasil());
                        System.out.println("Keterangan : " + logicSurat.keterangan());
                    } else if(PilihanMenu1 == 2){
                        System.out.println("= FORM PENILAIAN =");
                        System.out.println("*Nilai 0-100");
                        System.out.print("Input Nilai Struktur : ");
                        struktur = input.nextDouble();
                        logicSurat.setStruktur(struktur);
                        System.out.print("Input Nilai Isi : ");
                        isi = input.nextDouble();
                        logicSurat.setIsi(isi);
                        System.out.print("Input Nilai Kreativitas : ");
                        kreativitasSurat = input.nextDouble();
                        logicSurat.setKreativitasSurat(kreativitasSurat);
                        System.out.print("Input Nilai Penerapan Kaidah Bahasa : ");
                        penerapanKaidah = input.nextDouble();
                        logicSurat.setPenerapanKaidah(penerapanKaidah);
                    }

                }while(PilihanMenu1 != 3);


                break;
        }
    }
}
