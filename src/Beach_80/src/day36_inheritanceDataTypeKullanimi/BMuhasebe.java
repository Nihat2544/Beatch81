package Beach_80.src.day36_inheritanceDataTypeKullanimi;

public class BMuhasebe extends APersonel {

    protected int saatUcreti=10;
    protected int gunlukMesai=8;

    protected void maas(){
        System.out.println("Personem minimum : " + (30*gunlukMesai*saatUcreti)
        + " maas alir");
    }
    protected void ozelSigorta(){
        System.out.println("Isteyen Calisanlara %50 inidirim yapilir");
    }
}
