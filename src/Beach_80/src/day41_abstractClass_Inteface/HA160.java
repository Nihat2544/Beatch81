package Beach_80.src.day41_abstractClass_Inteface;

import java.util.ArrayList;
import java.util.List;

public class HA160 extends FMercedes{
    /*
    Abstract parent silsilesinden gelen
    ilk concrete class parent'i olan tum class'lardaki
    abstract method'lari concrete hale donusturmek (override
    etmek) ZORUNDADİR

    B kuralin istisnasi
    parent class'lardan herhangi birinde
    concrete hale donusturulmus, abstract method'lardir
     */

    public static void main(String[] args) {
        HA160 arb1 = new HA160();
        // concrete bir class'dan istedgimiz objeyi urete biliriz

        FMercedes arb2 = new FMercedes();
        // Mercedes'de concrete

        // EToyota arb3 = new EToyota();
        EToyota arb4 = new GCorolla();
        // Abstract class'lar constructor barindirir ama obje uretemezler
        // Toyota class'i abstract class oldugundan obje uretilemez

        /*
        List<String> list1 = new List<String>() ;
        List<String> list2 = new ArrayList<>() ;

        Abstract bir class'in ozelliklerin tasiyan bir obje olusturmak istedgimizde
        Data turunu istedigimiz abstract class
        constructor'i ise child'i olan concrete bir class'dan seceriz
         */

    }
}
