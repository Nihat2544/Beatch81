package Beach_80.src.day24_arrayLists_ForEachLoop;

import java.util.Arrays;
import java.util.List;

public class C01_ArraydenArrayListYapmak {
    public static void main(String[] args) {


        /*
        Uzun listeler olusturmamiz gerektiginde tek tek eklemek yerine
        array olusturup bunlari list'e cevirmek daha pratik olabilir
        1- loop ile array'deki tum elementleri list'e atabilirsiniz
        2- Arrays.asList() kullanabiliriz
            Ancak bu method'un 2 tane yan etkisi var
            - Arrays class'i kullanildigi icin array ozellikleri gecerli olur
            dolayisiyla list'te olan add,remove gibi size'i degistiren methodlar
            bu sekilde olusturan list'lerde kullanilamaz
            - Kaynak olan array ile urun olan list ozdeslestirilir. Birinde yapilan
            degisiklik otomatik olarak degierine de islenir
         */

        String[] arr = {"Ismail", "Nurullah", "Fatih"};
        List<String> sinifList = Arrays.asList(arr);
        System.out.println(sinifList);// [Ismail, Nurullah, Fatih]


        //1.yan etki
        //sinifList.add("Erdi"); // hata verir. UnsupportedOperationException
        //sinifList.remove(1); // UnsupportedOperationException

        //2.yan etki
        arr[1] = "Emre";
        System.out.println("degisim sonrasi array : " + Arrays.toString(arr));//[Ismail, Emre, Fatih]
        System.out.println("Array'i degistirince List : " + sinifList);//[Ismail, Emre, Fatih]

        sinifList.set(0,"Utku");
        System.out.println("List'i degistirince list : " + sinifList); //[Utku, Emre, Fatih]
        System.out.println("List'i degistirince array : " + Arrays.toString(arr));// [Utku, Emre, Fatih]




     }
}
