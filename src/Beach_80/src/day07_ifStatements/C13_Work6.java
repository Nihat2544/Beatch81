package Beach_80.src.day07_ifStatements;

import java.util.Scanner;

public class C13_Work6 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan iki sayı isteyin;
        sayıların ikisi de pozitif ise sayıların toplamını,
        ikisi de negatif ise sayıların çarpımını,
        ikisi de farklı işaretli ise 'farklı işaretlerde işlem yapamazsın'
        sayılardan sıfıra eşit olan varsa 'sıfır carpmaya göre yutan
        elemandır'yazdırın
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen iki tamsayı giriniz:");

        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();

        if((sayi1>0 && sayi2>0)){
            System.out.println("Sayıların toplamı= "+ (sayi1+sayi2));

        } else if ((sayi1<0 && sayi2<0)) {
            System.out.println("Sayıların çarpımı= "+ (sayi1*sayi2));

        } else if ((sayi1<0 && sayi2>0) || (sayi1>0 && sayi2<0) ) {
            System.out.println("Farklı işaretlerde işlem yapamazsın");

        } else if ((sayi1==0 || sayi2==0)) {
            System.out.println("Sıfır çarpma işlemine göre yutan elemandır");

        }

    }
}
