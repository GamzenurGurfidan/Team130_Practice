package sessionPractice;

import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {

        // kullanıcıdan iki double sayi alin ve ilk sayi ikinci sayiya bölün
        // sonucu tam sayi yazdirin



        Scanner scanner = new Scanner(System.in);
        System.out.println("iki ondalıklı sayi giriniz");
        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();

        int bolum = (int)(sayi1/sayi2);

        System.out.println("birinci sayiyi ikinci sayıya bölünce sonuc: " + bolum);




    }
}
