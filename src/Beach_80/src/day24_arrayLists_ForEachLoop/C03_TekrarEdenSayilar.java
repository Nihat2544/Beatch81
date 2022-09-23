package Beach_80.src.day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class C03_TekrarEdenSayilar {

    public static void main(String[] args) {

        // Soru 1) Verilen bir array’deki tekrar eden elementleri yazdirin.

           int[] arr ={2,3,5,6,3,5,4,1,9,6,3,5,5};

           Arrays.sort(arr);
           System.out.println(Arrays.toString(arr)); // [1, 2, 3, 3, 3, 4, 5, 5, 5, 5, 6, 6, 9]
           List<Integer> tekrarEdenler= new ArrayList<>();

           for (int i = 0; i < arr.length-1 ; i++) {
               if (arr[i]==arr[i+1] && !tekrarEdenler.contains(arr[i])){
                   System.out.print(arr[i]+ " ");
                   tekrarEdenler.add(arr[i]);
               }
           }

        System.out.println(" ");
        int[] arr1 = {2, 3, 4, 2, 4, 5, 6, 71, 4, 9};
        Arrays.sort(arr1);
        System.out.println("arr1 = " + Arrays.toString(arr1)); //[2, 2, 3, 4, 4, 4, 5, 6, 9, 71]
        List<Integer> tekYaz = new ArrayList<>();


    //    for (int i = 0; i < arr1.length - 1; i++) {
    //        if (arr1[i] == arr1[i+1] && !tekYaz.contains(arr1[i])) ;
    //        System.out.print(arr1[i] + " ");
    //        tekYaz.add(arr1[i]);
//
//
    //    }
    }
}
