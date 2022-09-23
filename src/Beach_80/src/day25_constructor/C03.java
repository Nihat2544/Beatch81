package Beach_80.src.day25_constructor;

public class C03 {
    /*
    Proje olusturulurken bazi class'lar run etmek icin degil
    variable ve nethod olusturup
    bunlari baska class'lardan kullanmak icin olusturulur
     */
    /*
    Default constructor, parametresizdir
    goremesek bile ihtiyac oldugunda calistirir

    Class icerisinde parametreli veya parametresiz
    herhangi bir constructor olusturursak java
    default constructor'i siler.
     */

    C03(){

    }
    /*
    olusturdugumuz parametresiz bu constructor default
    constructor ile 1-1 aynidir ama biz olusturdugumuz icin
    buna default constructor demeyiz.
    parametresiz constructor deriz.
     */

    String isim = "Etka";
    public void method1 (){
        System.out.println("C03 method calisti");

        // burayi kaliphane gibi kullaniyoruz

    }
}
