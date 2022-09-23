package Beach_80.src.day15_overloadingForLoop;

import java.util.Scanner;

public class C13_Work5 {
    public static void main(String[] args) {
        /*
        Soru5)
        Kullanicidan 100 den kucuk bir sayi isteyin
        1 den başlayarak 3 un veya 5 in kati olan sayilari girilen sayiya kadar yazdirin
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Lutfen 100 den kucuk bir tamsayi giriniz: ");
        int sayi = sc.nextInt();

        for (int i = 1; i <= sayi ; i++) {
            if(i%3==0 || i%5==0){
                System.out.println(i);
            }

        }
    }
}
