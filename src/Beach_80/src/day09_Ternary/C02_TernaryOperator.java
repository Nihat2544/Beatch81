package Beach_80.src.day09_Ternary;

import java.util.Scanner;

public class C02_TernaryOperator {
    public static void main(String[] args) {
        //Soru4 ) Kullanicidan bir sayi alin. Sayi pozitifse “Sayi pozitif” yazdirin,
        // negatifse  sayinin karesini yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        double sayi= scan.nextDouble();

        // eğer ternary icindeki sonuclar farli data turlerinde ise atama
        //yapamayız, sadece yazdirabiliriz
        //sayi>0 ? "Sayi pozitif" : (sayi*sayi);

        System.out.println(sayi>0 ? "Sayi pozitif" : (sayi*sayi));



    }
}
