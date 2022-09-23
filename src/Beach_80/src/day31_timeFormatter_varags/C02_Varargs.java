package Beach_80.src.day31_timeFormatter_varags;

public class C02_Varargs {
    // verilen 2 int'i toplayip sonucu yazdiran bir method olusturun

    public static void main(String[] args) {

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=40;

        toplaYazdir(sayi1,sayi2,sayi3,sayi4);


    }

    public static void toplaYazdir(int sayi1, int sayi2, int sayi3, int sayi4) {
        System.out.println("Verilwn dort sayinin toplami : " + (sayi1+sayi2+sayi3+sayi4));
    }

    public static void toplaYazdir(int sayi1, int sayi2, int sayi3) {

        System.out.println("Verilwn uc sayinin toplami : " + (sayi1+sayi2+sayi3));
    }

    public static void toplaYazdir(int sayi1, int sayi2) {

        System.out.println("Verilwn iki sayinin toplami : " + (sayi1+sayi2));




    }

}
