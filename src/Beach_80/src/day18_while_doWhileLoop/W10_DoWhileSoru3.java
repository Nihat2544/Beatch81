package Beach_80.src.day18_while_doWhileLoop;

import java.util.Scanner;

public class W10_DoWhileSoru3 {
    public static void main(String[] args) {
        /*
        Kullanicidan toplamak uzere pozitif sayilar isteyin,
        islemi bitirmek icin 0'a basmasini soyleyin
        Kullanici 0'a bastiginda toplam kac pozitif sayi girdigini,
        ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin
         */
        Scanner sc= new Scanner(System.in);
        int sayi=0;
        int pozSayiAdedi=0;
        int toplam=0;
        do{
            System.out.println("Lutfen toplamak uzere pozitif sayilar giriniz ");
            sayi=sc.nextInt();
            if(sayi>0){
                toplam +=sayi;
                sayi++;
                pozSayiAdedi++;
            }
        }while(sayi!=0);
        System.out.println("toplam = " + toplam);
        System.out.println("pozSayiAdedi = " + pozSayiAdedi);


    }
}
