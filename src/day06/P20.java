package day06;

import java.util.ArrayList;

public class P20 {
    // Bir ArrayList oluşturun ve içine 5 adet kelime ekleyin
    // Ardından bu kelimeleri tek bir cümle olarak birleştirerek ekrana yazdırın.

    // Cümle: Java çok güçlü bir dildir.

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("Java");
        words.add("çok");
        words.add("güçlü");
        words.add("bir");
        words.add("dildir");

        String sentence = String.join(" ",words); // join methodunda (delimeter,words)
        System.out.println(sentence);

        ArrayList<String> words1 = new ArrayList<>();

        words1.add("Selcuk");
        words1.add("Halil");
        words1.add("Gamze");
        words1.add("Sevket");
        words1.add("Eren");

        String sentence1 = String.join(", ",words1); 
        System.out.println(sentence1);




    }

}
