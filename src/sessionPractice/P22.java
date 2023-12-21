package sessionPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class P22 {
    // Girilen desimal bir degeri binary degere ceviren methodu olusturunuz
    // desimal (decimal) = bünlük hayatta kullanımı 0123456789 rakamlarıyla ifade edilen 10'luk
    // tabandaki

    // binary = 0 ve 1 rakamlarından oluşan 2'lik tabandaki sayılar

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int input = scanner.nextInt();

        binaryCevir(input);

    }

    private static void binaryCevir(int sayi) {

        ArrayList<Integer> binary = new ArrayList<>();

        while (sayi >= 1) {
            binary.add(sayi % 2);
            sayi /= 2;
        }
        for (int i = binary.size() - 1; i >= 0; i--) {
            System.out.print(binary.get(i));

        }

    }
}
