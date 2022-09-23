package Beach_80.src.day15_overloadingForLoop;

public class C04_Overloading {
    public static void main(String[] args) {

        topla(5, 7);// 12
        topla(5.2, 3);// 8.2
        topla(3.4, 6.1);// 9.5
        topla(5,6.2);
    }
    /*
    Java hangi method'un calisacagina karar verirken optimizasyon yapar.
    Eger hic kest yapmadan kullanabilecegi bir method varsa onu kullanir.
    Eger cast yapmadan kullanacaği bir method yoksa bu defa da en az cast yaparak kullanabileceği
    method'u tercih eder.
     */

    public static void topla(int sayi1, int sayi2) {

        System.out.println("Iki integer'in toplami : " + (sayi1 + sayi2));


    }

    public static void topla(double sayi1, int sayi2) {

        System.out.println("Bir double ve bir integer'in toplami : " + (sayi1 + sayi2));

    }

    public static void topla(double sayi1, double sayi2) {

        System.out.println("Iki double'in toplami : " + (sayi1 + sayi2));

    }
}
