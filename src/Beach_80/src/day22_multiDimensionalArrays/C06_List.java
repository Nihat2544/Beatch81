package Beach_80.src.day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C06_List {
    public static void main(String[] args) {
        /*
        Array'i array yapan sembol [] idi
        arraylist'te ise <> diamond(elmas) kullaniriz
         */

        List<String> isimler = new ArrayList<>();
        System.out.println(isimler); // []

        // bir List'e eleman eklemek istersek
        isimler.add("Basak");

        System.out.println(isimler.add("Ayse")); // true doner
        /*
        String'de bir method calistirdigimizda
        assign yapmazsak String degismiyordu

        String isim="Suleyman";
        isim.toUpperCase(); // SULEYMAN (sadece bu satir icin yazar)
        sout(isim) --> Suleyman
         */
        System.out.println(isimler);//[Basak, Ayse]
        /*
        List'in tek kotu yonu Array alt yapisini kullandigi icin elemanlari birer birer eklemek zorunda
        olmamizdir
         */


    }
}
