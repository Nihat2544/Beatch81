package Beach_80.src.day36_inheritanceDataTypeKullanimi;

class EYanHizmetliler extends BMuhasebe {
    protected int saatUcreti = 9;
    protected int gunlukMesai = 8;

    protected void maas() {
        System.out.println("Yan Hizmetliler : " + (30 * saatUcreti * gunlukMesai) + " maas alir");
    }

    protected void issizlikSigorta() {
        System.out.println("Yan Hizmetliler %30 indirimli ozel sigorta yaptırabilir");
    }

    public static void main(String[] args) {
        /*
       overriding chlid class'daki bir method'un
       parent class'daki ayni isimdeki methodu
       etkisiz hale getirirek
       kendisinin spesifik ozelligini ortaya cikarmasidir.

       Overriding'i nerede dikkate aliyoruz?
       bir obje olusturulurken
       data turu ve constructor farkli ise

       eger bir obje olusturulurken data turu ve constructor
       farkli ise objenin ozelliklerini belirlerken
       3 konuya dikkkat cekmekliyiz
       1- obje constructor'in oldugu class'da olusur
       2- objenin ozelliklerini aramaya data turunun oldugu
       class'dan baslariz
       bu class'da aranan ozellik bulunumazsa parent class'lara bakilir
       oradada bulazsak o zaman CTE verir.

       Eger aranan ozellik variable ise buldugumuz ilk degeri yazdiririz
       3- Aranan ozellik method ise
       degeri yazdirmadan once override edilmis mi diye
       kontrol etmemiz gerekir
       eger override edildiyse en guncel degeri yazdirir
         */

        BMuhasebe yh1= new EYanHizmetliler();
        System.out.println(yh1.gunlukMesai);// Muhasebe 8
        System.out.println(yh1.saatUcreti);// Muhasebe 10
        yh1.maas();// YH Yan Hizmetliler : 2160 maas alir
        yh1.ozelSigorta();// Muhasebe
        yh1.sigorta();// Personel
        System.out.println(yh1.isim);// Personel
        System.out.println(yh1.soyisim);// Personel
        System.out.println(yh1.departman);// Personel
       //  System.out.println(yh1.issizlikSigorta);
       // Aramaya muhasebeden basladigimizdan
        // issizliksigortasi bulamadik CTE
    }
}
