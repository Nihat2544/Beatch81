package Beach_80.src.day15_overloadingForLoop;

public class C01_ReturnMethod {
    public static void main(String[] args) {
            // iki cesit method vardir.geri dondurmeden ve geri donduren

        /*
        verilen iki sayiyi carpıi sonucu bize donduren(return) bir method yazalim
         */

        int sayi1=10;
        int sayi2=5;


        int sonuc=carpGetir(sayi1,sayi2);




    }

    public static int carpGetir(int sayi1, int sayi2) {

        int sonuc = sayi1*sayi2;
        System.out.println("sonuc = " + sonuc);
        return sonuc;



    }


}
