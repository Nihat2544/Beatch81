package Beach_80.src.day03_scanner;

import java.util.Scanner;

public class C10_Work2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen karenin bir kenar uzunluğunu yazınız:");

        double kenar = scan.nextDouble();

        System.out.println("Karenin alanı : " + kenar*kenar);
        System.out.println("Karenin çevresi :" + 4*kenar);
    }
}
