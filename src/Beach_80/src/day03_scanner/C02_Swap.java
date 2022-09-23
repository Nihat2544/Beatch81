package Beach_80.src.day03_scanner;

public class C02_Swap {
    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 0;

        //sayi 3 geçiçi kovamız
        // adım1- sayi2 'yi boş kovaya koyalım
        sayi3 = sayi2; // 10 20 20

        // adım2- 1.sayıyı 2.sayıya atayacagız.
        sayi2 = sayi1; // 10 10 20

        // adım3- boş kovadaki sayıyı sayı1 'e atayalım
        sayi1 = sayi3; // 20 10 20


        System.out.println("swap'dan sonra sayi1: " + sayi1);  // 20
        System.out.println("swap'dan sonra sayi1: " + sayi2);  // 10



    }

}
