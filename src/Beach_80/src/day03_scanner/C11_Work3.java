package Beach_80.src.day03_scanner;

import java.util.Scanner;

public class C11_Work3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Yarıçap uzunluğunu giriniz: " );

        double yarıcap = scan.nextDouble();
        double pi = 3.14;
        System.out.println("Çemberin çevresi : "+ 2*pi*yarıcap);
        System.out.println("Dairenin alanı : "+ pi*yarıcap*yarıcap);


    }
}
