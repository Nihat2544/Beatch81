package Beach_80.src.day20_Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class C03_Length {
    public static void main(String[] args) {

        // iki sekilde Array olusturabiliriz
        int sayilar[]={1,2,3};

        String harfler[]=new String[4];

        System.out.println("sayilar array'inin uzunlugu : " + sayilar.length);// 3
        //String length method'unda () var, array'de yok

        System.out.println("harfler array'inin uzunlugu : " + harfler.length); // 4
        System.out.println(Arrays.toString(harfler)); //[null, null, null, null]

        //harfler array'inin son elementini yazdiralim
        System.out.println(harfler[harfler.length-1]);

        System.out.println(harfler[5]);//ArrayIndexOutOfBoundsException


    }
}
