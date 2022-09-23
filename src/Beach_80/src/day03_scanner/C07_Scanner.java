package Beach_80.src.day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        // Bir önceki soruyu tek seferde kullanıcıdan tüm bilgileri alarak yapınız

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen ismnizi, soyisminizi ve yaşınızı giriniz \naralarda Enter tuşuna basınız");

        String isim = scan.nextLine();
        scan.nextLine();
        String soyisim = scan.nextLine();

        double yas = scan.nextDouble();

        System.out.println("girilen bilgier :"+" "+isim+", "+soyisim+", "+yas);
    }
}
