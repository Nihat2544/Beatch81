package Beach_80.src.day36_inheritanceDataTypeKullanimi;

public class DIsci extends BMuhasebe {
    protected int saatUcreti = 11;
    protected int gunlukMesai = 7;

    protected void maasIsci() {
        System.out.println("Isciler : " + (30 * saatUcreti * gunlukMesai) + " maas alir");
    }


    protected void ozelSigortaIsci() {
        System.out.println("Isciler %70 indirimli ozel sigorta yaptırabilir");
    }


    public static void main(String[] args) {
         BMuhasebe isci1=new DIsci();

/*
          Bir obje olusturulurken
          Data turu ve constructor ayni class'dan ise
          direk o class'a gidiyorduk

          Eger data turu ve cons. farkli ise
          Obje constructor'in oldugu class'in objesidir
          ancak, bizden istenen
          Isci class'indaki spesifik ozellikler degil
          Bir iscinin muhasebe classindaki
          tum calisanlarla beraber sahip oldugu
          genel ozellikleri yazdirir
         */
        System.out.println(isci1.gunlukMesai);// Muhasebe 8
        System.out.println(isci1.saatUcreti);// Muhasebe 10
        isci1.maas();// Muhasebe Personem minimum : 2400 maas alir
        isci1.ozelSigorta();// Muhasebe Personel Isteyen Calisanlara %50 inidirim yapilir
        isci1.sigorta();// Tum personelimiz sigorta alir
        System.out.println(isci1.isim);// Personel
        System.out.println(isci1.soyisim);// Personel
        System.out.println(isci1.departman);// Personel

        APersonel isci2= new DIsci();

       // System.out.println(isci2.gunlukMesai);// Muhasebe 8
        //System.out.println(isci2.saatUcreti);// Muhasebe 10
       // isci2.maas();// Muhasebe Personem minimum : 2400 maas alir
       // isci2.ozelSigorta();// Muhasebe Personel Isteyen Calisanlara %50 inidirim yapilir
        isci2.maas();
       isci2.sigorta();// Personel  Tum personelimiz sigorta alir
        System.out.println(isci2.isim);// Personel
        System.out.println(isci2.soyisim);// Personel
        System.out.println(isci2.departman);// Personel
        /*
        Eger Data turu olan class'da aradigimiz ozellik yoksa
        varsa onun parent'ine gidebilir
        ama child'a donus olmaz
        Aradigi ozelligi bulamazsa CTE verir
         */




    }
}

