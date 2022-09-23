package Beach_80.src.day14_Method_Creation;

import java.util.Scanner;

public class C05_MethodCreationReturn {
    public static void main(String[] args) {
        /*
        Eger bir class'in icerisinde herhangi bir hesaplama yapip
        bunu da kalici halde saklamak istersek
        kodumuzu sade ve anlaşilir tutmak icin
        islemi bir method'a dondurebiliriz
        Return type'i void olmayan bir method'un sonucunu
        main method'da bir variable'a atama yaparsak
        programin geri kalaninda bu yeni degeri kullanma sansimiz olur
         */
        //kullanicidan sehir ismini ve dogum tarihini alin
        //bunlari programda kullanacagimiz formatta bize donduren bir method olusturun
        //sehir ismini programda buyuk harf olarak
        //tarihi ise 2022-06-30 seklinde kullanmak istiyoruz

        String sehir = sehirAl();
        String tarih = tarihAl();
        System.out.println("Girdiginiz sehir : "+ sehir);
        System.out.println("Girdiginiz tarih = " + tarih);
    }

    public static String tarihAl() {
        String tarih = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Yil giriniz");
        int yil = sc.nextInt();
        if (yil > 1900 && yil < 2100) {
            tarih = yil + "-";
        } else System.out.println("Gecerli bir yil giriniz (1900-2100) : ");
        System.out.print("Kacinci ay oldugunu tamsayi yaziniz");
        int ay = sc.nextInt();
        if (ay <= 0 || ay > 12) {
            System.out.print("Ay no 1-12 arasinda olmalidir");
        } else if (ay < 10) {
            tarih = tarih + "0" + ay + "-";
        } else {
            tarih = tarih + ay + "-";
        }
        System.out.print("Lutfen ayin kacinci gunu oldugunu tamsayi olarak giriniz : ");
        int gun = sc.nextInt();
        if (gun <= 0 || gun > 31) {
            System.out.print("Gun no olarak 1-31 arasında sayi girilmelidir ");
        } else if (gun < 10) {
            tarih = tarih + "0" + gun;
        } else {
            tarih = tarih + gun;
        }
        return tarih;

}


    public static String sehirAl() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Lutfen sehir adi giriniz: ");
        String sehirAdi=sc.next().toUpperCase();
        return sehirAdi;
    }

}
