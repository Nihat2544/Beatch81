package Beach_80.src.day29_PassByValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C02_PassByValue {
    public static void main(String[] args) {
        /*
        birden fazla element iceren array ve array list gibi yapilarda
        passByValue gecerlidir.

        Eger method'da array veya listin kendisi degistirilirse passByValue
        ozelligi sebebi ile java degisen degeri degil array veya listin orijinal
        degerini alir.

        Ancak array veya list degistirilmeden sadece icindeki elemanlar degistirilirse
        Java obje degismedigi icin (referans ayni),
        ayni array veya list'i bize dondurur
        ancak icindeki elementler degismis olacaktir.
         */


        /*
        Verilen 4 elemanli bir array'i
        method'a gonderelim
        method'da yeni 3 elemanli bir array atayip
        bu yeni array'e rastgele 100 den kucuk 3
        sayi atayalim.
        meyhod'da array'i yazdiralim.

        main method da method call'dan sonra yeniden method'u yazdiralim
         */

        int[] arr = {3,5,8,10};

        arrayiDegistir(arr);
        System.out.println("Method call'dan sonra array : " + Arrays.toString(arr)); // [3, 5, 8, 10]
        System.out.println(arr); // ref : [I@22f71333


    }

    public static void arrayiDegistir(int[] arr) {

        arr= new int [3];
        Random rnd = new Random();
        arr[0] = rnd.nextInt(100);
        arr[1] = rnd.nextInt(100);
        arr[2] = rnd.nextInt(100);

        System.out.println("Method'da array : " + Arrays.toString(arr)); // [5, 81, 82]
        System.out.println(arr); // ref : [I@6cd8737
    }
}
