package Beach_80.src.day35_inheritancedaConstructorKullanimi;

import Beach_80.src.day35_inheritancedaConstructorKullanimi.AGrandParent;

public class BParent extends AGrandParent {

    protected String isim="Parent isim belirtilmedi";
    protected String parentKlupAdi="Parent Klubu";
    BParent(){
        System.out.println("Parent constructor calisti");
    }
}
