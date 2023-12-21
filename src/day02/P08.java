package day02;

import java.util.Scanner;

public class P08 {
    public static void main(String[] args) {
         // bir sayi 3'e tam bölünüyorsa sayi 3'e bölünebilir yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi girniz");
        int sayi = scan.nextInt();

        if (sayi %3 == 0){
            System.out.println("girdiğiniz sayi 3 tam bölünüyor");
        }else {
            System.out.println("sayi 3'e bölünmez");
        }

    }
}
