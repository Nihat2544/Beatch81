package Beach_80.src.day18_while_doWhileLoop;

import java.util.Scanner;

public class D04_DoWhileLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan tam sayilar alin
        Kullanici cift sayi girdigi muddetce sayilari yazin
        Tek sayi girdiginde islemi bitirin
         */
        Scanner scan = new Scanner(System.in);
        int sayi = 0;

        //while(sayi%2==0){
        //    System.out.println("Lutfen bir tamsayi giriniz: ");
        //    sayi= scan.nextInt();
        //    if(sayi%2==0){
        //        System.out.println("Girilen sayi cifttir.");
        //    }else System.out.println("Girilen sayi tektir.");
//
        //}
//
        do{
            System.out.println("Lutfen bir tamsayi giriniz: ");
            sayi= scan.nextInt();
            if(sayi%2==0){
                System.out.println("Girilen sayi cifttir.");
            }else System.out.println("Girilen sayi tektir.");

        }while(sayi%2==0);

    }
}
