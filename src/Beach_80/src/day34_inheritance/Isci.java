package Beach_80.src.day34_inheritance;

public class Isci extends Personel {
    /*
    Normal hayatimizda parent cocuk sahibi olmaya kara verebilir
    Java da ise child clss lar ozelliklerini inherit etmek istedikleri
    class i kendilerine parent edinirler.

    mesala isci class'ini olusturunca nelere ihtiyaci var diye dusunsek
    Personel class'in daki tum variable ve method lara ihtiyaci
    oldugunu gorebiliriz.
    Bu durumda yeniden o variable ve method'lari olusturmak yerine
    personel class'ini kendimize parent ediniriz

    Bir class'i parent  edinmek icin extends keyword kullanmaliyiz

    bir class baska bir class'i parent edindiginde
    1- parent class'daki tum ozelliklere(variable + method) otomatik olarak sahip olur
    2- parent class'daki ozelliklerden bazilarini kendine uyarlayabilir
    3- parent class'ini kendimize yeni ozellikler olusturabilir
    not: parent class'daki ozelliklerden hicbirini reddedemez ama
    degistirebilir.
     */
     int persNo=1001;
    public static void main(String[] args) {
       Isci isci1 = new Isci();
        System.out.println(isci1.isim);// Isim belirtilmedi
        // Kendi class'imizda yok onun icin parent'e gideriz
        isci1.isim="Nihat";
        System.out.println(isci1.persNo);// 1001 kendi class'imizda varsa onu kullanir

        isci1.maas();//Isciler minumum 15 euro saat ucreti alir

    }

    public void maas(){
        System.out.println("Isciler minumum 15 euro saat ucreti alir");

    }

    public void ozelSigorta(){
        System.out.println("Iscilerden isteyene %50 indirimli ozel sigorta yaptirilir");
    }
}
