package Beach_80.src.day36_inheritanceDataTypeKullanimi;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CMemur extends BMuhasebe{
    protected int saatUcreti=12;
    protected int gunlukMesai=9;

    protected void maas(){
        System.out.println("Memurlar : " + ( 30*saatUcreti*gunlukMesai) + " maas alir");
    }

    protected void ozelSigorta(){
        System.out.println("Memurlar %50 indirimli ozel sigorta yaptırabilir");
    }

    public static void main(String[] args) {

        CMemur mmr1=new CMemur();
        System.out.println(mmr1.gunlukMesai);// 9
        System.out.println(mmr1.saatUcreti);// 12
        mmr1.maas();// Memurlar : 3240 maas alir
        mmr1.ozelSigorta();// Memurlar %50 indirimli ozel sigorta yaptırabilir
        mmr1.sigorta();// Personel Tum personelimiz sigorta alir
        System.out.println(mmr1.isim);// Personel
        System.out.println(mmr1.soyisim);// Personel
        System.out.println(mmr1.departman);// Personel

        BMuhasebe mhsb1=new BMuhasebe();
        /*
        Her ne kadar Memur class'inin icinde olsamda
        olusturdugumuz obje Muhasebe class'indan
        cunku data turu ve constructor BMuhasebe


        String str="Murat";
        ArrayList<Integer> list=new ArrayList<>();
        Integer sayi=20;
        BMuhasebe class'i da obje olusturulabilen bir class'dir yani
        data turudur.
         */
        System.out.println(mhsb1.gunlukMesai);// 8 Muhasebe
        System.out.println(mhsb1.saatUcreti);// 10 Muhasebe
        mhsb1.maas();// Muhasebe Personem minimum : 2400 maas alir
        mhsb1.ozelSigorta();// Muhasebe Isteyen Calisanlara %50 inidirim yapilir
        mhsb1.sigorta();// Personel Tum personelimiz sigorta alir
        System.out.println(mhsb1.isim);// Personel
        System.out.println(mhsb1.soyisim);// Personel
        System.out.println(mhsb1.departman);// Personel
    }
}
