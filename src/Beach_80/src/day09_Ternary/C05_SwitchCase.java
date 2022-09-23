package Beach_80.src.day09_Ternary;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {
        /*
        Kullanıcıdan gun numarasini alıp
        1 ise pazartesi...
        7 ise pazar yazdıralım
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen kaçıncı gün olduğunu giriniz");
        int gunNo= scan.nextInt();
        /*
        switch yanına yazilan () neye gore case atayacagimizi gosterir
        Java girilen degere gore case'i bulur ve o satirdan calistirmaya baslar
        break yazisi gorunceye veya switch parantesine kadar yazar

        if- else if - ... -else yapisinda oldugu gibi
        hic bir sarta uymayanlar icin default keyword kullanılır
         */
        switch(gunNo){
            case 1 :
                System.out.println("Pazartesi");
                break;
            case 2 :
                System.out.println("Sali");
                break;
            case 3 :
                System.out.println("Carsamba");
                break;
            case 4 :
                System.out.println("Persembe");
                break;
            case 5 :
                System.out.println("Cuma");
                break;
            case 6 :
                System.out.println("Cumartesi");
                break;
            case 7 :
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Geçerli bir gün numarasi giriniz");
        }

    }
}
