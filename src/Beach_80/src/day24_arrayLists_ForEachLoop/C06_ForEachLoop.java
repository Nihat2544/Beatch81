package Beach_80.src.day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_ForEachLoop {
    public static void main(String[] args) {

        int[] arr = {2,3,4,6,23,6,8,9,1};
        List<Integer> liste = new ArrayList<>();

        // array'deki tum elemanlari inceleyelim tek sayi olanlari liste atalim

        /*
         3 sey yaziyoruz
         1- Gelecekler hangi data turunden
         2- Gelecek olanlara loop icerisinde ne diyelim (each=her bir)
         3- Nereden aldigim
         */

        for (int each : arr //gelecek datalarin turu, loop icinde ne isim verdigim, nereden aldigim
             ) {
            if (each%2==1){
                liste.add(each);
            }
        }
        System.out.println(liste);

    }
}
