package Beach_80.src.day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        // kullanıcıdan ismini isteyip girilen ismi
        //isminiz : Emre      şeklinde yazdıralım

        // insanların dünyasından kod'larımızın bulunduğu class'a almak için
        // Scanner class'ini kullanırız.

        //1- Scanner objesi oluşturalım.

        Scanner scan = new Scanner(System.in);

        // 2- Kullanıcıya ne istediğimizi soyleyelım
        System.out.println("Lütfen isminizi giriniz");

        // 3- Oluşturduğumuz scan objesi ile kullanıcının girdiği değeri alıp
        // oluşturacağımız uygun bir variable'a atayalım.

        String kullaniciIsmi = scan.next();

        System.out.println("İsminiz: " + kullaniciIsmi);



    }
}
