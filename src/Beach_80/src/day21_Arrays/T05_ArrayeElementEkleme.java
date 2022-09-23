package Beach_80.src.day21_Arrays;

import java.util.Arrays;

public class T05_ArrayeElementEkleme {
    public static void main(String[] args) {
        //Soru 5- Verilen bir array’e yeni bir element ekleyen method olusturun

        String[] adlar ={"Asel", "Reyyan", "Hafsa", "Sitare"};
        String eklenecekAd = "Emre";

        adlar=adEkle(adlar,eklenecekAd);
        System.out.println(Arrays.toString(adlar));
    }

    public static String[] adEkle(String[] adlar, String eklenecekAd) {
        String[] yeniAdlar= new String[adlar.length+1];
        for (int i = 0; i < adlar.length; i++) {



        }

        return yeniAdlar;
    }
}
