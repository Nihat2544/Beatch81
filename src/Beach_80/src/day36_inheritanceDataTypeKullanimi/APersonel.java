package Beach_80.src.day36_inheritanceDataTypeKullanimi;

public class APersonel {

    protected String isim="Iisim belirtilmedi";
    protected String soyisim="Soyisim belirtilmedi";
    protected String departman="Departman belirtilmedi";

    protected void maas(){
        System.out.println("Tum personelimiz maas alir");
    }

    protected void sigorta(){
        System.out.println("Tum personelimiz sigorta alir");
    }
}
