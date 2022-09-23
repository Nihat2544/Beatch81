package Beach_80.src.day18_while_doWhileLoop;

import java.util.Scanner;

public class D06_DoWhileLoop {
    public static void main(String[] args) {

        /*
        Kullanicidan toplamak uzere pozitif sayilar isteyin,
        islemi bitirmek icin 0'a basmasini soyleyin
        Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin
        ve "Negatif sayi giremezsiniz" yazdirip basa donun
        Kullanici 0'a bastiginda toplam kac pozitif sayi girdigini,
        yanlislikla kac negatif sayi girdigini
        ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin
         */


        Scanner scan = new Scanner(System.in);
        int sayi=0;
        int pozSayilar=0;
        int negSayilar=0;
        int toplam=0;

        do{
            System.out.println("Lutfen toplama icin pozitif tamsayilar girin ");
            sayi=scan.nextInt();
            if(sayi>0){

                toplam+=sayi;
                pozSayilar++;
            }else if(sayi<0){
                System.out.println("Negatif sayi giremezsiniz");
                negSayilar++;

            }

        }while(sayi!=0);
        System.out.println(pozSayilar + " adet girilen pozitif sayilarin toplami = " + toplam);
        System.out.println(negSayilar + " adet negatif sayi girildi.");

    }
}
