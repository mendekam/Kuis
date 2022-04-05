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
                do{
                    System.out.println("= PENDAFTARAN =");
                    System.out.println("Input Nama : ");
                    String nama = input.nextLine();
                    System.out.println("Asal Sekolah ");
                    String sekolah = input.nextLine();

                    System.out.println("= FORM PENILAIAN =");
                    System.out.println("*Nilai 0-100");
                    System.out.println("Input Nilai Alur Cerita : ");
                    alur = input.nextDouble();
                    System.out.println("Input Nilai Konten : ");
                    konten = input.nextDouble();
                    System.out.println("Input Nilai Kreativitas : ");
                    kreativitasAnimasi = input.nextDouble();
                    System.out.println("Input Nilai Sinematografi : ");
                    sinematografi = input.nextDouble();

                    System.out.println("Menu : ");
                    System.out.println("1. Tampil\n2. Edit\n3. Exit");
                    System.out.println("Pilihan : ");
                    PilihanMenu1 = input.nextInt();

                }while(PilihanMenu1 != 3);


                break;

            case 2 :
                break;
        }
    }
}
