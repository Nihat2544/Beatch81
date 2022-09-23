package Beach_80.src.day21_Arrays;

import java.util.Scanner;

public class C03_Contains {
    public static void main(String[] args) {
        /*
        Soru 3- Kullanicidan aldiginiz bir ismin, verilen array'de olup olmadigini
        kontrol edip, bize true veya false sonucu donen bir method olusturun.
         */
        String[] isimler ={"Basak", "Nurullah", "Fetih", "Adem", "Enes"};
        Scanner scan= new Scanner(System.in);
        System.out.print("Aradiginiz ismi yaziniz :");
        String arananIsim=scan.nextLine();

        boolean sonuc= contains(isimler,arananIsim);
        if(sonuc){// true yada false oldugu icin tekrar atama yapmadik
            System.out.println("Girilen isim listede VAR");
        }else
            System.out.println("Girilen isim listede YOK");

    }

    public static boolean contains(String[] isimler, String arananIsim) {
        boolean sonucMethod=false;

        for (int i = 0; i < isimler.length; i++) {

            if(isimler[i].equalsIgnoreCase(arananIsim)){
                sonucMethod=true;
            }
        }


        return sonucMethod;
    }
}
