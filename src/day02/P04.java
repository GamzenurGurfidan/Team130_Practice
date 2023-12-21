package day02;

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {

        // operatörler
        // sayi += 1 sayi değerini 1 artirip yeni sayi degeri olarak atar.
        // sayi -= n sayi degerini n azaltıp yeni sayı degeri olarak atar
        // sayi *= n sayi degerini n ile çarpıp yeni sayı degeri olarak atar
        // sayi /= n sayi degerini n'e bölüp yeni sayı degeri olarak atar
        // sayi %n ile bölümünden kalan

        // soru - 3 basamaklı bir int a degeri atayarak . bu degeri  5 arttırıp
        // 7 azaltıp
        // 10 ile bölümünden kalanı bulunuz.

        int a = 376;
        System.out.println("a: " + a ); //376
        a += 5;
        System.out.println( "a + 5 : " + a ); //381
        System.out.println( a- 7); // 374 atama yapmaz sadece yazdırır.
        System.out.println(a); // 381
        a -= 7;
        System.out.println( "a -7 : " + a ); //374
        a = a % 10; // bir sayinin 10 ile bölümünden kalan o sayinin birler basamağını verir
        System.out.println("a 10 ile bölümünden kalan: " + a); // 4

        // kullanıcıdan decimal bir sayi alıp bu sayinin binary karsılığını yazdırın
        // Decimal: 10'luk taban (günlük hayat 1, 2, 3, 3, 4, 5, 6, 7, 8, 9)
        // Binary: 2'lik tabandaki karşılığı ( 0, 1)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen tam sayı giriniz: ");
        int sayi = scanner.nextInt();
        System.out.println( "giridğiniz sayi " + sayi);

        // 2 basamaklılar için

        int kalan1 = sayi %2;
        sayi /= 2 ;
        int kalan2 = sayi %2;
        sayi/=2;
        int kalan3 = sayi%2;
        sayi/=2;
        System.out.println("binary karşılığı: " + sayi +""+ kalan3+""+kalan2+""+kalan1);

        System.out.println("Lütfen bir sayi giriniz: ");
        int sayi10 = scanner.nextInt();
        String binaryDeger = Integer.toBinaryString(sayi10);
        System.out.println(binaryDeger);


    }
}
