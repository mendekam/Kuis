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
                System.out.println("Input Nama : ");
                String nama = input.nextLine();
                System.out.println("Asal Sekolah ");


                break;

            case 2 :
                break;
        }
    }
}
