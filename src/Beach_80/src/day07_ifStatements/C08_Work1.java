package Beach_80.src.day07_ifStatements;

import java.util.Scanner;

public class C08_Work1 {
    public static void main(String[] args) {

        /*
        kullanıcıdan dikdörtgenin kenar uzunluklarını isteyin
        dikdörtgenin kare olup olmadığını yazdırın
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen dörtenin kenar uzunluklarını giriniz:");

        int kenar1= scan.nextInt();
        int kenar2= scan.nextInt();

        if (kenar1==kenar2 ){
            System.out.println("Bu dörtgen bir 'Kare'dir");
        } else{
            System.out.println("Bu dörtgen bir dikdörtgendir");
        }

    }
}
