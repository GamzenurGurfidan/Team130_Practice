package day04;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

public class P10_WiseMarket {
    public static void main(String[] args) {
        /*
           ====================PROJEMIZ===================================
            ilk programa girildiginde bizi bir menu karsilasin bu secenekler
           1 ŞARKÜTERİ ÜRÜNLERİ
           2 MANAV ÜRÜNLERİ
           3 MARKET
           secime göre;
           4-urunleri listele ve
           5-fiyatlari gelsin
           6-alışveriş bitince fiş yazdırsın
           7-Fiş yazdırdıktan sonra da çıış yapılsın

        */


        girisEkrani();
    }

    static Scanner scan = new Scanner(System.in);
    static int urunKodu;
    static boolean ekUrun = false;
    static int urunAdedi;
    static String urunAd;
    static int urunFiyati;
    static int toplam;
    static String sepet = "\n";

    public static void girisEkrani() {
        System.out.println("====================== T130 - WISE MARKET =======================");
        System.out.println("-------------------------- Hoşgeldiniz --------------------------");
        System.out.println("Lütfen bir seçim yapınız?\n" +
                "Alışveriş yapcagınız reyon numarasını girip enter tuşuna basınız:");
        System.out.println("1- Şarküteri Reyonu\n" +
                "2- Manav Reyonu\n" +
                "3- Market Reyonu\n" +
                "4- Fiş Yazdirma\n" +
                "5- Çıkış");

        int secim = scan.nextInt();


        switch (secim) {
            case 1:
                sarkuteri();
                break;
            case 2:
                manav();
                break;
            case 3:
                market();
                break;
            case 4:
                fisYazdir();
                break;
            case 5:
                cikis();
                break;
            default:
                System.out.println("gecersiz bir işlem sectiniz! Lütfen yeniden deneyiniz");
                girisEkrani();
        }


    }

    public static void cikis() {
        System.out.println("---- Cıkıs Yapiliyor ----");
        System.exit(0);
    }

    public static void fisYazdir() {

        System.out.println("Fis Yazdiriliyor...");
        System.out.println("----------- T130 WISE MARKET ----------");
        System.out.println(" ");
        System.out.println(sepet);


        System.out.println("Toplam tutar: " + toplam);
        System.out.println("KDV: " + (toplam * 0.20));
        toplam += (toplam * 0.20);
        System.out.println("Ödenecek tutar: " + toplam + " KDV Dahil");


        System.out.println("Ödenen miktar: ");
        int odeme = scan.nextInt();


        while (odeme < toplam) {
            System.out.println("Yetersiz bakiye " + (toplam - odeme) + " TL daha ödeme yapmalısınız");
            System.out.println("Ödenen miktar: ");
            odeme = scan.nextInt();


        }


        System.out.println("Para üstü " + (odeme - toplam));


        System.out.println("Bizi tercih ettiginiz için teşekkür eder yine bekleriz.");
        LocalDateTime date = LocalDateTime.now();
        System.out.println(date);
        cikis();
    }

    public static void market() {
        System.out.println("---- Market Reyonu ----");
        System.out.println("301 - Cips 50 TL\n" +
                "302 - Pop Kek 10 TL\n" +
                "303 - Çamaşır Deterjanı 150 TL\n" +
                "304 - Bulaşık Deterjanı 200 TL\n" +
                "305 - Ped 130 TL");
        System.out.print("Lütfen ürün kodu giriniz: ");

        while (!ekUrun) {
            urunKodu = scan.nextInt();
            if (urunKodu >= 301 && urunKodu <= 305) {
                System.out.print("Kaç paket ürün alınacak: ");
                urunAdedi = scan.nextInt();
                switch (urunKodu) {
                    case 301:
                        urunAd = "Cips";
                        urunFiyati = 50;
                        System.out.println(urunAdedi + "  paket " + urunAd + " alıyorsunuz. Fiyati: "
                                + (urunAdedi * urunFiyati) + " TL'dir");
                        break;
                    case 302:
                        urunAd = "PopKek";
                        urunFiyati = 10;
                        System.out.println(urunAdedi + "  paket " + urunAd + " alıyorsunuz. Fiyati: "
                                + (urunAdedi * urunFiyati) + " TL'dir");
                        break;
                    case 303:
                        urunAd = "Çamaşır Deterjanı";
                        urunFiyati = 150;
                        System.out.println(urunAdedi + "  paket " + urunAd + " alıyorsunuz. Fiyati: "
                                + (urunAdedi * urunFiyati) + " TL'dir");
                        break;
                    case 304:
                        urunAd = "Bulaşık Deterjanı";
                        urunFiyati = 200;
                        System.out.println(urunAdedi + "  paket " + urunAd + " alıyorsunuz. Fiyati: "
                                + (urunAdedi * urunFiyati) + " TL'dir");
                        break;
                    case 305:
                        urunAd = "Ped";
                        urunFiyati = 130;
                        System.out.println(urunAdedi + "  paket " + urunAd + " alıyorsunuz. Fiyati: "
                                + (urunAdedi * urunFiyati) + " TL'dir");
                        break;
                }
                urunFiyati = urunFiyati * urunAdedi;
                toplam += urunFiyati;
                System.out.println("Toplam Tutar: " + toplam);
                sepet += urunAd + " : " + urunFiyati + " TL\n";
                System.out.println("Başkla bir ürün almak isterseniz, ürün kodunu giriniz\nAna menüye dönmek için 0'ı tuşlayınız");

            } else if (urunKodu == 0) {
                girisEkrani();
            }
            ekUrun = false;
        }
    }

    public static void manav() {

        System.out.println("---- Manav Reyonu ----");
        System.out.println("201 - Ananas 80 TL\n" +
                "202 - Mandalina 50 TL\n" +
                "203 - Elma 75 TL\n" +
                "204 - Portakal 60 TL\n" +
                "205 - Muz 80 TL");
        System.out.print("Lütfen ürün kodu giriniz: ");

        while (!ekUrun) {
            urunKodu = scan.nextInt();
            if (urunKodu >= 201 && urunKodu <= 205) {
                System.out.print("Kaç paket ürün alınacak: ");
                urunAdedi = scan.nextInt();
                switch (urunKodu) {
                    case 201:
                        urunAd = "Ananas";
                        urunFiyati = 80;
                        System.out.println(urunAdedi + "  paket " + urunAd + " alıyorsunuz. Fiyati: "
                                + (urunAdedi * urunFiyati) + " TL'dir");
                        break;
                    case 202:
                        urunAd = "Mandalina";
                        urunFiyati = 50;
                        System.out.println(urunAdedi + "  paket " + urunAd + " alıyorsunuz. Fiyati: "
                                + (urunAdedi * urunFiyati) + " TL'dir");
                        break;
                    case 203:
                        urunAd = "Elma";
                        urunFiyati = 75;
                        System.out.println(urunAdedi + "  paket " + urunAd + " alıyorsunuz. Fiyati: "
                                + (urunAdedi * urunFiyati) + " TL'dir");
                        break;
                    case 204:
                        urunAd = "Portakal";
                        urunFiyati = 60;
                        System.out.println(urunAdedi + "  paket " + urunAd + " alıyorsunuz. Fiyati: "
                                + (urunAdedi * urunFiyati) + " TL'dir");
                        break;
                    case 205:
                        urunAd = "Muz";
                        urunFiyati = 80;
                        System.out.println(urunAdedi + "  paket " + urunAd + " alıyorsunuz. Fiyati: "
                                + (urunAdedi * urunFiyati) + " TL'dir");
                        break;
                }
                urunFiyati = urunFiyati * urunAdedi;
                toplam += urunFiyati;
                System.out.println("Toplam Tutar: " + toplam);
                sepet += urunAd + " : " + urunFiyati + " TL\n";
                System.out.println("Başkla bir ürün almak isterseniz, ürün kodunu giriniz\nAna menüye dönmek için 0'ı tuşlayınız");

            } else if (urunKodu == 0) {
                girisEkrani();
            }
            ekUrun = false;
        }
    }


    public static void sarkuteri() {
        System.out.println("---- Sarkuteri Reyonu ----");
        System.out.println("101 - Peynir 250TL \n" +
                "102 - Pastırma 600 TL \n" +
                "103 - Yogurt 150 TL \n" +
                "104 - Sucuk 350\n" +
                "105 - Yumurta 100 TL");
        System.out.print("Lütfen Ürün kodunu giriniz: ");


        /*
            if (!(urunKodu>= 101 && urunKodu<=105)){
                System.out.println(urunKodu + " kodlu ürün bulunamadı.Yeniden deneyiniz");
                sarkuteri();
            }
         */
        while (!ekUrun) {
            urunKodu = scan.nextInt();
            if (urunKodu >= 101 && urunKodu <= 105) {
                System.out.print("kaç paket ürün alınacak: ");
                urunAdedi = scan.nextInt();
                switch (urunKodu) {
                    case 101:
                        urunAd = "Peynir";
                        urunFiyati = 250;
                        System.out.println(urunAdedi + "  paket " + urunAd + " alıyorsunuz. Fiyati: "
                                + (urunAdedi * urunFiyati) + " TL'dir");
                        break;
                    case 102:
                        urunAd = "Pastirma";
                        urunFiyati = 600;
                        System.out.println(urunAdedi + "  paket " + urunAd + " alıyorsunuz. Fiyati: "
                                + (urunAdedi * urunFiyati) + " TL'dir");
                        break;
                    case 103:
                        urunAd = "Yogurt";
                        urunFiyati = 150;
                        System.out.println(urunAdedi + "  paket " + urunAd + " alıyorsunuz. Fiyati: "
                                + (urunAdedi * urunFiyati) + " TL'dir");
                        break;
                    case 104:
                        urunAd = "Sucuk";
                        urunFiyati = 350;
                        System.out.println(urunAdedi + "  paket " + urunAd + " alıyorsunuz. Fiyati: "
                                + (urunAdedi * urunFiyati) + " TL'dir");
                        break;
                    case 105:
                        urunAd = "Yumurta";
                        urunFiyati = 100;
                        System.out.println(urunAdedi + "  paket " + urunAd + " alıyorsunuz. Fiyati: "
                                + (urunAdedi * urunFiyati) + " TL'dir");
                        break;
                }
                urunFiyati = urunAdedi * urunFiyati;
                toplam += urunFiyati;
                System.out.println("Toplam Tutar: " + toplam);
                sepet += urunAd + " : " + urunFiyati + " TL\n";
                System.out.println("Başkla bir ürün almak isterseniz, ürün kodunu giriniz\nAna menüye dönmek için 0'ı tuşlayınız");

            } else if (urunKodu == 0) {
                girisEkrani();
            }
            ekUrun = false;
        }


    }


}
