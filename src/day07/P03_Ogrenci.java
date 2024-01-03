package day07;

public class P03_Ogrenci extends P01_Kisi {

    // Öğrenci: Ad-Soyad,  kimlik No, yaş, numara, sınıf bilgileri içermelidir.

    private int number;
    private int sinif;

    public P03_Ogrenci(String firstName, String surName, String kimlikNo, int age, int number, int sinif) {
        super(firstName, surName, kimlikNo, age);
        this.number = number;
        this.sinif = sinif;
    }

    public P03_Ogrenci() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSinif() {
        return sinif;
    }

    public void setSinif(int sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return "Ogrenci " + super.toString() +
                "number: " + number +
                ", sinif: " + sinif ;
    }
}
