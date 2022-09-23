package Beach_80.src.day21_Arrays;

import java.util.Scanner;

public class D04_Nerelisin {
        /*
        Soru 4- Kullanicidan nereli oldugunu isteyin, verilen sehir verilen array'de olup olmadigini
        kontrol edip, bize true veya false sonucu donen bir method olusturun.
         */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nerelisin : ");
        String sehirAl = sc.next();
        String[] sehir = {"Tokat", "Ankara", "Edirne", "Sivas"};

        boolean sonuc = sehirVarMi(sehir, sehirAl);
        if (sonuc) {
            System.out.println("Nereli oldugun listede VAR");
        } else
            System.out.println("Nereli oldugun listede YOK");
    }

    public static boolean sehirVarMi(String[] sehir, String sehirAl) {
        boolean sonucMethod = false;
        for (int i = 0; i < sehir.length; i++) {
            if (sehir[i].equalsIgnoreCase(sehirAl)) {
                sonucMethod = true;

            }

        }
        return sonucMethod;
    }
}
