package Beach_80.src.day18_while_doWhileLoop;

import java.util.Scanner;

public class W07_WhileSoru7 {
    //kullanicidan bir tamsayi alın ve bu sayinin rakamlar toplamini bulun
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
        System.out.print("Lutfen bir tamsayi giriniz : ");
        int sayi=sc.nextInt();
        int toplam=0;
        int temp=sayi;

        while(temp>0){
            toplam+=temp%10;
            temp/=10;
        }
        System.out.println("Girilen sayinin rakamlar toplami : " + toplam);
    }
}
