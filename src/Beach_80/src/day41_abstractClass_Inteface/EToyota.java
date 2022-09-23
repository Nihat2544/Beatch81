package Beach_80.src.day41_abstractClass_Inteface;

public abstract class EToyota extends DAraba{


    @Override
    protected void motor() {
        System.out.println("Toyota arabalar cevreci motor kullanir");
    }
    /*
    parent class'daki standart belirleyici method'lar
    (abstract method)'larin tamami child class tarafindan
    override edilmelidir

    concrete method'larin override edilme mecburiyeti yoktur
    istersek override edebiliriz, istemezsek etmeyiz

    Aslinda Toyota class'i da obje uretecegimiz bir class degil
    bu durumuda eger proje tasarimi yapiyorsaniz
    Toyota class'ini da abstract yapmaniz guzel olur.
     */
}
