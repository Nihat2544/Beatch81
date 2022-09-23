package Beach_80.src.day21_Arrays;

import java.util.Arrays;

public class C05_ArrayeElementEkleme {

    public static void main(String[] args) {
        //Soru 5- Verilen bir array’e yeni bir element ekleyen method olusturun



        String[] sinifListesi= {"Ali Can", "Nida Yucedal", "Musa Yaman"};
        String eklenecekIsim="Emre Sulukan";

        sinifListesi=elemanEkle(sinifListesi,eklenecekIsim);
        System.out.println(Arrays.toString(sinifListesi));


    }

    public static String[] elemanEkle(String[] sinifListesi, String eklenecekIsim) {
        String[] yeniSinifListesi= new String[sinifListesi.length+1]; //[null, null, null, null]
        for (int i = 0; i < sinifListesi.length ; i++) {
            yeniSinifListesi[i]=sinifListesi[i];
            //eski listeden 1 eleman fazla uzunlukta yeni bir array olusturdum
        }
        // oncelikle eski listedeki tum elemanlari yeni listeye tasidim
        yeniSinifListesi[yeniSinifListesi.length-1]=eklenecekIsim;
        // son index'e ise eklenecek ismi atadim

        return yeniSinifListesi;
    }
}
