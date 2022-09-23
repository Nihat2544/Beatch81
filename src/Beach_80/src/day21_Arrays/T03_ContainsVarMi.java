package Beach_80.src.day21_Arrays;

import java.util.Scanner;

public class T03_ContainsVarMi {
    /*
        Soru 3- Kullanicidan aldiginiz bir ismin, verilen array'de olup olmadigini
        kontrol edip, bize true veya false sonucu donen bir method olusturun.
         */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] isimler ={"Ayse", "Fatma", "Hayriye", "Ahmet", "Mahmut"};
        System.out.print("Listede aradiginiz ismi giriniz : ");
        String arananIsim = scan.nextLine();

        boolean sonuc= varMi(isimler,arananIsim);
        if(sonuc){
            System.out.println("Girilen isim listede VAR");
        }else
            System.out.println("Girilen isim listede YOK!");

    }

    public static boolean varMi(String[] isimler, String arananIsim) {
        boolean sonucMethod = false;
        for (int i = 0; i < isimler.length; i++) {
            if(isimler[i].equalsIgnoreCase(arananIsim)){
                sonucMethod=true;
            }

        }


        return sonucMethod;
    }


}
