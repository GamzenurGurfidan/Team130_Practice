package day05;

import java.util.Arrays;
import java.util.Scanner;

public class P11_Array {
    // kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini
    // kullanicidan alan ve girilen array elemanlarinin en buyuk ile en kucuk
    // elemaninin arasinki farki gosteren java programi yazin

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen Array'de olmasını istediginiz eleman sayısını giriniz");
        int sayi = scanner.nextInt();

        int arr[] = new int[sayi];

        for (int i = 0; i < arr.length ; i++) {

            System.out.println(i + 1 + ". elemanı giriniz:");
            int sayi2 = scanner.nextInt();
            arr[i] = sayi2;

        }
        Arrays.sort(arr); // oluşan arrayin sayisal siralamada olmama ihtimaline bianen naturak sıralama yaptık
        int arrMax = arr[arr.length-1];
        int arrMin = arr[0];
        System.out.println("Arraydeki en büyük eleman: " + arrMax
                        + "\nArraydeki en kücük eleman: " + arrMin
                        + "\nAralarındaki fark: " + (arrMax-arrMin));


    }
}
