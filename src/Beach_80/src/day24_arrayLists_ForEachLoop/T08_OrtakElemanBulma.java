package Beach_80.src.day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class T08_OrtakElemanBulma {
    public static void main(String[] args) {
         /*
        Soru 3:
        iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For
        each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
        Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz
         */

        String[] arr1 = {"Emre", "Ahmet", "Mahmut"};
        String[] arr2 = {"Emre", "David", "Ahmet"};

        List<String> ortak = new ArrayList<>();

        for (String each1 : arr1
             ) {
            for (String each2 : arr2
                 ) {
                if(each1.equalsIgnoreCase(each2));
            }

        }
    }
}
