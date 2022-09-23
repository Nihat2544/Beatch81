package Beach_80.src.day03_scanner;

import java.util.Scanner;

public class C09_Work1 {
    public static void main(String[] args) {
        // Kullanıcıdan iki tamsayı alıp bu sayıların
        //toplam,fark ve çarpımlarını yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("İki tamsayı girin");

        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        System.out.println("Girilen sayıların toplamı:" + (sayi1+sayi2));
        System.out.println("Girilen sayıların farkı:" + (sayi1-sayi2));
        System.out.println("Girilen sayıların çarpımı:" + (sayi1*sayi2));

    }
}
