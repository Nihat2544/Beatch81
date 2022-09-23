package Beach_80.src.day35_inheritancedaConstructorKullanimi;

public class Matematikciler extends LOgretmen {

    Matematikciler(){

        System.out.println("Matematik parametresiz cons");
    }
    Matematikciler(String isim){
        this();
        System.out.println("Matematik parametreli cons");
    }

    public static void main(String[] args) {
        Matematikciler obj1= new Matematikciler("Nihat");
    }
    /*
    this() constructor call icinde bulunulan class'daki constructor'lari
    supe() ise parent clcss'da bulunan constructorlari cagirir

    this() veya super() parametre yapisina uygun bir constructor bulamaz ise
    Java CTE verir

    constructor konusunde gordugumuz this.
    o class'daki instance variable'leri refere(isaret) ediyordu

    inheritance da da super. vardir.
    super. parent class'daki instance lari refere eder.
     */
}
