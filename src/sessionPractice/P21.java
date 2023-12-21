package sessionPractice;

import java.util.Scanner;

public class P21 {
    // Kullanicidan aldiginiz bir string icinde en cok tekrar eden karakteri yazdiriniz

    public static void main(String[] args) {
        // String input = JOptionPane.showInputDialog("Lütfen bir cümle yazınız");
        // System.out.println("input: " + input);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir cumle giriniz");
        String input = scanner.nextLine();


        String[] arr = input.split("");
        int count = 0;
        char enCokHarf = ' ';
        int enCok = 0;

        for (String s : arr) {
            for (String string : arr) {

                if (s.contains(string)) {
                    count++;
                }

            }

            if (count > enCok) {
                enCok = count;
                enCokHarf = s.charAt(0);
            }
            count = 0;
        }
        System.out.println(enCokHarf + " karakteri cumlede " + enCok+  " kez kullanılmıştır");


    }

}
