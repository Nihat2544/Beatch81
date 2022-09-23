package Beach_80.src.day29_PassByValue_immutable;

public class C04_immutable {
    public static void main(String[] args) {
        /*
        ımmutable : degistirilemez(susturulamaz)
        mutable   : degistirilebilir

        en mushur immutable class : String

         */

        String str = "Yildiz Bank";

        System.out.println(str.toUpperCase()); // YILDIZ BANK

        str.toLowerCase();

        System.out.println(str); //Yildiz Bank

        str.substring(3,5);// sout olmadigindan yazdirmaz, di

        System.out.println(str); //Yildiz Bank
        // String immutable oldugu icin degişmedi

        // Java'da string gibi metin ifadelerde kullanabilecegimiz
        // mutable StringBuilder class'i da vardir

        StringBuilder sb = new StringBuilder("Java Bank");
        System.out.println(sb); // Java Bank

        sb.reverse();
        System.out.println(sb); // knaB avaJ (eger String olsaydi yine Java Bank yazardi)

        sb.append(".");
        System.out.println(sb); // knaB avaJ.

    }
}
