package Beach_80.src.day06_concatenation;

import java.util.Scanner;

public class C01_Concatenation {
    public static void main(String[] args) {



        int sayi= 10;
        //primitive data türlerinin yanında method'lar olmaz
        //java bazi method'lari kullanabilmemiz icin
        //her bir primitive data turu icin bir wrapper class olusturmustur.

        String str= "Java ile hayat ne guzel";
        System.out.println(str.toUpperCase());

        boolean guzelMi= true;
        // guzelMi. boolean primitive oldugundan haır method'u bulunmuyor

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        String ogrNo="123456";

        //kullanıcıdan bir sifre isteyin
        //eger sifre sadece rakamlardan olusuyorsa kabul etmeyelım

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 5 basamaklı bir şifre giriniz");

        String sifre=scan.nextLine();

        Integer sifreSayi= Integer.parseInt(sifre);

        System.out.println("Girilen şifrenin 3 fazlası: " + (sifre+3));
        System.out.println("Integer sifre 3 fazlası : " + (sifreSayi+3));




    }
}
