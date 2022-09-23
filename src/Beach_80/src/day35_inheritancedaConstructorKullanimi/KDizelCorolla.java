package Beach_80.src.day35_inheritancedaConstructorKullanimi;

public class KDizelCorolla extends HCorolla{

    KDizelCorolla(){

        System.out.println("KDizelCorolla parametresiz cons");
    }
    KDizelCorolla(String isim){

        super((isim));
        System.out.println("kDizelCorolla parametreli cons");
    }

    public static void main(String[] args) {

        KDizelCorolla obj1= new KDizelCorolla("isim");

    }
}
