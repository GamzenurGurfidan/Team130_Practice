package sessionPractice;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        /*
            Kullanıcdan bir harf girmesini isteyiniz. O harften sonra gelen harfleri
            Girdiğiniz harf :
            Girdiğiniz harften sonraki  3 harf :
            şeklinde yazdırın.
        */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir harf giriniz:");
        char harf = scanner.next().charAt(0);

        System.out.println("girilen harf: " + harf);
        System.out.println("girilen harften 3 sonraki; " + (char) (harf + 1) + ", " + (char) (harf + 2) + ", " + (char) (harf + 3));

    }
}
