package Beach_80.src.day07_ifStatements;

import java.util.Scanner;

public class C07_ifElseIfStatements {
    public static void main(String[] args) {
        /*
        Bir önceki soruda kullanıcı negatif değer girerse uyaralım

        Not: birden fazla if-else if birbirine bağlanmışsa
        son durum onemlidir.
        eger else ile bitiyorsa butun ihtimaller kapsanıyor demektir.
        fakat else if ile bitiyorsa kapsanmayan durumlar olabilir.
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");

        int yas= scan.nextInt();

        if(yas<0){
            System.out.println("Lütfen geçerli bir yaş yazınız");
        } else if(yas<65){
            System.out.println("Emekli olamazsın, "+(65-yas)+" yıl daha çalışmalısın");
        } else {
            System.out.println("Emekli olabilirsin, OLEY:) ");
        }

    }
}
