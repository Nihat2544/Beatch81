package Beach_80.src.day18_while_doWhileLoop;

import java.util.Scanner;

public class W05_WhileSoru5 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir rakam alin ve bu rakam icin carpim
        tablosunu ekrana yazdirin. Kullanicinin hata yapmadigini
        kabul edin
         */
        Scanner sc= new Scanner(System.in);
        System.out.print("Lutfen bir rakam girin : ");
        int rakam=sc.nextInt();
        int temp=1;

        while(temp<=10){
            System.out.println( rakam + " * " + temp +  " = " + temp*rakam);
            temp++;
        }

    }
}
