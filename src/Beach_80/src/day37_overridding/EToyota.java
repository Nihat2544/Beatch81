package Beach_80.src.day37_overridding;

public class EToyota extends DAraba {

    void marka(){
        /*
        super.marka();
        eger hem overriden hemde overridding method'un calismasini
        istersek ilk satira super.marka() yazabiliriz
         */
        System.out.println("Markamiz Toyota");
    }
    void motor(){
        System.out.println("Toyota araclar Toyota marka motor kullanir");
    }
}
