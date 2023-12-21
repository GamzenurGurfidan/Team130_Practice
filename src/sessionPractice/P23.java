package sessionPractice;

import javax.swing.*;

public class P23 {
    // 4x2'lik bir multidimension array oluşturun ve içine çeşitli şehir ve nüfus bilgileri ekleyin.
    // Daha sonra kullanıcıdan bir şehir adı alarak, bu şehrin nüfusunu ekrana yazdırın.
    public static void main(String[] args) {

        String cityData[][] = {
                {"İstanbul", "16000000", "Marmara"},
                {"Ankara", "5400000", "İç Anadolu"},
                {"İzmir", "2300000", "Ege"},
                {"Gaziantep", "980000", "Doğu Anadolu"},
                {"Kırıkkaler", "206000","İç Anadolu"},
                {"Adana", "1769000","Akdeniz"}
        };


        String searhCity = JOptionPane.showInputDialog("Sehir adi giriniz");

        String population = null;
        String region = null;

        for (int i = 0; i <cityData.length ; i++) {

            if (cityData[i][0].equalsIgnoreCase(searhCity)){
                population = cityData[i][1];
                region = cityData [i][2];
            }

        }
        if (population != null){
            System.out.println("Sehir: " + searhCity + "\nNufus: " + population + "\nBölgesi: " + region);
        }else {
            System.out.println("Aradıgnız sehir bulunamadı");
        }


    }
}
