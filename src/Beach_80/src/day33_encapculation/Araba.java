package Beach_80.src.day33_encapculation;

public class Araba {

    String marka = "Marka belirtilmedi";// markanın access modifieri default access modifier
                                        // oldugundan ,package icerisinde kullanilabilir
    private String model = "Model belirtilmedi";
    private String yakit = "Elektrikli";// tum arabalar elektrikli ise bu variable in degistirilmemesi lazim
    // private yaptigimiz modem ve yakit variable larina erisimi yetkilenrelim
    // model e deger atanabilsin ama gorumsin(setter)
    // yakit ise gorulebilsin ama yeni deger atanamasin isteniyor(getter)
    //

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakit() {
        return yakit;
    }
}
