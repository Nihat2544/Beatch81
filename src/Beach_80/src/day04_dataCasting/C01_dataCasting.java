package Beach_80.src.day04_dataCasting;

import java.util.Scanner;

public class C01_dataCasting {
    public static void main(String[] args) {

        char harf = 'a';
        char yeniHarf = (char)(harf+1); // kod bu durumda önce sağdaki işlemi yapar.
                                // char yeniHarf = 97 + 1 ---> 98
                                // char bir variable 98 olamayacağı için java hata verir.

        System.out.println("yeniHarf = " + yeniHarf);

        /*
        Bazen bir variable'a oluştulurulduğu data türü dışından değer atanabilir.
        Bunların bazısını java otomatik olarak kabul eder.

        Java eğer bu değer atamasında sorun oluşacağını
        (data kayıplarının olabileceği veya datanın başkalaşabileceğini) gürürse bu durumda
        otomatik olarak bu atamayı kabul etmez.
        sizden eğer bu atamayı istiyorsanız sorumluluğu almanızı bekler
         */
        int sayi1 = (int)7.3;
        System.out.println("sayi1 = " + sayi1);
        double sayi2 = 10;
        System.out.println("sayi2 = " + sayi2); // 10.0
        int sayi3 = 'c';
        System.out.println("sayi3 = " + sayi3); // 99
        char harf2= 98;
        System.out.println("harf2 = " + harf2); // b

    }
}
