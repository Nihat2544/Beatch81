package Beach_80.src.day42_abstractClass_interfaces;

import java.util.ArrayList;
import java.util.List;

public interface I02_Interfaces {

    int SAYI =30;
    String ISIM="Yildiz Koleji";
    /*
    Interface bir class degildir

    Abstract class'lar java'da abstraction(Soyutlastirma/ kural koyma)
    islevini yapiyordu
    Ancak abstract bir class'da abstract olmayan method'lar da olabilir
    bu da full abstraction yapmaya izin vermez

    Eger java'da icinde hic concrete method olmasin dedigimiz bir
    class olusturmak istiyorsaniz
    bunu class degil interface yapmalisiniz

    1- INTERFACE'LERDE CONCRETE METHOD OLMAZ
    2- Interface'lar full abstraction yaptigindan Interface'lerden obje olusturumaz

    Hatirladigimiz gibi Interface olan List'den direk obje olusturamiyorduk
    List<String> liste=new List<>(); calismaz
    Bunun yerine constructor'i List'in child'i olan ArrayList'den seceriz
    List<String> liste=new ArrayList<>();
    3- Class'larda bir child birden fazla parent edinemez
       Ancak Interface'lerde concrete method olmadigindan
       biz her method'u child class'da override etmek zorundayiz.
       Override ederken kimin soyledgini override ettigimizin onemi yok
    4- Interface'ler neyin yapilmasi gerektigini soyler
     ama nasil yapilacagina karismaz

     */

}
