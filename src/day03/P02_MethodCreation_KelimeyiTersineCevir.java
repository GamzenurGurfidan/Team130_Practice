package day03;

public class P02_MethodCreation_KelimeyiTersineCevir {
    public static void main(String[] args) {
        // Soru: Kullanıcıdan bir cümle veya kelime girmesini isteyip
        // girilen degeri tersine yazdiran bir method olusturun

        String kelime = "Elma";

        System.out.println(tersCevir(kelime));
        System.out.println(tersCevir("Armut"));
        System.out.println(tersCevir("Cemile"));
        System.out.println(tersCevir("Ben bu cumleyi ters okumak istiyorum"));

    }

    private static String tersCevir(String word) {
        String bosKova = "";

        for (int i = word.length(); i > 0; i--) {

            bosKova += word.charAt(i - 1);
        }

        String reversedWord = bosKova;

        return reversedWord;
    }
}
