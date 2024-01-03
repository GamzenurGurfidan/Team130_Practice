package day07;

public class P02_Ogretmen extends P01_Kisi{

    // Öğretmen: Ad-Soyad,  kimlik No, yaş, bölüm, ve sicil No bilgileri içermelidir.
    
    private String bolum;
    private int sicilNo;

    public P02_Ogretmen(String firstName, String surName, String kimlikNo, int age, String bolum, int sicilNo) {
        super(firstName, surName, kimlikNo, age);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public P02_Ogretmen() {
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getsicilNo() {
        return sicilNo;
    }

    public void setsicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return "Ogretmen" + super.toString() +
                "bolum: " + bolum + '\'' +
                ", sicilNo: " + sicilNo ;
    }
}
