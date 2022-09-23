package Beach_80.src.day19_Scope;

public class C02_StaticVariables {

    static int staticSayi=10;
    String isim="Mehmet";

    static int degersizStaticVar;
    int degersizInstanceVariable;
    /*
    Class level'daki variable'lara deger atamasak da Java kabul ediyor
     */


    public static void main(String[] args) {
        /*
        eger bir variable static olusturulduysa
        objeler icin degil class icin gecerlidir
         */
        System.out.println(staticSayi); // 10
        staticMethod();//22. satiri calistirip gelir
        staticSayi=12;
        System.out.println(staticSayi);// 12
        C02_StaticVariables obje1=new C02_StaticVariables();
        obje1.staticOlmayanMethod();//35.satira gider
        System.out.println(staticSayi);// 20(bastan itibaren takip edip kac yazdigini bulmamiz gerekiyor)
        /*
        instance bir variable'in degerini bulmak icin objenin olusturulmasindan itibaren
        istenen satira kadar kodu takip etmeliyiz

        Static variable da ise class'in en basindan baslayarak istenen
        satira kadar kodu takip edip static variable'in son degerini bulmamiz gerekir
         */
    }

    public static void staticMethod(){
        System.out.println(staticSayi);//10

    }

    public void staticOlmayanMethod(){
        /*
        Static variable'lar class icerisinden her yerden ulasilabilir
        static olsun yada olmasin tum method'lar static variable'lari gorebilir ve degistirebilirler
        farkli method'larda static variable'in hangi degerini alacagini bilmek istiyorsak class'in
        basindan itibaren kodun calısmasini takip etmeliyiz.
        method ne zaman cagirilirsa o anki static variable degerini method'da kullanabiliriz
         */
        System.out.println(staticSayi);//12
        staticSayi=20;




    }
}
