package Beach_80.src.day07_ifStatements;

import java.util.Scanner;

public class C14_Work7 {
    public static void main(String[] args) {
    /*
    Kullanıcıdan 100 üzerinden notunu isteyin. Not'u harf sistemine çevirip yazdırın.
    50'den kucukse "D", 50-60 arasi"C", 60-80 arası"B", 80'nin uzerinde ise "A"
     */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen 0-100 arasında notunuzu giriniz:");

        double Not= scan.nextDouble();

        if(Not<50 && Not>=0){
            System.out.println("Notunuz:" +"D");

        } else if ((Not>=50 && Not<60)) {
            System.out.println("Notunuz:" + "C");

        } else if ((Not>=60 && Not<80)) {
            System.out.println("Notunuz:" + "B");

        } else if ((Not>=80 && Not<=100)) {
            System.out.println("Notunuz:" +"A");

        } else {
            System.out.println("Geçerli bir not giriniz");

        }


    }
}
