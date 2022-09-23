package Beach_80.src.day18_while_doWhileLoop;

import java.util.Scanner;

public class W03_WhileSoru3 {
    public static void main(String[] args) {
        /* Kullanicidan baslangic ve bitis degeri alin
        baslangic ve bitis degeri dahil aradaki tum cift sayilari
        while loop kullanarak ekrana yazdirin
        */

        Scanner sc= new Scanner(System.in);
        System.out.print("Lutfen baslangic icin bir tamsayi giriniz : ");
        int bas=sc.nextInt();
        System.out.print("Lutfen bitis icin bir tamsayi giriniz : ");
        int bitis=sc.nextInt();
        int sayi=bas;

        while(sayi<=bitis){
            if(sayi%2==0){
                System.out.print(sayi + " ");
            }sayi++;
        }
    }
}
