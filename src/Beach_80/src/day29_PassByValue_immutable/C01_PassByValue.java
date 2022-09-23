package Beach_80.src.day29_PassByValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C01_PassByValue {
    public static void main(String[] args) {
        /*
        4 elemanli bir array olusturalim
        sonra ayrı bir method'da bu array'in
        2. ve 4. elemanlarini 100' den kucuk sartgele
        bşr sayi ile degirtelim ve yeni halini
        yazdiralim
         */
        int[] arr={5,7,8,10};

        elemanDegistir(arr);

        System.out.println("maim method'un icinde diger meyhod calistiktan sonra : " + Arrays.toString(arr)); // [5, 39, 8, 45]

    }

    public static void elemanDegistir(int[] arr) {

        Random rnd = new Random();
        arr[1] = rnd.nextInt(100);
        arr[3] = rnd.nextInt(100);

        System.out.println(Arrays.toString(arr)); // [5, 39, 8, 45]
    }
}
