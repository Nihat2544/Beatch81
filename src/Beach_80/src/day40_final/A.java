package Beach_80.src.day40_final;

import org.w3c.dom.ls.LSOutput;

public class A {
    protected String isim="Cuneyt";
    final static String OKUL="Yildiz Koleji";
    /*
    Bir variable final olarak tanımlandiysa baska class'lardan veya
    icinde oludugumuz class'dan bu vairable'ye
    baska deger atanmasi mumkun degildir

    Madem ki dgeri degistirilemiyor
    genlede static'de yaparak bu variable
    ulasim kolaylastirilabilir
    ve genelde static final olarak belirlenen
    variable isimleri BUYUK HARFLE yazilir
     */

    final void finalMethod(){
        System.out.println("final method'lar override edilemez");
        /*
        bir method'u final olarak isaretlerseniz
        bu method degistirelemez demektir.
        (override edilemez)
         */
    }


}
