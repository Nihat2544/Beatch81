package Beach_80.src.day11_indexOf;

public class C02_lastIndexOf {
    public static void main(String[] args) {

        String cumle= "Java cok kolay, Java cok guzel";
        String kelime= "kolay";

        /*
        verilen kelimenin asagıdaki sartlardan uygun olanı yazan bir program yazınız
            -verilen kelime cumlede birden fazla kullanilmis
            -verilen kelime cumlede sadece 1 kere kullanilmis
            -verilen kelime cumlede birden fazla kullanilmis
         */

        int kelimeIlkIndex = cumle.indexOf(kelime);
        int kelimeSonIndex = cumle.lastIndexOf(kelime);

        if(kelimeIlkIndex == -1){
            System.out.println("verilen kelime cumlede kullanilmamis");
        }else if(kelimeIlkIndex==kelimeSonIndex){
            System.out.println("verilen kelime cumlede sadece 1 kere kullanilmistir");

        }else{
            System.out.println("verilen kelime cumlede birden fazla kullanilmis");
        }


    }
}
