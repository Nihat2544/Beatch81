package Beach_80.src.day20_Arrays;

import java.util.Arrays;

public class C02_Arrays {


    public static void main(String[] args) {

        int sayilar []=new int[3];
        System.out.println(sayilar); //[I@48140564 (Stack 'teki referansi verir)
        // non primitive data turundeki datalari
        //her zaman yazdiramayabiliriz.(bazilari yazdirilabilir)
        // Array'i yazdirmak istersek java'daki Arrays clasindan yardim isteriz

        System.out.println(Arrays.toString(sayilar));//[0, 0, 0]

        sayilar[2]=10;
        sayilar[0]=5;
        sayilar[1]=3;

        System.out.println(sayilar);//[I@48140564
        System.out.println(Arrays.toString(sayilar));//[5, 3, 10] index'e gore siralama yapti

        String sinifList[]={"Ali","Ayse","Ahmet"};
        System.out.println(Arrays.toString(sinifList));//[Ali, Ayse, Ahmet]

        sinifList[1]="Hasan";
        sinifList[2]="Emre";
        sinifList[0]="Veli";
        System.out.println(Arrays.toString(sinifList));//[Veli, Hasan, Emre]
        //length degistirilemez!
        System.out.println(sinifList[1]);//Hasan
        System.out.println(sinifList[2]);//Emre



    }
}
