package Beach_80.src.day33_encapculation;

public class ArabaRanner {
    public static void main(String[] args) {

        Araba arb1 = new Araba();
        // arb1 objesi üzerinden marka variable ina
        // ulasabildim, degistirebildim(yazma(set)) ve yazdirabildim(okuma(get))

        arb1.marka="Toyota";
        System.out.println(arb1.marka);// Toyota

        // access modiffer kullanarak marka variable ina ulasimi
        // tamamen serbest yapabilir veya tamamen engelleyebilirim
        // private yaptigimiz objeye hic ulasamayız
        // yani class modifier ya hep ya hic diyor

        // modeli degistirelim ama goremeyelim
        // yakiti da gorelim ama degistirmeyelim

        // set ve get yetkilerini ozel olarak tanimlamak isterseniz
        // 1.adim - ozel yetki tanimlayacaginiz variable'lari private yapin
        // private bir dataya baska class'lardan ulasmak mumkun olmadigindan
        //2.adim set yetkesi icin setter, get yetkisi icin getter methodlari olusturalim


       arb1.setModel("Corolla");// model olarak Supra yi atadik
        // modeli yazdirma imkanimiz yok, cunku getter method'u yok
        System.out.println(arb1.getYakit());//Elektrikli bilgisini yazdirabildik
        // yakiti degistiremeyiz cunku setter method'u yok

    }
}
