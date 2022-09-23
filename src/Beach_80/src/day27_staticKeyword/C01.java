package Beach_80.src.day27_staticKeyword;

public class C01 {
    static int sayi =10;
    int rakam = 5;

    public static void main(String[] args) {

        /*
        class level'da iki tur variable olusturabiliriz
        static variable'larin diger adi class variable
        intance (obje) variable
        static variable'lar tum class'tan kullanilabilirken
        instance olanlar sadece static olmayan methodlarda direkt kullanilabilir
        instance variable'lara static method'dan ulasmak istersek
        obje olusturmamiz gerekir.

        iinstance variable'lar obje variable'i oldugu icin
        herhangi bir satirda instance variable'in degerinin
        ne oldugunu bulmak icin OBJE OLUSTURULAN SATIRDAN itibaren kod
        incelenmelidir.
        Static variable'lar class variable'i oldugu icin herhangi bir
        satirda static variabşe'in degerini bulmak icin CLASS'IN BASINDAN
        itibaren kod incelenmelidir

         */

        C01 obj1 = new C01();
        System.out.println("obj1'in rakam degeri : " + obj1.rakam);//5
        System.out.println("obj1'in sayi degeri : " + sayi); // 10. sayi static oldugu icin obj1 demedik
                                                            // 22.satira kadar baska bir deger atanmis mi diye bakariz
        obj1.rakam +=1; // 5+1=6
        sayi +=1; //10+1=11
        // 1 artirdiktan sonra
        System.out.println("obj1'in rakam degeri : " + obj1.rakam); //6
        System.out.println("obj1'in sayi degeri : " + sayi); // 11

        System.out.println("*******************************");
        C01 obj2 = new C01();
        System.out.println("obj2'in rakam degeri : " + obj2.rakam);// 5
        System.out.println("obj2'in sayi degeri : " + sayi); // obj2.sayi yazsakta olurdu. 11 yazacak


        obj2.rakam++;
        obj2.sayi++;
        // 1 artirdiktan sonra
        System.out.println("obj2'in rakam degeri : " + obj2.rakam); //6
        System.out.println("obj2'in sayi degeri : " + sayi); // 12



    }
}
