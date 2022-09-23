package Beach_80.src.day21_Arrays;

import java.util.Arrays;

public class C09_binarySearch {
    public static void main(String[] args) {
        /*
        binarySearch metodu siralanmis array'de aradigimiz elementin index'ini dondurur.

        Ya aradigimiz element array'de yoksa ?
        (Stirng de indexOf() bize olmayan elementler icin -1 donruyordu)

        Aradigimiz element array'de yoksa java herm olmadigini
        hemde olsaydi nerede olacagini bize dondurur
        olmadigini ifade icin - kullanir.
        olsaydi nerede olacagini belirtmek icin index degil siralama belirtir
         */

        int[] sayilar={3,7,15,4,27,10};

        Arrays.sort(sayilar); // siralama kalici olarak  degisir

        System.out.println(Arrays.toString(sayilar)); // [3, 4, 7, 10, 15, 27]

        System.out.println(Arrays.binarySearch(sayilar,4)); // 1

        System.out.println(Arrays.binarySearch(sayilar,15)); // 4

        System.out.println(Arrays.binarySearch(sayilar,11)); // -5

        System.out.println(Arrays.binarySearch(sayilar,6)); // -3

        System.out.println(Arrays.binarySearch(sayilar,-100)); // -1

        // varsa index yoksa siraya bakar


    }
}
