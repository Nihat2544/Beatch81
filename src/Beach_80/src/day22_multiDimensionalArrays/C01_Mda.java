package Beach_80.src.day22_multiDimensionalArrays;

import java.util.Arrays;

public class C01_Mda {
    public static void main(String[] args) {

        /* tek katli array'lerde array'i direk yazdiramiyoruz
        cunku array non-primitive data turudur ve
        her non-primitive data direk yazdirilamayabilir

        ancak array'in icerisindeki elementleri direk yazdirabiliriz
        cunku genelde primitive data turu yada string elementler kullaniliyordu.

        Multi-dimensional array'lerde en dikkat edecegimiz konu ulasmak istedigimiz
        elementin bir array mi yoksa primitive data mi oldugudur
         */

        int[][] sayilar= {{1,2,4,5},{3,4}};
        /*
        burada sayilar array'ini dusunursek icinde 2 tane inner array var
        sayilar[0] ==> [1,2,4,5]; [1] ==> [3,4]
         */
        System.out.println(sayilar[0]);//[I@48140564
        System.out.println(Arrays.toString(sayilar[0]));//[1, 2, 4, 5]

        System.out.println(sayilar[0][1]);//2 (1.elemandaki 1.index(2.eleman) i yazdirir
        System.out.println(sayilar[1][0]);//3 (2.elemandaki 0.index(1.eleman) i yazdirir

        System.out.println(Arrays.toString(sayilar));//[[I@48140564, [I@58ceff1]
        System.out.println(Arrays.deepToString(sayilar));//[[1, 2, 4, 5], [3, 4]]

        /*
        Array'i 2 sekilde declare edebiliyorduk
        1- elemanlari direk yazabiliriz
        int[][] sayilar= {{1,2,4,5},{3,4}};
        2- outer ve inner array'lerin uzunluklarini belirterek olusturabiliriz

        int[][] sayilar = new int [3][4];

        ancak 2.yontemle yaptigimizda inner array'lerin farkli uzunlukta olma ihtimali kalmaz
        bu ornek icin outer array'in 3 tane inner array'i vardir
        her bir inner array'in ise 4'er elemani olur

        Eger inner arrayleri farkli uzunluklarda olusturmak istiyorsaniz
        mecburen 1.yontemi kullanmalisiniz

         */


    }
}
