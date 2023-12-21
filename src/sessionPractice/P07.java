package sessionPractice;

import java.util.Scanner;

public class P07 {
    public static void main(String[] args) {

        // Soru :
        // Kullanıcıdan alacağınız iki sayiyi yine kullanıcıya sectireceginiz
        // dort islemden biri ile isleme koyup sonucunu yazdırınız

        Scanner scanner = new Scanner( System.in);
        System.out.println("iki sayi giriniz: ");
        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();

        System.out.println("yapmak istediğiniz işlemi sembolle gösterin ");
        char islem = scanner.next().charAt(0);

        if (islem == '+'){ //if bir sart durumudur. bu sart icin gecerli olan işlem {} arasına yazılır
            System.out.println("islem sonucu: " + (sayi1 + sayi2));
        } else if (islem == '-') {
            System.out.println("islem sonucu: " + (sayi1 - sayi2));
        } else if (islem == '*') {
            System.out.println("islem sonucu: " + (sayi1 * sayi2));
        } else if (islem == '/') {
            System.out.println("islem sonucu: " + (sayi1 / sayi2));
        } else {
            System.out.println("Yanlış işlem sectiniz! Program Sonlanıyor. Benimle uğraşma");
        }

    }
}
