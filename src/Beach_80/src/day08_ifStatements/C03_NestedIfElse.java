package Beach_80.src.day08_ifStatements;

import java.util.Scanner;

public class C03_NestedIfElse {
    public static void main(String[] args) {
        /*
        emeklilik kontrolu yapan bir program yazınız
        cinsiyet olarak Erkek veya Kadın degiskenlerini kabul etsin.

        Farkli bir harf veya sembol girilirse hata mesajı versin.
        kadinlarda yas siniri 60, erkekler de 65 olsun

        negatif yas veya 80'den buyuk yas girilirse hata mesaji versin.
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz:");
        char cinsiyet=scan.next().toUpperCase().charAt(0);
        System.out.println("Yasınızı giriniz:");
        double yas= scan.nextDouble();

         if (cinsiyet== 'E'){
             if(yas<0 || yas>80){
                 System.out.println("Gecerli bir yas giriniz");
             } else if (yas<65){
                 System.out.println("Emekli olamazsiniz " + (65-yas)+ " yil daha calismalisiniz");
             }else{
                 System.out.println("Emekli olabilirsiniz,gozunuz aydin");
             }
         } else if (cinsiyet=='K') {
             if(yas<0 || yas>80){
                 System.out.println("Gecerli bir yas giriniz");
             } else if (yas<60){
                 System.out.println("Emekli olamazsiniz " + (60-yas)+ " yil daha calismalisiniz");
             }else{
                 System.out.println("Emekli olabilirsiniz,gozunuz aydin");
             }
         }

    }

}
