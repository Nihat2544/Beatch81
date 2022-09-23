package Beach_80.src.day26_constructor;

import Beach_80.src.day25_constructor.Car;


public class ArabaRunner {
    public static void main(String[] args) {
        // bir gun onceki car class'indan obje olusturalim
        /*
        Farkli bir package'daki bir class'dan obje olusturdugumuzda
        access modifier'lari da dikkate almaliyiz
         */
        Car car1 = new Car();
        System.out.println(car1.fiyat);

        /*
        Araba class'indan bir obje olusturdugumuzda
        eger default consrtuctor kullanildiysa
        tum ozellikler icin tek tek deger atamak zorunda kaliriz
         */

        Araba araba1= new Araba();
        araba1.fiyat = 10000;
        araba1.marka="Mercedes";
        araba1.yil=2010;
        araba1.model="C180";
        System.out.println("araba1 bilgileri\nMarka : " + araba1.marka + "\nModel :" + araba1.model +
                "\nFiyat :" + araba1.fiyat + "\nYil : " + araba1.yil);

        /*eger bir objeyi olustururken bazi ozelliklerini argument olarak
        belirtip o ozelliklerde bir obje olusturmak istersek java itiraz eder.
        Cunku her class'ta constructor vardir ama o a parametresizdir.
        bizim yeni ve parametreli constructor(lar)'a ihtiyacimiz var.
        */
        System.out.println(" ");
        Araba araba2= new Araba("BMW","5.20",2011,15000);
        System.out.println("araba2 bilgileri\nMarka : " + araba2.marka + "\nModel :" + araba2.model +
                "\nFiyat :" + araba2.fiyat + "\nYil : " + araba2.yil);

        System.out.println(" ");
        Araba araba3= new Araba("Opel","Astra",2015,78000);
        System.out.println("araba3 bilgileri\nMarka : " + araba3.marka + "\nModel :" + araba3.model +
                "\nFiyat :" + araba3.fiyat + "\nYil : " + araba3.yil);

        System.out.println(" ");
        Araba araba4= new Araba("Audi","A5",2020,50000);
        System.out.println("araba4 bilgileri\nMarka : " + araba4.marka + "\nModel :" + araba4.model +
                "\nFiyat :" + araba4.fiyat + "\nYil : " + araba4.yil);


    }
}
