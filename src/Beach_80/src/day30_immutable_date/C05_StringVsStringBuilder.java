package Beach_80.src.day30_immutable_date;

import java.time.LocalTime;

public class C05_StringVsStringBuilder {
    /*
    String mi yoksa StringBuilder mi daha hizlidir ?
     */
    public static void main(String[] args) {

     /*
     Bunun icin bir string olusturup, 1000 kere sonuna . ekleyelim
     oncesinde ve sonrasinda zamani alip aradaki farki bulalim

     ayni islemi StringBuilder icin de yapalim
      */

        LocalTime baslangic = LocalTime.now();

        String str = "Ahhhh Java";
        for (int i = 0; i < 1000; i++) {
            str +=".";
        }
        LocalTime bitis = LocalTime.now();

        System.out.println("bitis = " + bitis); // 19:23:08.752297
        System.out.println("bitis = " + bitis); // 19:23:11.787107

        System.out.println("String zaman : " + (bitis.getNano()-baslangic.getNano())); // 39896000


    }
}
