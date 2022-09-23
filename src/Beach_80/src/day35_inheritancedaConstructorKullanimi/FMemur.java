package Beach_80.src.day35_inheritancedaConstructorKullanimi;

public class FMemur extends EMuhasebe {
    /*
    Extends keyword kullanilan class'larda
    ister default constructor bulunsun
    istersek de biz yeni constructor (lar) olusturalim
    java canstructor'in ilk satirina
    super(); constructor call yazar

    super(); constructor call default constructor'a benzer
    gorunmesede orada vardir ve calisir
    ancak biz ilk satira farkli bir consturactur call yazarsak
    Java super(); constructor'ini siler

    Eger biz mudahale edip kendi constructor call'umuzu olusturmazi isek
    javanin default oralarak olusturdugu constructor call her zaman
    parametresiz dir
    super();
     */

    FMemur(){

        System.out.println("Memur parametresiz cons");
    }
    FMemur(String isim){

        System.out.println("Memur parametreli cons");
    }

    public static void main(String[] args) {

        FMemur mmr1= new FMemur("ali");

    }
}
