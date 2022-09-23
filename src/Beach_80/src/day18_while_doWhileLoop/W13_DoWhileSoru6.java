package Beach_80.src.day18_while_doWhileLoop;

import java.util.Scanner;

public class W13_DoWhileSoru6 {
    public static void main(String[] args) {
        /*
        Kullanicidan toplamak icin sayi isteyin ve toplam 500'e ulasana kadar
        devam ettirin. toplam 500'e ulastiginda veya gectiginde toplami
        ve kac sayi girildigini yazin
         */
        Scanner sc= new Scanner(System.in);
        int sayi=0;
        int girilenSayiAdedi=0;
        int toplam=0;

        do{
            System.out.println("Toplamak icin tamsayi giriniz");
            sayi = sc.nextInt();
            toplam+=sayi;
            girilenSayiAdedi++;
        }while(toplam<500);
        System.out.println("Girilen sayilarin toplami = " + toplam);
        System.out.println("girilenSayiAdedi = " + girilenSayiAdedi);
    }
}
