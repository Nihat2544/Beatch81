package Beach_80.src.day10_charAt;

import java.util.Locale;

public class C02_toUpperCase_toLowerCase {
    public static void main(String[] args) {

        String str= "Beni psikopata baglamayin";

        System.out.println(str.toUpperCase()); //

        System.out.println(str.toUpperCase(Locale.forLanguageTag("En")));
        /*
        eger buyuk-kucuk harf donusumunde local bir dili esas almak isterseniz bu method kullanilabilir
         */


    }
}
