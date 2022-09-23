package Beach_80.src.lambda_functional_programing01;

import java.util.ArrayList;
import java.util.List;

public class Fp02 {

    /*
    1) t-> "Logic", (t,u)-> "Logic"
    Bu yaniya "Lambda Expession"
    2) Functional Programming kapsaminda "Lambda Expession" kullanilabilir ama onerilmez.
       "Lambda Expession" yerine "Method Reference" tercih edilir
    3) "Method Reference" kullanimi "Class Name :: Method Name"

       Ayni  zamanda kendi class'larinizi da kullanabilirsiniz.
       Ornegin bir Animal class'inizi "eat()" methoduna sahip ==> "Animal ::eat"
     */
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);//[8, 9, 131, 10, 9, 10, 2, 8]
        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        ciftElemanlariYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdir(liste);
        System.out.println();
        tekrarsizTekElemanlarinKupunuYazdir(liste);
    }

    //1) Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran
    // bir method oluşturun.(Functional ve method reference)
    public static void listElemanlariniYazdirFunctional(List<Integer> list) {
        list.stream().forEach(Utils::ayniSatirdaBoslukIleYazdir);// 8 9 131 10 9 10 2 8
    }

    //2) Ardisik Cift sayi olan  list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void ciftElemanlariYazdirFunctional(List<Integer> list) {

        list.stream().filter(Utils::ciftElemanlariSec).forEach(Utils::ayniSatirdaBoslukIleYazdir);//8 10 10 2 8

    }

    //3)Ardışık tek list elemanlarinin karelerini  aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void tekElemanlarinKareleriniYazdir(List<Integer> list) {

        list.stream().filter(Utils::tekElemanlariSec).map(Utils::karesiniAl).forEach(Utils::ayniSatirdaBoslukIleYazdir);
        // 81 17161 81
    }

    //4) Ardışık tek list elemanlarının küplerini tekrarsız olarak aynı satırda
    // aralarında boşluk bırakarak yazdıran bir method oluşturun.
    public static void tekrarsizTekElemanlarinKupunuYazdir(List<Integer> list) {

        list.stream().distinct().filter(Utils::tekElemanlariSec)
                .map(Utils::kupleriniAl).forEach(Utils::ayniSatirdaBoslukIleYazdir);//729 2248091
    }
}
