package day07;

public class P01_Kisi {
    /*
        Öğretmen: Ad-Soyad,  kimlik No, yaş,
        Öğrenci: Ad-Soyad,  kimlik No, yaş,
     */

    private String firstName;
    private String surName;
    private String kimlikNo;
    private int age;

    public P01_Kisi(String firstName, String surName, String kimlikNo, int age) {
        this.firstName = firstName;
        this.surName = surName;
        this.kimlikNo = kimlikNo;
        this.age = age;
    }

    public P01_Kisi() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Kisi -->" +
                "firstName: " + firstName + '\'' +
                ", surName: " + surName + '\'' +
                ", kimlikNo: " + kimlikNo + '\'' +
                ", age: " + age ;
    }
}
