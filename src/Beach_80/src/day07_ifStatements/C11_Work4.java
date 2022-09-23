package Beach_80.src.day07_ifStatements;

import java.util.Scanner;

public class C11_Work4 {
    public static void main(String[] args) {
/*
Kullanıcıdan gün isimlerinden birinin ilk harfini isteyin ve o harfle başlayan
gün isimlerini yazdırın.
 */
        Scanner scan= new Scanner(System.in);
        System.out.println("Haftanın günlerinden birinin ilk harfini giriniz =");

        char ilkHarf= scan.next().toUpperCase().charAt(0);

        if((ilkHarf== 'P')){
            System.out.println("Pazar, Pazartesi, Perşembe");
        } else if ((ilkHarf=='S')) {
            System.out.println("Sali");
        } else if ((ilkHarf=='C')) {
            System.out.println("Cuma, Cumartesi");
        } else{
            System.out.println("Çarşamba");
        }


    }
}
