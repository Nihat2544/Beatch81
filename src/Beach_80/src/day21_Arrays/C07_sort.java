package Beach_80.src.day21_Arrays;

import java.util.Arrays;

public class C07_sort {
    public static void main(String[] args) {


        int[] sayilar={5,7,1,5,4,3,9};

        // Array'i Arrays class'ini kullanarak sirali hale gertirebiliriz

        Arrays.sort(sayilar); //sort methodu siralama yapar

        System.out.println(Arrays.toString(sayilar)); // [1, 3, 4, 5, 5, 7, 9]


    }
}
