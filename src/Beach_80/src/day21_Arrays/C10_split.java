package Beach_80.src.day21_Arrays;

import java.util.Arrays;

public class C10_split {
    public static void main(String[] args) {
        /*
        split metodu bir array method'u degil string method'udur
        ama array dondurdugu icin bu konuda anlatiliyor

        split() ile herhangi bir String'i istedigimiz sekilde parcalara bolup
        bir array haline getiriyoruz.
         */
        String str="Java ne kadar guzel";
        String[] kelimeler= str.split(" "); // bosluklari bulup yok eder, geriye kalanlari virgulle siralar
        System.out.println(Arrays.toString(kelimeler)); // [Java, ne, kadar, guzel]

        String[] kelimelerNe= str.split("ne"); // ne bulup yok eder, geriye kalanlari virgulle siralar
        System.out.println(Arrays.toString(kelimelerNe)); // [Java,  kadar guzel]

        String[] kelimelerE= str.split("e"); // e bulup yok eder, geriye kalanlari virgulle siralar
        System.out.println(Arrays.toString(kelimelerE)); // [Java n,  kadar guz, l]

        String[] karakterler= str.split(""); // hiçlikleri bulup yok eder, geriye kalanlari virgulle siralar
        System.out.println(Arrays.toString(karakterler)); // [J, a, v, a,  , n, e,  , k, a, d, a, r,  , g, u, z, e, l]
    }
}
