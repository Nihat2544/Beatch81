package Beach_80.src.day39_exception;

import java.util.Scanner;

public class C05_IllegalArgumentExceptions {
    public static void main(String[] args) {
/*
soru: Kullanicidan yasini girmesini isteyin. Kodunuzu kullanici
sifirdan kucuk bir sayi girerse Exception verecek sekilde yazin.
 */
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas= scan.nextInt();


        try {
            if (yas<0){
                throw new IllegalArgumentException();
            }else{
                System.out.println("Yasinizi : " + yas);
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.err.println("Yas negatif olamaz");

        }

    }
}
