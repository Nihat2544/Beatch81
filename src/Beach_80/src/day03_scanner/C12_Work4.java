package Beach_80.src.day03_scanner;

import java.util.Scanner;

public class C12_Work4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Dikdörtgenler prizmasının "+ "\nuzunkenarını giriniz :"+  "\nkısakenarını giriniz:"+
                "\nyüksekliğini giriniz: ");

        double uzunKenar = scan.nextDouble();
        double kısaKenar = scan.nextDouble();
        double yukseklik = scan.nextDouble();

        System.out.println("Dikdörtgenler prizmasının hacmi:"+ uzunKenar*kısaKenar*yukseklik);
    }
}
