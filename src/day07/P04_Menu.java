package day07;

import java.util.Scanner;

public class P04_Menu {
    /*
            ====================================
             ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ
            ====================================
        1- ÖĞRENCİ İŞLEMLERİ
        2- ÖĞRETMEN İŞLEMLERİ
        Q- ÇIKIŞ

        SEÇİMİNİZ:
     */


    void menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("====================================\n" +
                           " ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                           "====================================\n" +
                           "\t 1- ÖĞRENCİ İŞLEMLERİ\n" +
                           "\t 2- ÖĞRETMEN İŞLEMLERİ\n" +
                           "\t Q- ÇIKIŞ\n" +
                           "\n" +
                           "\t SEÇİMİNİZ: ");

        char secim = scanner.next().toUpperCase().charAt(0);

        switch (secim){
            case '1':
                P05_OgrenciIslemleri ogrenciIslemleri = new P05_OgrenciIslemleri();
                ogrenciIslemleri.ogrMenu();
                menu();
                break;
            case '2':
                P06_OgretmenIslemleri ogretmenIslemleri = new P06_OgretmenIslemleri();
                ogretmenIslemleri.ogrtMenu();
                menu();
                break;
            case 'Q':
                System.out.println("çıkış yapılıyor...");
                System.exit(0);
                break;
            default:
                System.out.println("Hatalı giris yaptiniz tekrar deneyiniz!\n");
                menu();
        }

    }


}
