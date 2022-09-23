package Beach_80.src.day05_matematikselislemler;

import java.util.Scanner;

public class C03_RakamlarToplamı {
    public static void main(String[] args) {

        System.out.println("Lütfen pozitif bir tamsayı giriniz: ");

        //Kullanıcıdan 4 bas.lı bir sayı alınız

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen 4 basamaklı pozitif bir tanmsayı giriniz: ");
        int sayi= scan.nextInt(); //5267

        int birlerBasamagı= 0;
        int rakamlarToplamı= 0;
        int ilkGirilenSayi = sayi;

        // şuanda sayımız 5267 bb=0, rt=0

        birlerBasamagı= sayi%10; //7
        rakamlarToplamı += birlerBasamagı;
        sayi/= 10;

        // şuanda sayı 526 bb=7, rt=7

        birlerBasamagı= sayi%10; //6
        rakamlarToplamı += birlerBasamagı; // rt=13
        sayi/= 10;

        //şuanda sayı 52 bb=6, rt=13

        birlerBasamagı= sayi%10; //2
        rakamlarToplamı += birlerBasamagı; //rt=13+2=15
        sayi/= 10;

        //şuanda sayı 5 bb=2 rt=15

        birlerBasamagı= sayi%10; //5
        rakamlarToplamı += birlerBasamagı; //rt=20
        sayi/= 10; //0

        //şuanda sayı=0 bb 5 rt 20

        System.out.println(ilkGirilenSayi + " sayisinin rakamlar Toplamı = " + rakamlarToplamı);








    }
}
