package Beach_80.src.day24_TEKRARLAR;

import java.util.Scanner;

public class C13_SwitchCase {
    public static void main(String[] args) {
        /*
        Kullanıcıdan gun numarasini alıp
        1 ise pazartesi...
        7 ise pazar yazdıralım
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen kaçıncı gün olduğunu giriniz");
        int gunNo = scan.nextInt();
        /*
        switch yanına yazilan () neye gore case atayacagimizi gosterir
        Java girilen degere gore case'i bulur ve o satirdan calistirmaya baslar
        break yazisi gorunceye veya switch parantesine kadar yazar

        if- else if - ... -else yapisinda oldugu gibi
        hic bir sarta uymayanlar icin default keyword kullanılır
         */
    }
}
