package Beach_80.src.day42_abstractClass_interfaces;

public class KChildClassOfInterfaces implements I02_Interfaces, I03_Interfaces {

    /*
        Bir class'i bir inteface'e child yapmak icin implements keyword kullanilir
        implements dedikten sonra virgul yazarak istedgimiz kadar inteface ekleyebiliriz
         */
    public static void main(String[] args) {
        System.out.println(I03_Interfaces.SAYI);//20
        System.out.println(I02_Interfaces.SAYI);//30
        System.out.println(ISIM);// Yildiz Koleji
    }

}
