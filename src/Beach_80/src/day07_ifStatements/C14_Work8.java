package Beach_80.src.day07_ifStatements;

import java.util.Scanner;

public class C14_Work8 {
    public static void main(String[] args) {
     /*
     Kullanıcıdan maaş için bir teklif isteyin ve asagidaki degerlere gore
     cevap yazdırın:
     Teklif 80000'in üzerinde ise "Kabul ediyorum",
     60-80000 arasinda ise "Konusabiliriz",
     60000'nin altinda ise "Malesef kabul edemem" yazdirin
      */

        Scanner scan= new Scanner(System.in);
        System.out.println("Maaş teklifiniz nedir?");

        int maas= scan.nextInt();

        if(maas>=80000){
            System.out.println("Teklifinizi kabul ediyorum");

        } else if ((maas>=60000 && maas<80000)) {
            System.out.println("Teklifinizi konuşabiliriz");

        } else if (maas<60000) {
            System.out.println("Teklifinizi maalesef kabul edemem");

        }

    }
}
