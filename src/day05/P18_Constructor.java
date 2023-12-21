package day05;

public class P18_Constructor {
    // musterinin bilgilerini atayacagımız variablelari olusturalım

    String clientFirstName ;
    String clientLastName;
    String clientMailAddress;
    String clientPhone;

    public P18_Constructor (){
        clientFirstName = "Gamze";
        clientLastName = "Gurfidan";
        clientMailAddress = "gamze@guclu.com";
        clientPhone = "90123456789";
    }
    public  P18_Constructor(String clientFirstName, String clientLastName, String clientMailAddress, String clientPhone){
        this.clientFirstName = clientFirstName;
        this.clientLastName = clientLastName;
        this.clientMailAddress = clientMailAddress;
        this.clientPhone = clientPhone;
    }

    public void bilgileriYazdir(){
        System.out.println("\tCLIENT INFO");
        System.out.println("-----------------");
        System.out.println("Full Name: " + clientFirstName + " " + clientLastName);
        System.out.println("E-Mail Address: " + clientMailAddress);
        System.out.println("Phone: " + clientPhone);
    }
}
