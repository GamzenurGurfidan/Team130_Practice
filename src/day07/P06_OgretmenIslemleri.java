package day07;

import java.util.Scanner;

public class P06_OgretmenIslemleri implements I01_Islemler{
    /*
    ============= İŞLEMLER =============
         1-EKLEME
         2-ARAMA
         3-LİSTELEME
         4-SİLME
         5-ANA MENÜ
         Q-ÇIKIŞ

        SEÇİMİNİZ:
     */
    Scanner scanner = new Scanner(System.in);
    void ogrtMenu() {

        System.out.println("============= OGRETMEN İŞLEMLERİ =============\n" +
                           "\t 1-EKLEME\n" +
                           "\t 2-ARAMA\n" +
                           "\t 3-LİSTELEME\n" +
                           "\t 4-SİLME\n" +
                           "\t 5-ANA MENÜ\n" +
                           "\t Q-ÇIKIŞ\n" +
                           "\n" +
                           "\t SEÇİMİNİZ:");

        char secim = scanner.next().toUpperCase().charAt(0);
        switch (secim) {
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
