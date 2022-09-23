package Beach_80.src.day28_staticBlock;

public class C03_PassByValue {
    public static void main(String[] args) {

        /*
        %25 indirimli fiyati hesaplayip bize donduren bir method olusturun
         */

        double satisfiyati = 100;
        double indirimOrani = 25;

        double indirimliFiyat = indirimliFiyatHesapla(satisfiyati,indirimOrani);
        System.out.println("indirimliFiyat = " + indirimliFiyat); // 75.0
        System.out.println("indirimliFiyat = " + indirimliFiyat); // 75.0
        System.out.println("indirimliFiyat = " + indirimliFiyat); // 75.0
        System.out.println("indirimliFiyat = " + indirimliFiyat); // 75.0

    }

    public static double indirimliFiyatHesapla(double satisfiyati, double indirimOrani) { //(double xyz) ne yazarsak yazalım java ustteki degeri getirir
        double indirimliFiyat = satisfiyati * (1-indirimOrani/100);


        return indirimliFiyat;
    }
}
