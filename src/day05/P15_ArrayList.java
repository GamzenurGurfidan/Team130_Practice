package day05;

import java.util.ArrayList;
import java.util.List;

public class P15_ArrayList {
    /*
     * Input olarak verilen listteki isimlerden
     * icinde 'a' harfi bulunanlari silen bir program yaziniz
     *
     * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
     * OUTPUT : [Veli,Omer]
     */

    public static void main(String[] args) {
        List<String> input = new ArrayList<>();

        input.add("Ali");
        input.add("Veli");
        input.add("Ayse");
        input.add("Fatma");
        input.add("Omer");

        System.out.println(input);
        String istenmeyenHarf = "a";

        List<String> yeniList = new ArrayList<>();

        for (String a: input) {
            if (!a.toLowerCase().contains(istenmeyenHarf)){
                yeniList.add(a);
            }
        }
        System.out.println("Yeni oluşan List: " + yeniList);

    }
}
