package Beach_80.src.day19_Scope;

public class C01_InstanceVariables {
    /*
    Class icerisinde her yerden kullanmak istediginiz variable'lari
    class level'da(Class'in icinde ama method'larin disinda)
    genellikle class level variable'lar claas'in basinda olusturulur(sart degil)

    class level'daki variable'lar icin 2 scope vardir
    1- static variables(Class variable'lari da denir)
    2-instance (static olmayan) variables (obje variable'i da denir)
     */

    int instSayi=20; // static olmayip class level'da oldugu icin intance variable'dir

    public static void main(String[] args) {
        int sayi=10;
        /*System.out.println(instSayi);
        instance variables static olmadigi icin static clup'e uye main method'dan direk kullanamayiz
        instance variables'larin diger adi object variable'dir.
        dolayisiyla obje olusturursaniz instance variable'lari heryerden kullanabilirsiniz.
         */
        C01_InstanceVariables obje1=new C01_InstanceVariables();
        System.out.println("obje1 degiseden once :"+ obje1.instSayi); // 20
        obje1.instSayi=30;
        System.out.println("obje1 degistikten sonra :" + obje1.instSayi); // 30

        C01_InstanceVariables obje2=new C01_InstanceVariables();
        System.out.println("obje2 degiseden once :"+ obje2.instSayi); // 20
        obje2.instSayi=25;
        System.out.println("obje2 degistikten sonra :" + obje2.instSayi); // 25

        C01_InstanceVariables obje3=new C01_InstanceVariables();
        System.out.println("obje3 degiseden once :"+ obje3.instSayi); // 20
        /*
        Her obje olustugunda instance (obje) variable'inin ilk atanan degerini alir
         */



    }

    public static void staticMethod(){
       // System.out.println(sayi);
        /*
        Bir method'un icerisinde olusturulan variable sadece
        o method'un icinde kullanilabilir.(local variables)
         */
        /*
        instSayi=30;
        instance variable'lara main method disindaki static method'lardan da
        direk ulasamayiz
        obje olusturursak ulasabiliriz
        */
        C01_InstanceVariables obje4=new C01_InstanceVariables();
        System.out.println("obje4 degiseden once :"+ obje4.instSayi); // 20
    }

    public void staticOlmayanMethod(){

        System.out.println(instSayi);
        /*
        instance variable'lar class icerisindeki static olmayan
        method'larda direk kullanilabilir
         */
    }

}
