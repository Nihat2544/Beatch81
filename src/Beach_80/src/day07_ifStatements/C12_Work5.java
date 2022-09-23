package Beach_80.src.day07_ifStatements;

import java.util.Scanner;

public class C12_Work5 {
    public static void main(String[] args) {
        /*
        Kullanıcıodan bir gün isteyin eğer gün
        Cuma ise ekrana müslümanlar için kutsal gün,
        Cumartesi ise Yahudiler için kutsal gün,
        Pazar ise Hristiyanlar için kutsal gün yazdırın.
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir gün ismi giriniz:");

        String girilenGun= scan.next().toLowerCase();

        if(girilenGun.equals("Cuma")){
            System.out.println("Müslümanlar için kutsal gündür");
        } else if (girilenGun.equals("Cumartesi")) {
            System.out.println("Yahudiler için kutsal gündür");
        } else if(girilenGun.equals("Pazar")) {
            System.out.println("Hristiyanlar için kutsal gündür");
        }

    }
}
