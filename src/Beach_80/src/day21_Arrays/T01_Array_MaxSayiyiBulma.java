package Beach_80.src.day21_Arrays;

import java.util.Arrays;

public class T01_Array_MaxSayiyiBulma {
    //Soru 1- Verilen bir int array’deki en buyuk sayiyi yazdiran bir method olusturun.
    public static void main(String[] args) {

        int[] sayilar ={5,4,9,1,10,4};

        enBuyukSayi(sayilar);
    }

    public static void enBuyukSayi(int[] sayilar) {

        int enBuyukSayi = sayilar[0];

        for (int i = 0; i < sayilar.length; i++) {
            if(enBuyukSayi<sayilar[i]){
                enBuyukSayi=sayilar[i];
            }

        } System.out.println("Arraydeki en buyuk sayi: " + enBuyukSayi);
    }
}
