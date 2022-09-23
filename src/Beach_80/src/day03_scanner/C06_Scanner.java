package Beach_80.src.day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        //Kullanıcıdan ismini, soy ismini ve yaşını alıp
        //girilen bilgiler = emre sulukan 36 şeklinde yazdırın.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz");
        /*
        string verileri scanner ile alırken next ve nextLine() kullanılabilir.
        next () : Bir kelime alır. İlk boşluğa kadar alır.
        nextLine () : satır sonuna kadar ne yazarsak alır
        NOT : eğer ardarda birden fazla String deger alacaksak nextLine() kullanmalıyız.

         */
        String isim = scan.nextLine();

        System.out.println("Lütfen soyisminizi giriniz");

        String soyisim = scan.nextLine();

        System.out.println("Lütfen yaşınızı giriniz");

        // girilen bilgiler = Emre Sulukan 36 şeklinde yazdırın

        double yas = scan.nextDouble();

        System.out.println("girilen bilgiler = "+isim+" "+soyisim+" "+yas);


    }
}
