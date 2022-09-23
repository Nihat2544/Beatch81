package Beach_80.src.day03_scanner;

import java.util.Scanner;

public class C13_Work5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Adınızı giriniz");
        String isminiz = scan.nextLine().toUpperCase();

        System.out.println("Soydınızı giriniz");
        String soyisminiz = scan.nextLine().toUpperCase();

        System.out.println("isminiz= "+ isminiz + "\nsoyisminiz = " + soyisminiz + "\nKursa katılımınız alınmıştır,"
                + "teşekkür ederiz");
    }
}
