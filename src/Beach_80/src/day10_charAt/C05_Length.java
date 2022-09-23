package Beach_80.src.day10_charAt;

public class C05_Length {
    public static void main(String[] args) {
        String str= "Java ogren, isi kap";

        System.out.println(str.length()); // str ın karakter sayısını dondurur

        System.out.println(str.charAt(str.length()-1));// son karakterini yazdıralım

        System.out.println(str.charAt(str.length()-3));// sondan 3. karakteri yazdiralim

        /*
        Java'da null pointer (isaretleyici) bir deger değil,
        karsinda yazildigi variable' ın hic bir deger almadiginin isaretcisidir
         */

        String str2= ""; // str2'ye bir degderf atanmis midir EVET
                        // bu deger : hiclik

        String str3= null; // str3'e bir deger atanmis midir HAYIR
                          // null bu deger atamamayi isaret etmektedir

        System.out.println(str2.length());
        System.out.println(str3.length()); // bir deger atanmamis ki nasil uzunglugu olsun..
                                          // NullPointerException



    }
}
