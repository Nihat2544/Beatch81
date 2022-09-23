package Beach_80.src.day16_forLoop;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
        //Soru 10 ) Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki
        // tum tamsayilari toplayip, sonucu yazdiran bir program yaziniz

        Scanner sc= new Scanner(System.in);
        System.out.println("lutfen baslangic ve bitis degerlerini pozitif tamsayi olarak girin :");
        int bas=sc.nextInt();
        int bitis=sc.nextInt();

        aralariTopla(bas,bitis);


    }

    public static void aralariTopla(int bas, int bitis) {
        int toplam=0;
        if (bas <= bitis){
            for (int i = bas; i <=bitis ; i++) {
                toplam +=i ;
            }
        }else{
            for (int i = bitis ; i <= bas ; i++) {
                toplam += i;

            }

        }
        System.out.println("toplam = " + toplam);
    }
}
