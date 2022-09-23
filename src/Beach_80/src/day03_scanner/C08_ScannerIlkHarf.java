package Beach_80.src.day03_scanner;

import java.util.Locale;
import java.util.Scanner;

public class C08_ScannerIlkHarf {
    public static void main(String[] args) {
        // kullanıcıdan ismini alıp, ilk harfini buyuk harf olarak yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        /*
        java Scanner class'ında nextChar() metodu yoktur.
        Bunun yerine String olarak ilk kelimeyi alıp
        onun da iilk harfini alabiliriz.
         */
        char ilkHarf = scan.next().toUpperCase().charAt(0);

        System.out.println("İsmin ilk harfi : " + ilkHarf);


    }
}
