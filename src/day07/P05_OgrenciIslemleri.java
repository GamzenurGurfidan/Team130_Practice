package day07;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class P05_OgrenciIslemleri implements I01_Islemler {
    /*
        ============= OGRENCİ İŞLEMLER =============
         1-EKLEME
         2-ARAMA
         3-LİSTELEME
         4-SİLME
         5-ANA MENÜ
         Q-ÇIKIŞ

        SEÇİMİNİZ:
     */

    Scanner scanner = new Scanner(System.in);
    int number = 1000;
    List<P03_Ogrenci> ogrenciList = new ArrayList<>();
    void ogrMenu(){

        System.out.println("============= OGRENCİ İŞLEMLERİ =============\n" +
                           "\t 1-EKLEME\n" +
                           "\t 2-ARAMA\n" +
                           "\t 3-LİSTELEME\n" +
                           "\t 4-SİLME\n" +
                           "\t 5-ANA MENÜ\n" +
                           "\t Q-ÇIKIŞ\n" +
                           "\n" +
                           "\t SEÇİMİNİZ:");

        char secim = scanner.next().toUpperCase().charAt(0);
        switch (secim){
            case '1':
                ekleme();
            case '2':
                arama();
            case '3':
                listeleme();
            case '4':
                silme();
            case '5':
                anaMenu();
            case 'Q':
                cikis();
            default:
        }
    }

    @Override
    public void ekleme() {
        System.out.println("-------------------------------");
        System.out.println("Yeni Ögrenci Bilgi Giriş Ekranı");
        System.out.println("-------------------------------");
        System.out.print("Öğrenci Adi: \n");
        String firstName = scanner.nextLine();
        System.out.print("Örenci Soyadı: \n");
        String surName = scanner.nextLine();
        System.out.println("TC Kimlik No: \n");
        String kimlikNo = scanner.next();
        System.out.println("Yaşı: \n");
        int age = scanner.nextInt();
        System.out.println("Sınıfı: \n");
        int sinif = scanner.nextInt();
        P03_Ogrenci ogrenci = new P03_Ogrenci(firstName,surName,kimlikNo,age,number++ ,sinif);
        ogrenciList.add(ogrenci);
    }

    @Override
    public void arama() {

    }

    @Override
    public void listeleme() {

    }

    @Override
    public void silme() {

    }

    @Override
    public void anaMenu() {

    }

    @Override
    public void cikis() {

    }
}
