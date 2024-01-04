package day07;

import java.awt.*;
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

        System.out.print("============= OGRENCİ İŞLEMLERİ =============\n" +
                           "\t 1-EKLEME\n" +
                           "\t 2-ARAMA\n" +
                           "\t 3-LİSTELEME\n" +
                           "\t 4-SİLME\n" +
                           "\t 5-ANA MENÜ\n" +
                           "\t Q-ÇIKIŞ\n" +
                           "\n" +
                           "\t SEÇİMİNİZ: ");

        char secim = scanner.next().toUpperCase().charAt(0);
        switch (secim){
            case '1':
                ekleme();
                break;
            case '2':
                arama();
                break;
            case '3':
                listeleme();
                break;
            case '4':
                silme();
                break;
            case '5':
                anaMenu();
                break;
            case 'Q':
                cikis();
                break;
            default:
                System.out.println("Hatalı giris yaoıldı");
        }
    }

    @Override
    public void ekleme() {
        System.out.println("-------------------------------");
        System.out.println("Yeni Ögrenci Bilgi Giriş Ekranı");
        System.out.println("-------------------------------");
        scanner.nextLine();

        System.out.print("Öğrenci Adi: ");
        String firstName = scanner.nextLine();
        System.out.print("Örenci Soyadı: ");
        String surName = scanner.nextLine();
        System.out.print("TC Kimlik No: ");
        String kimlikNo = scanner.next();
        System.out.print("Yaşı: ");
        int age = scanner.nextInt();
        System.out.print("Sınıf: ");
        int sinif = scanner.nextInt();

        P03_Ogrenci ogrenci = new P03_Ogrenci(firstName,surName,kimlikNo,age,number++ ,sinif);
        ogrenciList.add(ogrenci);
        System.out.println(" ");
        System.out.println("İşlem tamamlandı\n");
        System.out.println("Ogrenci Bilgileri ");
        listeleme();
        ogrMenu();
    }

    @Override
    public void arama() {
        scanner.nextLine();
        System.out.println("Aradıgınız kisinin TC kimlik numarasını giriniz");
        String kimlikNo = scanner.nextLine();


        for (P03_Ogrenci each : ogrenciList){
            if (each.getKimlikNo().equals(kimlikNo)){
                System.out.println("Aradıgınız ogrenci: " +"\n"+ each);
                ogrMenu();
            }else {
                System.out.println("Kayıt bulunamamıştır.");
                ogrMenu();
            }
        }
    }

    @Override
    public void listeleme() {
        for (P03_Ogrenci each: ogrenciList){
            System.out.println(each);
        }
        ogrMenu();
    }

    @Override
    public void silme() {
        scanner.nextLine();
        System.out.println("Silinecek kişinin TC kimlik numarasını giriniz: ");
        String kimlikNo = scanner.nextLine();
        boolean flag = true;
        for (int i = 0; i < ogrenciList.size(); i++) {
            if (ogrenciList.get(i).getKimlikNo().equals(kimlikNo)){
                System.out.println(ogrenciList.get(i)+ "kisisi bilgileriyle silinecek");
                ogrenciList.remove(i);
                flag = false;


            }else if (flag){
                System.out.println(kimlikNo + "kimlik numaralı kayıt bulunamadı");
                ogrMenu();
            }
        }
    }

    @Override
    public void anaMenu() {
        P04_Menu anaMenu = new P04_Menu();
        anaMenu.menu();
    }

    @Override
    public void cikis() {
        P04_Menu anaMenu = new P04_Menu();
        anaMenu.menu();
    }
}
