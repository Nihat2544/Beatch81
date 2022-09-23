package Beach_80.src.day07_ifStatements;

import java.util.Scanner;

public class C09_Work2 {
    public static void main(String[] args) {

        /*
        kullanıcıdan üçgenin kenar uzunluklarını isteyin
        üçgenin eşkenar üçgen olup olmadığını yazdırın
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen üçgenin kenar uzunluklarını giriniz:");

        int kenar1= scan.nextInt();
        int kenar2= scan.nextInt();
        int kenar3= scan.nextInt();

        if ((kenar1==kenar2 || kenar1==kenar3 )){
            System.out.println("Bu üçgen bir 'Eşkenar üçgen'dir");
        } else{
            System.out.println("Bu üçgen bir eşkenar üçgen değildir");
        }

    }
}


