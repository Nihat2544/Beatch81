package Beach_80.src.day35_inheritancedaConstructorKullanimi;

public class GToyota extends EMuhasebe {

    GToyota(){
        //super(); extends olmadigi icin
        System.out.println("GToyota parametresiz cons");
    }
    GToyota(String isim){

        System.out.println("GToyota parametreli cons");
    }
}
