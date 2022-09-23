package Beach_80.src.day18_while_doWhileLoop;

import java.util.Scanner;

public class W06_WhileSoru6 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir tamsayi alin ve
        bu tamsayiyi tam bolen sayilari ve toplam
        kac tane oldugunu yazin
         */
        Scanner sc= new Scanner(System.in);
        System.out.print("Lutfen bir pozitif tamsayi giriniz :");
        int sayi=sc.nextInt();
        int tamBolen=1;
        int tamBolenSayisi=0;
        int temp=sayi;
        while(tamBolen<=temp){
            if(temp%tamBolen==0){
                System.out.println("Girilen sayiyi tam bolen sayilar = " + tamBolen );
                tamBolenSayisi++;

            }tamBolen++;

        }

        System.out.println(" ");
        System.out.print("Girilen sayinin tam bolen sayisi = " + tamBolenSayisi);


    }
}
