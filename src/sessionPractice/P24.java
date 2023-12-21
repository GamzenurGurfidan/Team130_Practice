package sessionPractice;

import java.util.ArrayList;

public class P24 {
    public static void main(String[] args) {


        // Bir ArrayList oluşturun ve içine çeşitli ürün fiyatları ekleyin.
        // Bu fiyatların toplamını hesaplayarak ekrana yazdırın


        ArrayList<Double> prices = new ArrayList<>();
        prices.add(256.23);
        prices.add(120.00);
        prices.add(100.00);
        prices.add(97.27);
        prices.add(100.50);
        prices.add(200.00);
        prices.add(125.60);
        prices.add(100.40);

        double sum = 0;
        for (double price : prices) {
            sum += price;
        }

        System.out.println("Toplam = " + sum);


    }
}

