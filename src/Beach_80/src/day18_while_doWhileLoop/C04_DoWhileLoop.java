package Beach_80.src.day18_while_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan tam sayilar alin
        Kullanici cift sayi girdigi muddetce sayilari yazin
        Tek sayi girdiginde islemi bitirin
         */


        Scanner scan = new Scanner(System.in);
        int sayi = 0;//loop'a girmesi icin bu degeri atadik

        //while loop ile
        /*
        Loop'larda kullanacagimiz variable'lari onceden olusturmaliyiz.
        while loop'da, loop'tan once olusturdugumuz bu variable'a
        atayacagimiz degeri iyi dusunmemiz gerekiyor
         */

        while (sayi % 2 == 0) {

            System.out.println("Lutfen bir sayi giriniz ");
            sayi = scan.nextInt();
            if (sayi % 2 == 0) {
                System.out.println("Girilen sayi cifttir. ");
            } else System.out.println("Girilen sayi tektir.");

        }
    }

    //do while loop ile yapalim
    //do while loop'ta onceden olusturulan variable'a hangi deger
    //atandiginin hic bir onemi yoktur, kodumuz her durumda calisir

            /*
            do while'in dezavantaji : ilk calistirma kontrol yapilmadigindan oldugu icin
            loop'un body'sinde yanlis bir islem yapilmamasina dikkat etmeliyiz
             */

    //do{
    //    System.out.println("Lutfen bir sayi giriniz ");
    //    sayi = scan.nextInt();
    //    if (sayi % 2 == 0) {
    //        System.out.println("Girilen sayi cifttir. ");
    //    } else System.out.println("Girilen sayi tektir.");


    //}while(sayi%2==0);

}
