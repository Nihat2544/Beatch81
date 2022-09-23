package Beach_80.src.day15_overloadingForLoop;

import java.util.Scanner;

public class C12_Work4 {
    public static void main(String[] args) {

        /*
        Soru4)
        Kullanicidan 100 den kucuk bir sayi isteyin
        1 den başlayarak 3 un kati olan sayilari girilen sayiya kadar yazdirin
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Lutfen 100 den kucuk bir tamsayi giriniz: ");
        int sayi = sc.nextInt();

        if (sayi <= 0 || sayi >= 100) {
            System.out.println("Gecerli bir sayi giriniz");
        } else if(sayi%3 == 0) {
            for (int i = 1; i <= sayi; i++) {
                if(i%3==0){
                    System.out.print(i + ",");

                }
                    }
        }
    }
}