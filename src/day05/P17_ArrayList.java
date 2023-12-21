package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P17_ArrayList {
    // Bir öğretmenden girmek istediği kadar notu alınız, ve
    // ortalamayı geçen öğrenci sayısını bulunuz.
    public static void main(String[] args) {
        List<Double> not = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Not girişi için N tuşuna basınız");
        char devam = scanner.next().charAt(0);

        while (devam == 'N'){
            System.out.println("Lütfen notu giriniz");
            not.add(scanner.nextDouble());

            System.out.println("Yeni not girişi için N tuşuna basınız");
            devam = scanner.next().charAt(0);
        }
        System.out.println(not);

        double toplam = 0;


        for (int i = 0; i < not.size() ; i++) {
            toplam += not.get(i);
        }
        double ortalama = toplam/ not.size();
        System.out.println("Ortalama: " + ortalama);

        List<Double> gecenler = new ArrayList<>();
        for (int i = 0; i < not.size(); i++) {
            if (not.get(i)> ortalama){
                gecenler.add(not.get(i));
            }
        }
        System.out.println(gecenler);
    }
}
