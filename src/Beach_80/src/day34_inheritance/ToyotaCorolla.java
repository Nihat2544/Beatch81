package Beach_80.src.day34_inheritance;

public class ToyotaCorolla extends Toyota{

    public static void main(String[] args) {
        /*
        child class'dan parent class'a erisimde access modifier
        kurallarini bypass edemeyiz
        ornegin parint class'daki private class uyelerini
        child class'dan kullanamayiz
        ayni sekilde parent ve child farkli package'lerde ise
        parent class'daki default access modifier i olan
        class uyelerini child class'dan kullanamayiz.
         */

        ToyotaCorolla arb1 = new ToyotaCorolla();

        System.out.println(arb1.marka);// Toyota
        System.out.println(arb1.model);// Model belirtilmedi
    }

}
