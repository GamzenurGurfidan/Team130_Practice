package sessionPractice;

import java.util.Scanner;

public class P09 {
    public static void main(String[] args) {
        //Kullanicidan IT alanini isteyerek
        // *  meslegi = qa ==> Quality Analyst
        //              dev ==> Developer
        //              ba ==> Busines Analyst
        //              pm ==> Project Manager

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen mesleğinizi giriniz  \n-qa -dev -ba -pm : " );
        String job = scanner.next();

        if (job.equalsIgnoreCase("qa")){
            System.out.println("Quality Analyst");
        } else if (job.equalsIgnoreCase("dev")) {
            System.out.println("Developer");
        } else if (job.equalsIgnoreCase("ba")) {
            System.out.println("Business Analyst");
        } else if (job.equalsIgnoreCase("pm")) {
            System.out.println("Project Manager");
        } else {
            System.out.println("sistemde bulunmamaktadır.");
        }

    }
}
