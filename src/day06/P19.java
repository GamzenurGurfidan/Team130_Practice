package day06;

import java.util.ArrayList;
import java.util.Scanner;

public class P19 {
    // Bir ArrayList oluşturun ve içine 3 adet renk ekleyin.
    // Daha sonra kullanıcıdan bir renk adı alın ve bu rengin
    // ArrayList'te olup olmadığını ekrana yazdırın.

    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("purple");
        colors.add("yellow");
        colors.add("blue");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir renk adi giriniz: ");
        String searchingColor = scanner.next();

        if (colors.contains(searchingColor.toLowerCase())){
            System.out.println("Aranan renk BULUNDU");
        } else {
            System.out.println("Aranan renk YOK");
        }

    }


}


